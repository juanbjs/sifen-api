package com.guaranitech.set.sifen_api.http.request.de;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.roshka.sifen.core.types.TiDenTarj;
import com.roshka.sifen.core.types.TiForProPa;

import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.Schema.RequiredMode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Schema(name = "OperacionTarjeta", description = "Campos que describen el pago o entrega"
		+ " inicial de la operación con"
		+ " tarjeta de crédito/débito."
		+ " Obligatorio si tipo_pago = TARJETA_DE_CREDITO o TARJETA_DE_DEBITO")
@Getter
@Setter
@ToString
public class TgPagTarCD {

	@Schema(name = "denominacion", description = "Campo iDenTarj."
			+ " Denominación de la tarjeta.", requiredMode = RequiredMode.REQUIRED)
	@JsonProperty(value = "denominacion")
	private TiDenTarj iDenTarj;

	@Schema(name = "razon_social_procesadora", description = "Campo dRSProTar."
			+ " Razón social de la procesadora de tarjeta.", requiredMode = RequiredMode.NOT_REQUIRED)
	@JsonProperty(value = "razon_social_procesadora")
	private String dRSProTar;

	@Schema(name = "ruc_procesadora", description = "Campo dRUCProTar."
			+ " RUC de la procesadora de tarjeta.", requiredMode = RequiredMode.NOT_REQUIRED)
	@JsonProperty(value = "ruc_procesadora")
	private String dRUCProTar;

	@Schema(name = "dígito_verificador_procesadora", description = "Campo dDVProTar."
			+ " RUC de la procesadora de tarjeta.", requiredMode = RequiredMode.NOT_REQUIRED)
	@JsonProperty(value = "dígito_verificador_procesadora")
	private short dDVProTar;

	@Schema(name = "forma_procesamiento", description = "Campo iForProPa."
			+ " Forma de procesamiento de pago.", requiredMode = RequiredMode.REQUIRED)
	@JsonProperty(value = "forma_procesamiento")
	private TiForProPa iForProPa;

	@Schema(name = "codigo_autorizacion", description = "Campo dCodAuOpe."
			+ " Código de autorización de la operación.", requiredMode = RequiredMode.NOT_REQUIRED)
	@JsonProperty(value = "codigo_autorizacion")
	private long dCodAuOpe;

	@Schema(name = "titular_tarjeta", description = "Campo dNomTit."
			+ " Nombre del titular de la tarjeta.", requiredMode = RequiredMode.NOT_REQUIRED)
	@JsonProperty(value = "titular_tarjeta")
	private String dNomTit;

	@Schema(name = "numero_tarjeta", description = "Campo dNumTarj."
			+ " Número de la tarjeta.", requiredMode = RequiredMode.NOT_REQUIRED)
	@JsonProperty(value = "numero_tarjeta")
	private short dNumTarj;

	public com.roshka.sifen.core.fields.request.de.TgPagTarCD convertToTgPagTarCD() {

		com.roshka.sifen.core.fields.request.de.TgPagTarCD gPagTarCD = new com.roshka.sifen.core.fields.request.de.TgPagTarCD();

		gPagTarCD.setdCodAuOpe(dDVProTar);
		gPagTarCD.setdDVProTar(dDVProTar);
		gPagTarCD.setdNomTit(dNomTit);
		gPagTarCD.setdNumTarj(dNumTarj);
		gPagTarCD.setdRSProTar(dRSProTar);
		gPagTarCD.setdRUCProTar(dRUCProTar);
		gPagTarCD.setiForProPa(iForProPa);
		gPagTarCD.setiDenTarj(iDenTarj);
		gPagTarCD.setdDesDenTarj(iDenTarj.getDescripcion());

		return gPagTarCD;
	}

}
