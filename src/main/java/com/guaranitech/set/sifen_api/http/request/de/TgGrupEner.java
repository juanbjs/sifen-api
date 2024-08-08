package com.guaranitech.set.sifen_api.http.request.de;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class TgGrupEner {

	@JsonProperty(value = "numero_medidor")
	private String dNroMed;

	@JsonProperty(value = "codigo_actividad")
	private short dActiv;

	@JsonProperty(value = "codigo_categoría")
	private String dCateg;

	@JsonProperty(value = "lectura_anterior")
	private BigDecimal dLecAnt;

	@JsonProperty(value = "lectura_actual")
	private BigDecimal dLecAct;

	@JsonProperty(value = "Consumo")
	private BigDecimal dConKwh;

	public com.roshka.sifen.core.fields.request.de.TgGrupEner convertToTgGrupEner() {

		com.roshka.sifen.core.fields.request.de.TgGrupEner gGrupEner = new com.roshka.sifen.core.fields.request.de.TgGrupEner();

		gGrupEner.setdActiv(dActiv);
		gGrupEner.setdCateg(dCateg);
		gGrupEner.setdConKwh(dConKwh);
		gGrupEner.setdLecAct(dLecAct);
		gGrupEner.setdLecAnt(dLecAnt);
		gGrupEner.setdNroMed(dNroMed);

		return gGrupEner;
	}

}
