package com.guaranitech.set.sifen_api.http.request.de;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.roshka.sifen.core.types.PaisType;
import com.roshka.sifen.core.types.TcRelMerc;
import com.roshka.sifen.core.types.TcUniMed;

import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.Schema.RequiredMode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Schema(name = "ItemsOperacion", description = "Campos que describen los ítems"
		+ " de la operación")
@Getter
@Setter
@ToString
public class TgCamItem {

	@Schema(name = "codigo_interno", description = "Campo dCodInt."
			+ " Código interno."
			+ " Código interno de identificación de"
			+ " la mercadería o servicio de"
			+ " responsabilidad del emisor. No se"
			+ " pueden tener ítems distintos de"
			+ " mercadería o servicio con el mismo"
			+ " código interno en su catastro de"
			+ " productos o servicios. Este código"
			+ " se puede repetir en el DE siempre"
			+ " que el producto o servicio sea el mismo", requiredMode = RequiredMode.REQUIRED)
	@JsonProperty(value = "codigo_interno")
	private String dCodInt;

	@Schema(name = "partida_arancelaria", description = "Campo dParAranc."
			+ " Partida arancelaria.", requiredMode = RequiredMode.NOT_REQUIRED)
	@JsonProperty(value = "partida_arancelaria")
	private short dParAranc;

	@Schema(name = "partida_arancelaria", description = "Campo dNCM."
			+ " Nomenclatura común del"
			+ " Mercosur (NCM).", requiredMode = RequiredMode.NOT_REQUIRED)
	@JsonProperty(value = "ncm")
	private int dNCM;

	@Schema(name = "codigo_dncp_general", description = "Campo dDncpG."
			+ " Código DNCP – Nivel General .", requiredMode = RequiredMode.NOT_REQUIRED)
	@JsonProperty(value = "codigo_dncp_general")
	private String dDncpG = "0000";

	@Schema(name = "codigo_dncp_especifico", description = "Campo dDncpE."
			+ " Código DNCP – Nivel Especifico.", requiredMode = RequiredMode.NOT_REQUIRED)
	@JsonProperty(value = "codigo_dncp_especifico")
	private String dDncpE = "0000";

	@Schema(name = "codigo_dncp_producto", description = "Campo dGtin."
			+ " Código GTIN por producto.", requiredMode = RequiredMode.NOT_REQUIRED)
	@JsonProperty(value = "codigo_dncp_producto")
	private int dGtin;

	@Schema(name = "codigo_dncp_paquete", description = "Campo dGtinPq."
			+ " Código GTIN por paquete.", requiredMode = RequiredMode.NOT_REQUIRED)
	@JsonProperty(value = "codigo_dncp_paquete")
	private int dGtinPq;

	@Schema(name = "descripcion_producto", description = "Campo dDesProSer."
			+ " Descripción del producto y/o servicio .", requiredMode = RequiredMode.REQUIRED)
	@JsonProperty(value = "descripcion_producto")
	private String dDesProSer;

	@Schema(name = "unidad_medida", description = "Campo cUniMed."
			+ " Unidad de medida.", requiredMode = RequiredMode.REQUIRED)
	@JsonProperty(value = "unidad_medida")
	private TcUniMed cUniMed;

	@Schema(name = "cantidad", description = "Campo dCantProSer."
			+ " Cantidad del producto y/o servicio.", requiredMode = RequiredMode.REQUIRED)
	@JsonProperty(value = "cantidad")
	private BigDecimal dCantProSer;

	@Schema(name = "pais", description = "Campo cPaisOrig."
			+ " Código del país de origen del producto. https://es.wikipedia.org/wiki/ISO_3166-1#C%C3%B3digos_ISO_3166-1", requiredMode = RequiredMode.REQUIRED)
	@JsonProperty(value = "pais")
	private PaisType cPaisOrig;

	@Schema(name = "informacion_interes", description = "Campo dInfItem."
			+ " Información de interés"
			+ " del emisor con respecto"
			+ " al ítem .", requiredMode = RequiredMode.NOT_REQUIRED)
	@JsonProperty(value = "informacion_interes")
	private String dInfItem;

	@Schema(name = "codigo_relevancia", description = "Campo cRelMerc."
			+ " Código de datos de relevancia "
			+ " de las mercaderías.", requiredMode = RequiredMode.NOT_REQUIRED)
	@JsonProperty(value = "codigo_relevancia")
	private TcRelMerc cRelMerc;

