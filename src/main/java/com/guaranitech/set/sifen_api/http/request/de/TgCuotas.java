package com.guaranitech.set.sifen_api.http.request.de;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.roshka.sifen.core.types.CMondT;

import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.Schema.RequiredMode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Schema(name = "Cuotas", description = "Campos que describen las cuotas."
		+ " Obligatorio si condicion_credito = CUOTA")
@Getter
@Setter
@ToString
public class TgCuotas {

	@Schema(name = "moneda", description = "Campo cMoneCuo."
			+ " Monto de cada cuota.", requiredMode = RequiredMode.REQUIRED)
	@JsonProperty(value = "moneda")
	private CMondT cMoneCuo;

	@Schema(name = "monto", description = "Campo dMonCuota."
			+ " Moneda de las cuotas. https://www.currency-iso.org/en/home/tables/table-a1.html", requiredMode = RequiredMode.REQUIRED)
	@JsonProperty(value = "monto")
	private BigDecimal dMonCuota;

	@Schema(name = "fecha_vencimiento", description = "Campo dVencCuo."
			+ " Fecha de vencimiento "
			+ " de cada cuota.", requiredMode = RequiredMode.REQUIRED)
	@JsonProperty(value = "fecha_vencimiento")
	private LocalDate dVencCuo;

	public static List<com.roshka.sifen.core.fields.request.de.TgCuotas> convertToTgCuotas(
			List<TgCuotas> gCuotasList) {

		List<com.roshka.sifen.core.fields.request.de.TgCuotas> gCuotasLst = new ArrayList<com.roshka.sifen.core.fields.request.de.TgCuotas>();

		for (TgCuotas varTgCuotas : gCuotasList) {
			com.roshka.sifen.core.fields.request.de.TgCuotas gCuotas = new com.roshka.sifen.core.fields.request.de.TgCuotas();

			gCuotas.setcMoneCuo(varTgCuotas.getCMoneCuo());
			gCuotas.setdMonCuota(varTgCuotas.getDMonCuota());
			gCuotas.setdVencCuo(varTgCuotas.getDVencCuo());

			gCuotasLst.add(gCuotas);
		}

		return gCuotasLst;
	}

}
