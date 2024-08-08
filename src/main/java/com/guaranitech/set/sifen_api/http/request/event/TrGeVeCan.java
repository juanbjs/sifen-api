package com.guaranitech.set.sifen_api.http.request.event;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.Schema.RequiredMode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Schema(name = "Cancelacion", description = "Gestión de Eventos Cancelación.")
@Getter
@Setter
@ToString
public class TrGeVeCan {

	@Schema(name = "cdc", description = "Campo Id. Identificador del DTE", requiredMode = RequiredMode.REQUIRED)
	@JsonProperty(value = "cdc")
	private String Id;

	@Schema(name = "motivo", description = "Campo mOtEve. Motivo del Evento ", requiredMode = RequiredMode.REQUIRED)
	@JsonProperty(value = "motivo")
	private String mOtEve;

	
	public com.roshka.sifen.core.fields.request.event.TrGeVeCan convertToTrGeVeCan() {
		com.roshka.sifen.core.fields.request.event.TrGeVeCan rGeVeCan = new com.roshka.sifen.core.fields.request.event.TrGeVeCan();

		rGeVeCan.setId(Id);
		rGeVeCan.setmOtEve(mOtEve);

		return rGeVeCan;
	}

}