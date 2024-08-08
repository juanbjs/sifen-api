package com.guaranitech.set.sifen_api.http.request.de;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class TgGrupSup {

	@JsonProperty(value = "nombre_cajero")
	private String dNomCaj;

	@JsonProperty(value = "efectivo")
	private BigDecimal dEfectivo;

	@JsonProperty(value = "vuelto")
	private BigDecimal dVuelto;

	@JsonProperty(value = "monto_donacion")
	private BigDecimal dDonac;

	@JsonProperty(value = "descripcion_donacion")
	private String dDesDonac;

	public com.roshka.sifen.core.fields.request.de.TgGrupSup convertToTgGrupSup() {

		com.roshka.sifen.core.fields.request.de.TgGrupSup gGrupSup = new com.roshka.sifen.core.fields.request.de.TgGrupSup();

		gGrupSup.setdDesDonac(dDesDonac);
		gGrupSup.setdDonac(dDonac);
		gGrupSup.setdEfectivo(dEfectivo);
		gGrupSup.setdNomCaj(dNomCaj);
		gGrupSup.setdVuelto(dVuelto);

		return gGrupSup;
	}

}