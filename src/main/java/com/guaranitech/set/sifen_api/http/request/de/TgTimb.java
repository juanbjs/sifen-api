package com.guaranitech.set.sifen_api.http.request.de;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.roshka.sifen.core.types.TTiDE;

import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.Schema.RequiredMode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Schema(name = "DatosTimbrado", description = "Datos del timbrado.")
@Getter
@Setter
@ToString
public class TgTimb {

	@Schema(name = "tipo_documento", description = "Campo iTiDE. Tipo de Documento Electrónico.", requiredMode = RequiredMode.REQUIRED)
	@JsonProperty(value = "tipo_documento")
	private TTiDE iTiDE = TTiDE.FACTURA_ELECTRONICA;

	@Schema(name = "numero_timbrado", description = "Campo dNumTim. Número del timbrado.", requiredMode = RequiredMode.REQUIRED)
	@JsonProperty(value = "numero_timbrado")
	private int dNumTim;

	@Schema(name = "establecimiento", description = "Campo dEst. Establecimiento. Completar con 0 (cero) a la izquierda.", requiredMode = RequiredMode.REQUIRED)
	@JsonProperty(value = "establecimiento")
	private String dEst;

	@Schema(name = "punto_expedicion", description = "Campo dPunExp. Punto de expedición. Completar con 0 (cero) a la izquierda.", requiredMode = RequiredMode.REQUIRED)
	@JsonProperty(value = "punto_expedicion")
	private String dPunExp;

	@Schema(name = "numero_documento", description = "Campo dNumDoc. Número del documento."
			+ " Debe empezar con 1 (uno) para un nuevo timbrado."
			+ " Completar con 0 (cero) a la izquierda hasta alcanzar 7 (siete) cifras.", requiredMode = RequiredMode.REQUIRED)
	@JsonProperty(value = "numero_documento")
	private String dNumDoc;

	@Schema(name = "serie", description = "Campo dSerieNum. Serie del número de timbrado."
			+ " Campo obligatorio cuando ya se ha consumido la totalidad de la"
			+ " numeración permitida por el sistema (9999999).", requiredMode = RequiredMode.REQUIRED)
	@JsonProperty(value = "serie")
	private String dSerieNum = "AA";

	@Schema(name = "inicio_vigencia", description = "Campo dFeIniT. Fecha inicio de vigencia del timbrado. Fecha en el formato YYYY-MM-DD.", requiredMode = RequiredMode.REQUIRED)
	@JsonProperty(value = "inicio_vigencia")
	@JsonFormat(pattern = "yyyy-MM-dd")
	private LocalDate dFeIniT;

	public com.roshka.sifen.core.fields.request.de.TgTimb convertToTgTimb() {

		com.roshka.sifen.core.fields.request.de.TgTimb gTimb = new com.roshka.sifen.core.fields.request.de.TgTimb();

		gTimb.setdEst(dEst);
		gTimb.setdFeIniT(dFeIniT);
		gTimb.setdNumDoc(dNumDoc);
		gTimb.setdNumTim(dNumTim);
		gTimb.setdPunExp(dPunExp);
		gTimb.setdSerieNum(dSerieNum);
		gTimb.setiTiDE(iTiDE);

		return gTimb;
	}

}