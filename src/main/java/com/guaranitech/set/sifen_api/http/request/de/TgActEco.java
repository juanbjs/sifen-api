package com.guaranitech.set.sifen_api.http.request.de;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class TgActEco {

	@JsonProperty(value = "codigo_actividad")
	private String cActEco;

	@JsonProperty(value = "descripcion_actividad")
	private String dDesActEco;

	public static List<com.roshka.sifen.core.fields.request.de.TgActEco> convertToTgActEco(List<TgActEco> gActEcoList) {

		List<com.roshka.sifen.core.fields.request.de.TgActEco> gActEcoLst = new ArrayList<com.roshka.sifen.core.fields.request.de.TgActEco>();

		for (TgActEco varTgActEco : gActEcoList) {
			com.roshka.sifen.core.fields.request.de.TgActEco gActEco = new com.roshka.sifen.core.fields.request.de.TgActEco();

			gActEco.setcActEco(varTgActEco.getCActEco());
			gActEco.setdDesActEco(varTgActEco.getDDesActEco());

			gActEcoLst.add(gActEco);
		}

		return gActEcoLst;
	}

}