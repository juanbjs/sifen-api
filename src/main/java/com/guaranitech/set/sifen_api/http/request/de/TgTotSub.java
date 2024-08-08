package com.guaranitech.set.sifen_api.http.request.de;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class TgTotSub {

	@JsonProperty(value = "comision_operacion")
	private BigDecimal dComi = BigDecimal.ZERO;

	public com.roshka.sifen.core.fields.request.de.TgTotSub convertToTgTotSub() {

		com.roshka.sifen.core.fields.request.de.TgTotSub gTotSub = new com.roshka.sifen.core.fields.request.de.TgTotSub();

		gTotSub.setdComi(dComi);

		return gTotSub;
	}

}
