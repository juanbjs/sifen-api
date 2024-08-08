package com.guaranitech.set.sifen_api.http.request.de;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.Schema.RequiredMode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Schema(name = "DatosGenerales", description = "Campos generales del DE.")
@Getter
@Setter
@ToString
public class TdDatGralOpe {

	@Schema(name = "fecha_hora_emision", description = "Campo dFeEmiDE. Fecha y hora de emisión del DE. Fecha y hora en el formato YYYY-MM-DD HH:MI:SS.", requiredMode = RequiredMode.REQUIRED)
	@JsonProperty(value = "fecha_hora_emision")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private LocalDateTime dFeEmiDE;

	@JsonProperty(value = "datos_operacion_comercial")
	private TgOpeCom gOpeCom;

	@JsonProperty(value = "emisor")
	private TgEmis gEmis;

	@JsonProperty(value = "receptor")
	private TgDatRec gDatRec;

	public com.roshka.sifen.core.fields.request.de.TdDatGralOpe convertToTdDatGralOpe() {

		com.roshka.sifen.core.fields.request.de.TdDatGralOpe dDatGralOpe = new com.roshka.sifen.core.fields.request.de.TdDatGralOpe();

		dDatGralOpe.setdFeEmiDE(dFeEmiDE);
		dDatGralOpe.setgDatRec(getGDatRec().convertToTgDatRec());
		dDatGralOpe.setgEmis(getGEmis().convertToTgEmis());
		
		if(gOpeCom != null) {
			dDatGralOpe.setgOpeCom(getGOpeCom().convertToTgOpeCom());
		}

		return dDatGralOpe;
	}

}