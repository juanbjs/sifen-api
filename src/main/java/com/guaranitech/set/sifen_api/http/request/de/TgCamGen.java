package com.guaranitech.set.sifen_api.http.request.de;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.Schema.RequiredMode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Schema(name = "DatosComplementarios", description = "Campos de uso general.")
@Getter
@Setter
@ToString
public class TgCamGen {

	@Schema(name = "orden_compra", description = "Campo dOrdCompra."
			+ " Número de orden de compra.", requiredMode = RequiredMode.NOT_REQUIRED)
	@JsonProperty(value = "orden_compra")
	private String dOrdCompra;

	@Schema(name = "orden_venta", description = "Campo dOrdVta."
			+ " Número de orden de venta.", requiredMode = RequiredMode.NOT_REQUIRED)
	@JsonProperty(value = "orden_venta")
	private String dOrdVta;

	@Schema(name = "asiento_contable", description = "Campo dAsiento."
			+ " Número de asiento contable.", requiredMode = RequiredMode.NOT_REQUIRED)
	@JsonProperty(value = "asiento_contable")
	private String dAsiento;

	@JsonProperty(value = "campos_generales_carga")
	private TgCamCarg gCamCarg = new TgCamCarg();

	public com.roshka.sifen.core.fields.request.de.TgCamGen convertToTgCamGen() {

		com.roshka.sifen.core.fields.request.de.TgCamGen gCamGen = new com.roshka.sifen.core.fields.request.de.TgCamGen();

		gCamGen.setdAsiento(dAsiento);
		gCamGen.setdOrdCompra(dOrdCompra);
		gCamGen.setdOrdVta(dOrdVta);
		gCamGen.setgCamCarg(getGCamCarg().convertToTgCamCarg());

		return gCamGen;
	}

}
