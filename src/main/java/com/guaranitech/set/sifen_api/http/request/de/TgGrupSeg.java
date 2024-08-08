package com.guaranitech.set.sifen_api.http.request.de;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class TgGrupSeg {

	@JsonProperty(value = "codigo_empresa")
	private String dCodEmpSeg;

	@JsonProperty(value = "polizas_seguros")
	private List<TgGrupPolSeg> gGrupPolSegList = new ArrayList<TgGrupPolSeg>();

	public com.roshka.sifen.core.fields.request.de.TgGrupSeg convertToTgGrupSeg() {

		com.roshka.sifen.core.fields.request.de.TgGrupSeg gGrupSeg = new com.roshka.sifen.core.fields.request.de.TgGrupSeg();

		gGrupSeg.setdCodEmpSeg(dCodEmpSeg);
		gGrupSeg.setgGrupPolSegList(TgGrupPolSeg.convertToTgGrupPolSeg(getGGrupPolSegList()));

		return gGrupSeg;
	}

}