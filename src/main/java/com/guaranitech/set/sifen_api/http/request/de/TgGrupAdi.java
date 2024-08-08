package com.guaranitech.set.sifen_api.http.request.de;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class TgGrupAdi {

	@JsonProperty(value = "ciclo")
	private String dCiclo;

	@JsonProperty(value = "fecha_inicio_ciclo")
	private LocalDate dFecIniC;

	@JsonProperty(value = "fecha_fin_ciclo")
	private LocalDate dFecFinC;

	@JsonProperty(value = "fecha_vencimiento_pagos")
	private List<LocalDate> dVencPagList = new ArrayList<LocalDate>();

	@JsonProperty(value = "numero_contrato")
	private String dContrato;

	@JsonProperty(value = "saldo_anterior")
	private BigDecimal dSalAnt;

	public com.roshka.sifen.core.fields.request.de.TgGrupAdi convertToTgGrupAdi() {

		com.roshka.sifen.core.fields.request.de.TgGrupAdi gGrupAdi = new com.roshka.sifen.core.fields.request.de.TgGrupAdi();

		gGrupAdi.setdCiclo(dCiclo);
		gGrupAdi.setdContrato(dContrato);
		gGrupAdi.setdFecFinC(dFecFinC);
		gGrupAdi.setdFecIniC(dFecIniC);
		gGrupAdi.setdSalAnt(dSalAnt);
		gGrupAdi.setdVencPagList(dVencPagList);

		return gGrupAdi;
	}

}