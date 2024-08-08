package com.guaranitech.set.sifen_api.http.request.de;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.roshka.sifen.core.types.TiCondOpe;

import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.Schema.RequiredMode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Schema(name = "CondicionOperacion", description = "Campos que describen "
		+ " la condición de la operación."
		+ " Obligatorio si el Tipo de Documento Electrónico = FACTURA_ELECTRONICA o AUTOFACTURA_ELECTRONICA.")
@Getter
@Setter
@ToString
public class TgCamCond {

	@Schema(name = "condicion", description = "Campo iCondOpe."
			+ " Condición de la operación.", requiredMode = RequiredMode.REQUIRED)
	@JsonProperty(value = "condicion")
	private TiCondOpe iCondOpe = TiCondOpe.CONTADO;

	@JsonProperty(value = "forma_pago")
	private List<TgPaConEIni> gPaConEIniList = new ArrayList<>();

	@JsonProperty(value = "operacion_credito")
	private TgPagCred gPagCred;

	public com.roshka.sifen.core.fields.request.de.TgCamCond convertToTgCamCond() {

		com.roshka.sifen.core.fields.request.de.TgCamCond gCamCond = new com.roshka.sifen.core.fields.request.de.TgCamCond();

		if(gPagCred != null)
			gCamCond.setgPagCred(gPagCred.convertToTgPagCred());
		
		gCamCond.setiCondOpe(iCondOpe);
		gCamCond.setgPaConEIniList(TgPaConEIni.convertToTgPaConEIni(getGPaConEIniList()));

		return gCamCond;
	}

}
