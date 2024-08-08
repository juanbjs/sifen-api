package com.guaranitech.set.sifen_api.http.request.de;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.roshka.sifen.core.types.TiCondCred;

import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.Schema.RequiredMode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Schema(name = "OperacionCredito", description = "Campos que describen"
		+ " la operación a crédito."
		+ " Obligatorio si condicion = CREDITO")
@Getter
@Setter
@ToString
public class TgPagCred {

	@Schema(name = "condicion_credito", description = "Campo iCondCred."
			+ " Condición de la operación a crédito.", requiredMode = RequiredMode.REQUIRED)
	@JsonProperty(value = "condicion_credito")
	private TiCondCred iCondCred;

	@Schema(name = "plazo_crédito", description = "Campo dPlazoCre."
			+ " Plazo del crédito."
			+ " Obligatorio si condicion_credito = PLAZO", requiredMode = RequiredMode.REQUIRED)
	@JsonProperty(value = "plazo_crédito")
	private String dPlazoCre;

	@Schema(name = "cantidad_cuotas", description = "Campo dCuotas."
			+ " Cantidad de cuotas."
			+ " Obligatorio si condicion_credito = CUOTA", requiredMode = RequiredMode.REQUIRED)
	@JsonProperty(value = "cantidad_cuotas")
	private short dCuotas;

	@Schema(name = "entrega_inicial", description = "Campo dMonEnt."
			+ " Monto de la entrega inicial", requiredMode = RequiredMode.REQUIRED)
	@JsonProperty(value = "entrega_inicial")
	private BigDecimal dMonEnt;

	@JsonProperty(value = "cuotas")
	private List<TgCuotas> gCuotasList = new ArrayList<TgCuotas>();

	public com.roshka.sifen.core.fields.request.de.TgPagCred convertToTgPagCred() {

		com.roshka.sifen.core.fields.request.de.TgPagCred gPagCred = new com.roshka.sifen.core.fields.request.de.TgPagCred();

		gPagCred.setdCuotas(dCuotas);
		gPagCred.setdMonEnt(dMonEnt);
		gPagCred.setdPlazoCre(dPlazoCre);
		gPagCred.setiCondCred(iCondCred);
		gPagCred.setgCuotasList(TgCuotas.convertToTgCuotas(getGCuotasList()));

		return gPagCred;
	}

}