	@Schema(name = "cantidad_quiebra", description = "Campo dCanQuiMer."
			+ " Cantidad de quiebra o merma."
			+ " Obligatorio si se informa E715"
			+ " Lo informado en este campo se"
			+ " encuentra en la unidad de medida"
			+ " elegida en E709"
			+ " Según RG 41/14", requiredMode = RequiredMode.NOT_REQUIRED)
	@JsonProperty(value = "cantidad_quiebra")
	private BigDecimal dCanQuiMer;

	@Schema(name = "porcentaje_quiebra", description = "Campo dPorQuiMer."
			+ " Porcentaje de quiebra o merma."
			+ " Cantidad de quiebra o merma."
			+ " Obligatorio si se informa E715"
			+ " Lo informado en este campo se"
			+ " encuentra en la unidad de medida"
			+ " elegida en E709"
			+ " Según RG 41/14", requiredMode = RequiredMode.NOT_REQUIRED)
	@JsonProperty(value = "porcentaje_quiebra")
	private BigDecimal dPorQuiMer;

	@Schema(name = "cdc_anticipo", description = "Campo dCDCAnticipo."
			+ " Porcentaje de quiebra o merma."
			+ " Obligatorio cuando se utilice una"
			+ " factura asociada con el tipo de"
			+ " transacción igual a Anticipo"
			+ " (D011 de la factura asociada"
			+ " igual a 9)", requiredMode = RequiredMode.NOT_REQUIRED)
	@JsonProperty(value = "cdc_anticipo")
	private String dCDCAnticipo;

	@JsonProperty(value = "valor_total_item")
	private TgValorItem gValorItem;

	@JsonProperty(value = "iva_operacion")
	private TgCamIVA gCamIVA;

	@JsonProperty(value = "rastreo_mercaderia")
	private TgRasMerc gRasMerc;

	@JsonProperty(value = "automotores_nuevos_usados")
	private TgVehNuevo gVehNuevo;

	public static List<com.roshka.sifen.core.fields.request.de.TgCamItem> convertToTgCamItem(
			List<TgCamItem> gCamItemList) {

		List<com.roshka.sifen.core.fields.request.de.TgCamItem> gCamItemLst = new ArrayList<>();

		for (TgCamItem varTgCamItem : gCamItemList) {
			com.roshka.sifen.core.fields.request.de.TgCamItem gCamItem = new com.roshka.sifen.core.fields.request.de.TgCamItem();

			gCamItem.setcPaisOrig(varTgCamItem.getCPaisOrig());
			gCamItem.setcRelMerc(varTgCamItem.getCRelMerc());
			gCamItem.setcUniMed(varTgCamItem.getCUniMed());
			gCamItem.setdCDCAnticipo(varTgCamItem.getDCDCAnticipo());
			gCamItem.setdCanQuiMer(varTgCamItem.getDCanQuiMer());
			gCamItem.setdCantProSer(varTgCamItem.getDCantProSer());
			gCamItem.setdCodInt(varTgCamItem.getDCodInt());
			gCamItem.setdDesProSer(varTgCamItem.getDDesProSer());
			gCamItem.setdGtin(varTgCamItem.getDGtin());
			gCamItem.setdGtinPq(varTgCamItem.getDGtinPq());
			gCamItem.setdInfItem(varTgCamItem.getDInfItem());
			gCamItem.setdNCM(varTgCamItem.getDNCM());
			gCamItem.setdParAranc(varTgCamItem.getDParAranc());
			gCamItem.setdPorQuiMer(varTgCamItem.getDPorQuiMer());

			if (varTgCamItem.getGValorItem() != null) {
				gCamItem.setgCamIVA(varTgCamItem.getGCamIVA().convertToTgCamIVA());
				gCamItem.setgValorItem(varTgCamItem.getGValorItem().convertToTgValorItem());
			}

			if (varTgCamItem.getGVehNuevo() != null)
				gCamItem.setgVehNuevo(varTgCamItem.getGVehNuevo().convertToTgVehNuevo());

			if (varTgCamItem.getGRasMerc() != null)
				gCamItem.setgRasMerc(varTgCamItem.getGRasMerc().convertToTgRasMerc());

			if (varTgCamItem.getDDncpE() != null)
				gCamItem.setdDncpE(varTgCamItem.getDDncpE());

			if (varTgCamItem.getDDncpG() != null)
				gCamItem.setdDncpG(varTgCamItem.getDDncpG());

			gCamItemLst.add(gCamItem);
		}

		return gCamItemLst;
	}

}
