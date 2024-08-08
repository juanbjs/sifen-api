package com.guaranitech.set.sifen_api.http.request.de;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class TgCamEsp {

	@JsonProperty(value = "sector_energia")
	private TgGrupEner gGrupEner = new TgGrupEner();

	@JsonProperty(value = "sector_seguros")
	private TgGrupSeg gGrupSeg = new TgGrupSeg();

	@JsonProperty(value = "sector_supermercados")
	private TgGrupSup gGrupSup = new TgGrupSup();

	@JsonProperty(value = "datos_adicionales")
	private TgGrupAdi gGrupAdi = new TgGrupAdi();

	public com.roshka.sifen.core.fields.request.de.TgCamEsp convertToTgCamEsp() {

		com.roshka.sifen.core.fields.request.de.TgCamEsp gCamEsp = new com.roshka.sifen.core.fields.request.de.TgCamEsp();

		gCamEsp.setgGrupAdi(getGGrupAdi().convertToTgGrupAdi());
		gCamEsp.setgGrupEner(getGGrupEner().convertToTgGrupEner());
		gCamEsp.setgGrupSeg(getGGrupSeg().convertToTgGrupSeg());
		gCamEsp.setgGrupSup(getGGrupSup().convertToTgGrupSup());

		return gCamEsp;
	}

}