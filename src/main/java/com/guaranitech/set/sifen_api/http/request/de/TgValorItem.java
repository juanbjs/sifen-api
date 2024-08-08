package com.guaranitech.set.sifen_api.http.request.de;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.Schema.RequiredMode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Schema(name = "ValorTotalItem", description = "Campos que describen"
		+ "los descuentos,"
		+ "anticipos valor total por"
		+ "ítem."
		+ " Obligatorio si el Tipo de Documento Electrónico = FACTURA_ELECTRONICA.")
@Getter
@Setter
@ToString
public class TgValorItem {

	@Schema(name = "precio_unitario", description = "Campo dPUniProSer."
			+ " Precio unitario del"
			+ " producto y/o servicio"
			+ " (incluidos impuestos).", requiredMode = RequiredMode.REQUIRED)
	@JsonProperty(value = "precio_unitario")
	private BigDecimal dPUniProSer;

	@Schema(name = "tipo_cambio", description = "Campo dTiCamIt."
			+ " Tipo de cambio por ítem.", requiredMode = RequiredMode.NOT_REQUIRED)
	@JsonProperty(value = "tipo_cambio")
	private BigDecimal dTiCamIt;

	@Schema(name = "total_bruto", description = "Campo dTotBruOpeItem."
			+ " Total bruto de la"
			+ " operación por ítem.", requiredMode = RequiredMode.REQUIRED)
	@JsonProperty(value = "total_bruto")
	private BigDecimal dTotBruOpeItem;

	@JsonProperty(value = "descuentos")
	private TgValorRestaItem gValorRestaItem;

	public com.roshka.sifen.core.fields.request.de.TgValorItem convertToTgValorItem() {

		com.roshka.sifen.core.fields.request.de.TgValorItem gValorItem = new com.roshka.sifen.core.fields.request.de.TgValorItem();

		gValorItem.setdPUniProSer(dPUniProSer);
		gValorItem.setdTiCamIt(dTiCamIt);
		gValorItem.setdTiCamIt(dTiCamIt);
		gValorItem.setgValorRestaItem(getGValorRestaItem().convertToTgValorRestaItem());

		return gValorItem;
	}

}
