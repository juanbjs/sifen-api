package com.guaranitech.set.sifen_api.http.request.de;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.roshka.sifen.core.types.TiAfecIVA;

import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.Schema.RequiredMode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Schema(name = "IVAOperacion", description = "Campos que describen"
		+ " el IVA de la operación."
		+ " Obligatorio si el Tipo de Documento Electrónico = FACTURA_ELECTRONICA"
		+ " o FACTURA_ELECTRONICA_IMPORTACION"
		+ " o AUTOFACTURA_ELECTRONICA"
		+ " o NOTA_DE_CREDITO_ELECTRONICA.")
@Getter
@Setter
@ToString
public class TgCamIVA {

	@Schema(name = "afectacion_tributaria", description = "Campo iAfecIVA."
			+ " Forma de afectación"
			+ " tributaria del IVA.", requiredMode = RequiredMode.REQUIRED)
	@JsonProperty(value = "afectacion_tributaria")
	private TiAfecIVA iAfecIVA;

	@Schema(name = "proporcion_iva", description = "Campo dPropIVA."
			+ " Proporción gravada de"
			+ " IVA.", requiredMode = RequiredMode.REQUIRED)
	@JsonProperty(value = "proporcion_iva")
	private BigDecimal dPropIVA;

	@Schema(name = "tasa_iva", description = "Campo dTasaIVA."
			+ " Tasa del IVA.", requiredMode = RequiredMode.REQUIRED)
	@JsonProperty(value = "tasa_iva")
	private BigDecimal dTasaIVA;

	public com.roshka.sifen.core.fields.request.de.TgCamIVA convertToTgCamIVA() {

		com.roshka.sifen.core.fields.request.de.TgCamIVA gCamIVA = new com.roshka.sifen.core.fields.request.de.TgCamIVA();

		gCamIVA.setdPropIVA(dPropIVA);
		gCamIVA.setdTasaIVA(dTasaIVA);
		gCamIVA.setiAfecIVA(iAfecIVA);

		return gCamIVA;
	}

}
