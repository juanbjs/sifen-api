package com.guaranitech.set.sifen_api.http.request.de;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.roshka.sifen.core.types.TiMotivTras;
import com.roshka.sifen.core.types.TiRespEmiNR;

import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.Schema.RequiredMode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Schema(name = "NotaRemision", description = "Campos que componen la Nota de Remisión Electrónica")
@Getter
@Setter
@ToString
/**
 * Campos de la nota de remisión electrónica
 */
public class TgCamNRE {

	@Schema(name = "motivo_emision", description = "Campo iMotEmiNR."
			+ " Motivo de emisión.", requiredMode = RequiredMode.REQUIRED)
	@JsonProperty(value = "motivo_emision")
	private TiMotivTras iMotEmiNR = TiMotivTras.TRASLADO_POR_VENTAS;

	@Schema(name = "responsable_emision", description = "Campo iRespEmiNR."
			+ " Responsable de la emisión de la Nota Remisión Electrónica.", requiredMode = RequiredMode.REQUIRED)
	@JsonProperty(value = "responsable_emision")
	private TiRespEmiNR iRespEmiNR = TiRespEmiNR.EMISOR_FACTURA;

	@Schema(name = "kilometros_estimados", description = "Campo dKmR."
			+ " Kilómetros estimados de recorrido .", requiredMode = RequiredMode.REQUIRED)
	@JsonProperty(value = "kilometros_estimados")
	private int dKmR;

	@Schema(name = "fecha_emision", description = "Campo dFecEm."
			+ " Fecha futura de emisión de la factura.", requiredMode = RequiredMode.REQUIRED)
	@JsonProperty(value = "fecha_emision")
	private LocalDate dFecEm;

	public com.roshka.sifen.core.fields.request.de.TgCamNRE convertToTgCamNRE() {

		com.roshka.sifen.core.fields.request.de.TgCamNRE gCamNRE = new com.roshka.sifen.core.fields.request.de.TgCamNRE();

		gCamNRE.setdFecEm(dFecEm);
		gCamNRE.setdKmR(dKmR);
		gCamNRE.setiMotEmiNR(iMotEmiNR);
		gCamNRE.setiRespEmiNR(iRespEmiNR);

		return gCamNRE;
	}

}