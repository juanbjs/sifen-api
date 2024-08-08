package com.guaranitech.set.sifen_api.http.request.de;

import java.math.BigInteger;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.roshka.sifen.core.types.TcUniMed;
import com.roshka.sifen.core.types.TiCarCarga;

import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.Schema.RequiredMode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Schema(name = "camposGeneralesCarga", description = "Campos generales de la carga.")
@Getter
@Setter
@ToString
public class TgCamCarg {

	@Schema(name = "unidad_medida_total_volumen", description = "Campo cUniMedTotVol."
			+ " Unidad de medida del total de volumen de la mercadería.", requiredMode = RequiredMode.NOT_REQUIRED)
	@JsonProperty(value = "unidad_medida_total_volumen")
	private TcUniMed cUniMedTotVol;

	@Schema(name = "total_volumen_mercaderia", description = "Campo dTotVolMerc."
			+ " Total de volumen de la mercadería.", requiredMode = RequiredMode.NOT_REQUIRED)
	@JsonProperty(value = "total_volumen_mercaderia")
	private BigInteger dTotVolMerc;

	@Schema(name = "unidad_medida_peso_total", description = "Campo cUniMedTotPes."
			+ " Unidad de medida del peso total de la mercadería.", requiredMode = RequiredMode.NOT_REQUIRED)
	@JsonProperty(value = "unidad_medida_peso_total")
	private TcUniMed cUniMedTotPes;

	@Schema(name = "total_peso_mercadería", description = "Campo dTotPesMerc."
			+ " Total peso de la mercadería.", requiredMode = RequiredMode.NOT_REQUIRED)
	@JsonProperty(value = "total_peso_mercadería")
	private BigInteger dTotPesMerc;

	@Schema(name = "caracteristicas_carga", description = "Campo iCarCarga."
			+ " Características de la Carga .", requiredMode = RequiredMode.NOT_REQUIRED)
	@JsonProperty(value = "caracteristicas_carga")
	private TiCarCarga iCarCarga;

	@JsonIgnore
	@JsonProperty(value = "campos_generales")
	private String dDesCarCarga;

	public com.roshka.sifen.core.fields.request.de.TgCamCarg convertToTgCamCarg() {

		com.roshka.sifen.core.fields.request.de.TgCamCarg gCamCarg = new com.roshka.sifen.core.fields.request.de.TgCamCarg();

		gCamCarg.setcUniMedTotPes(cUniMedTotPes);
		gCamCarg.setcUniMedTotVol(cUniMedTotVol);
		gCamCarg.setdTotPesMerc(dTotPesMerc);
		gCamCarg.setdTotVolMerc(dTotVolMerc);
		gCamCarg.setiCarCarga(iCarCarga);

		return gCamCarg;
	}

}
