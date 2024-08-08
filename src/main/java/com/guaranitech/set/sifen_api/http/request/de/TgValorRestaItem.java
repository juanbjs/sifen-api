package com.guaranitech.set.sifen_api.http.request.de;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.Schema.RequiredMode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Schema(name = "Descuentos", description = "Campos que describen"
		+ " los descuentos,"
		+ " anticipos valor total por"
		+ " ítem.")
@Getter
@Setter
@ToString
public class TgValorRestaItem {

	@Schema(name = "descuento_item", description = "Campo dDescItem."
			+ " Descuento particular"
			+ " sobre el precio unitario"
			+ " por ítem (incluidos"
			+ " impuestos)."
			+ " Si no hay descuento por ítem"
			+ " completar con 0 (cero)", requiredMode = RequiredMode.NOT_REQUIRED)
	@JsonProperty(value = "descuento_item")
	private BigDecimal dDescItem;

	@Schema(name = "descuento_global", description = "Campo dDescGloItem."
			+ " Descuento global sobre"
			+ " el precio unitario por"
			+ " ítem (incluidos"
			+ " impuestos).", requiredMode = RequiredMode.NOT_REQUIRED)
	@JsonProperty(value = "descuento_global")
	private BigDecimal dDescGloItem;

	@Schema(name = "anticipo_particular_precio_unitario", description = "Campo dAntPreUniIt."
			+ " Anticipo particular"
			+ " sobre el precio unitario"
			+ " por ítem (incluidos"
			+ " impuestos).", requiredMode = RequiredMode.NOT_REQUIRED)
	@JsonProperty(value = "anticipo_particular_precio_unitario")
	private BigDecimal dAntPreUniIt;

	@Schema(name = "anticipo_global_precio_unitario", description = "Campo dAntGloPreUniIt."
			+ " Anticipo global sobre el"
			+ " precio unitario por ítem"
			+ " (incluidos impuestos).", requiredMode = RequiredMode.NOT_REQUIRED)
	@JsonProperty(value = "anticipo_global_precio_unitario")
	private BigDecimal dAntGloPreUniIt;

	public com.roshka.sifen.core.fields.request.de.TgValorRestaItem convertToTgValorRestaItem() {

		com.roshka.sifen.core.fields.request.de.TgValorRestaItem gValorRestaItem = new com.roshka.sifen.core.fields.request.de.TgValorRestaItem();

		gValorRestaItem.setdAntGloPreUniIt(dAntGloPreUniIt);
		gValorRestaItem.setdAntPreUniIt(dAntPreUniIt);
		gValorRestaItem.setdDescGloItem(dDescGloItem);
		gValorRestaItem.setdDescItem(dDescItem);

		return gValorRestaItem;
	}

}
