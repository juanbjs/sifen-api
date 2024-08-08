package com.guaranitech.set.sifen_api.http.request.de;

import java.math.BigInteger;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.roshka.sifen.core.types.TdTipCons;
import com.roshka.sifen.core.types.TiTIpoDoc;
import com.roshka.sifen.core.types.TiTipDocAso;

import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.Schema.RequiredMode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Schema(name = "AsociacionDE", description = "Campos que identifican al DE asociado ."
		+ " Obligatorio si el Tipo de Documento Electrónico = AUTOFACTURA_ELECTRONICA o NOTA_DE_CREDITO_ELECTRONICA o NOTA_DE_DEBITO_ELECTRONICA.")
@Getter
@Setter
@ToString
public class TgCamDEAsoc {

	@Schema(name = "tipo_documento_asociado", description = "Campo iTipDocAso."
			+ "Tipo de documento asociado.", requiredMode = RequiredMode.REQUIRED)
	@JsonProperty(value = "tipo_documento_asociado")
	private TiTipDocAso iTipDocAso;

	@Schema(name = "cdc_referenciado", description = "Campo dCdCDERef."
			+ "CDC del DTE referenciado.", requiredMode = RequiredMode.REQUIRED)
	@JsonProperty(value = "cdc_referenciado")
	private String dCdCDERef;

	@Schema(name = "timbrado_documento_impreso", description = "Campo dNTimDI."
			+ "Nro. timbrado documento impreso de referencia. Obligatorio si tipo_documento_asociado = IMPRESO.", requiredMode = RequiredMode.REQUIRED)
	@JsonProperty(value = "timbrado_documento_impreso")
	private String dNTimDI;

	@Schema(name = "establecimiento", description = "Campo dEstDocAso."
			+ "Establecimiento. Obligatorio si tipo_documento_asociado = IMPRESO.", requiredMode = RequiredMode.REQUIRED)
	@JsonProperty(value = "establecimiento")
	private String dEstDocAso;

	@Schema(name = "punto_expedicion", description = "Campo dPExpDocAso."
			+ "Punto de expedición. Obligatorio si tipo_documento_asociado = IMPRESO.", requiredMode = RequiredMode.REQUIRED)
	@JsonProperty(value = "punto_expedicion")
	private String dPExpDocAso;

	@Schema(name = "numero_documento", description = "Campo dNumDocAso."
			+ "Número del documento. Obligatorio si tipo_documento_asociado = IMPRESO.", requiredMode = RequiredMode.REQUIRED)
	@JsonProperty(value = "numero_documento")
	private String dNumDocAso;

	@Schema(name = "tipo_documento_impreso", description = "Campo iTipoDocAso."
			+ "Tipo de documento impreso. Obligatorio si tipo_documento_asociado = IMPRESO.", requiredMode = RequiredMode.REQUIRED)
	@JsonProperty(value = "tipo_documento_impreso")
	private TiTIpoDoc iTipoDocAso;

	@Schema(name = "fecha_emision_documento_impreso", description = "Campo dFecEmiDI."
			+ "Fecha de emisión del documento impreso de referencia. Obligatorio si tipo_documento_asociado = IMPRESO.", requiredMode = RequiredMode.REQUIRED)
	@JsonProperty(value = "fecha_emision_documento_impreso")
	private LocalDate dFecEmiDI;

	@Schema(name = "numero_comprobante_retencion", description = "Campo dNumComRet."
			+ "Número de comprobante de retención. Obligatorio si FormaPago -> tipo_pago = RETENCION", requiredMode = RequiredMode.REQUIRED)
	@JsonProperty(value = "numero_comprobante_retencion")
	private String dNumComRet;

	@Schema(name = "numero_resolucion_credito_fiscal", description = "Campo dNumResCF."
			+ "Número de resolución de crédito fiscal. Obligatorio si datos_generales -> datos_operacion_comercial -> tipo_transaccion = VENTA_CREDITO_FISCAL", requiredMode = RequiredMode.REQUIRED)
	@JsonProperty(value = "numero_resolucion_credito_fiscal")
	private String dNumResCF;

	@Schema(name = "tipo_constancia", description = "Campo iTipCons."
			+ "Tipo de constancia. Obligatorio si tipo_documento_asociado = CONSTANCIA_ELECTRONICA.", requiredMode = RequiredMode.REQUIRED)
	@JsonProperty(value = "tipo_constancia")
	private TdTipCons iTipCons;

	@Schema(name = "numero_constancia", description = "Campo dNumCons."
			+ "Número de constancia. Obligatorio si tipo_documento_asociado = CONSTANCIA_ELECTRONICA.", requiredMode = RequiredMode.REQUIRED)
	@JsonProperty(value = "numero_constancia")
	private BigInteger dNumCons;

	@Schema(name = "numero_control_constancia", description = "Campo dNumControl."
			+ "Número de control de la constancia. Obligatorio si tipo_documento_asociado = CONSTANCIA_ELECTRONICA.", requiredMode = RequiredMode.REQUIRED)
	@JsonProperty(value = "numero_control_constancia")
	private String dNumControl;

	public static List<com.roshka.sifen.core.fields.request.de.TgCamDEAsoc> convertToTgCamDEAsoc(
			List<TgCamDEAsoc> gCamDEAsocList) {

		List<com.roshka.sifen.core.fields.request.de.TgCamDEAsoc> gCamDEAsocLst = new ArrayList<>();

		for (TgCamDEAsoc varTgCamDEAsoc : gCamDEAsocList) {
			com.roshka.sifen.core.fields.request.de.TgCamDEAsoc gCamDEAsoc = new com.roshka.sifen.core.fields.request.de.TgCamDEAsoc();

			gCamDEAsoc.setdCdCDERef(varTgCamDEAsoc.getDCdCDERef());
			gCamDEAsoc.setdEstDocAso(varTgCamDEAsoc.getDEstDocAso());
			gCamDEAsoc.setdFecEmiDI(varTgCamDEAsoc.getDFecEmiDI());
			gCamDEAsoc.setdNTimDI(varTgCamDEAsoc.getDNTimDI());
			gCamDEAsoc.setdNumComRet(varTgCamDEAsoc.getDNumComRet());
			gCamDEAsoc.setdNumCons(varTgCamDEAsoc.getDNumCons());
			gCamDEAsoc.setdNumControl(varTgCamDEAsoc.getDNumControl());
			gCamDEAsoc.setdNumDocAso(varTgCamDEAsoc.getDNumDocAso());
			gCamDEAsoc.setdNumResCF(varTgCamDEAsoc.getDNumResCF());
			gCamDEAsoc.setdPExpDocAso(varTgCamDEAsoc.getDPExpDocAso());
			gCamDEAsoc.setiTipCons(varTgCamDEAsoc.getITipCons());
			gCamDEAsoc.setiTipDocAso(varTgCamDEAsoc.getITipDocAso());

			gCamDEAsocLst.add(gCamDEAsoc);
		}

		return gCamDEAsocLst;
	}

}