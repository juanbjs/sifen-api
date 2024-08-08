package com.guaranitech.set.sifen_api.http.request.event;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.Schema.RequiredMode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Schema(name = "EventoElectronico", description = "Eventos Electronicos")
@Getter
@Setter
@ToString
public class TrGesEve {

	@Schema(name = "id", description = "Campo Id. Identificador del evento", requiredMode = RequiredMode.REQUIRED)
	@JsonProperty(value = "id")
	private String id;

	@Schema(name = "fecha_firma", description = "Campo dFecFirma. Fecha y Hora del firmado. Fecha y hora en el formato YYYY-MM-DD HH:MI:SS.", example = "9999-12-31 23:59:59", format = "YYYY-MM-DD HH:MI:SS", requiredMode = RequiredMode.REQUIRED)
	@JsonProperty(value = "fecha_firma")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private LocalDateTime dFecFirma;

	@JsonProperty(value = "evento")
	private TgGroupTiEvt gGroupTiEvt;

	public com.roshka.sifen.core.fields.request.event.TrGesEve convertToTrGesEve() {

		com.roshka.sifen.core.fields.request.event.TrGesEve rGesEve = new com.roshka.sifen.core.fields.request.event.TrGesEve();

		rGesEve.setId(id);
		rGesEve.setdFecFirma(dFecFirma);
		rGesEve.setgGroupTiEvt(gGroupTiEvt.convertToTgGroupTiEvt());

		return rGesEve;
	}

}