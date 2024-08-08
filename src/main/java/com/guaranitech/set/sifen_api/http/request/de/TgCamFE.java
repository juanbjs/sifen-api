package com.guaranitech.set.sifen_api.http.request.de;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.roshka.sifen.core.types.TiIndPres;

import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.Schema.RequiredMode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Schema(name = "FacturaElectronica", description = "Campos que componen la FE."
		+ " Obligatorio si el Tipo de Documento Electrónico = FACTURA_ELECTRONICA.")
@Getter
@Setter
@ToString
public class TgCamFE {

	@Schema(name = "presencia", description = "Campo iIndPres."
			+ "Indicador de presencia.", requiredMode = RequiredMode.REQUIRED)
	@JsonProperty(value = "presencia")
	private TiIndPres iIndPres = TiIndPres.OPERACION_PRESENCIAL;

	@Schema(name = "fecha_traslado", description = "Campo dFecEmNR. "
					+ " Fecha futura del traslado de mercadería."
					+ " Fecha estimada para el traslado de la mercadería y "
					+ " emisión de la nota de remisión electrónica cuando"
					+ " corresponda. RG 41/14."
					+ " Fecha en el formato YYYY-MM-DD."
			, requiredMode = RequiredMode.NOT_REQUIRED)
	@JsonProperty(value = "fecha_traslado")
	@JsonFormat(pattern = "yyyy-MM-dd")
	private LocalDate dFecEmNR;

	@JsonProperty(value = "compras_publicas")
	private TgCompPub gCompPub;

	public com.roshka.sifen.core.fields.request.de.TgCamFE convertToTgCamFE() {

		com.roshka.sifen.core.fields.request.de.TgCamFE gCamFE = new com.roshka.sifen.core.fields.request.de.TgCamFE();

		gCamFE.setdFecEmNR(dFecEmNR);
		gCamFE.setiIndPres(iIndPres);
		gCamFE.setdDesIndPres(iIndPres.name());
		if(gCompPub != null)
			gCamFE.setgCompPub(getGCompPub().convertToTgCompPub());

		return gCamFE;
	}

}
