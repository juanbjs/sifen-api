package com.guaranitech.set.sifen_api.http.request.de;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.roshka.sifen.core.types.TiMotEmi;

import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.Schema.RequiredMode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Schema(name = "NotaCreditoDebito", description = "Campos que componen la NCND."
		+ " Obligatorio si el Tipo de Documento Electrónico = NOTA_DE_CREDITO_ELECTRONICA o NOTA_DE_DEBITO_ELECTRONICA.")
@Getter
@Setter
@ToString
public class TgCamNCDE {

	@Schema(name = "motivo_emision", description = "Campo iMotEmi."
			+ "Motivo de emisión.", requiredMode = RequiredMode.REQUIRED)
	@JsonProperty(value = "motivo_emision")
	private TiMotEmi iMotEmi = TiMotEmi.DEVOLUCION_Y_AJUSTES_DE_PRECIOS;

	public TgCamNCDE() {

	}

	public TgCamNCDE(TiMotEmi iMotEmi) {
		this.iMotEmi = iMotEmi;
	}

	public com.roshka.sifen.core.fields.request.de.TgCamNCDE convertToTgCamNCDE() {

		com.roshka.sifen.core.fields.request.de.TgCamNCDE gCamNCDE = new com.roshka.sifen.core.fields.request.de.TgCamNCDE();

		gCamNCDE.setiMotEmi(iMotEmi);

		return gCamNCDE;
	}

}