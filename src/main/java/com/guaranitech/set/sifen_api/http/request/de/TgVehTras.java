package com.guaranitech.set.sifen_api.http.request.de;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Schema(name = "VehiculoTraslado", description = "Campos que identifican al vehículo del traslado de mercaderías.")
@Getter
@Setter
@ToString
public class TgVehTras {

	@JsonProperty(value = "tipo_vehículo")
	private String dTiVehTras;

	@JsonProperty(value = "marca")
	private String dMarVeh;

	@JsonProperty(value = "tipo_identificacion_vehiculo")
	private short dTipIdenVeh;

	@JsonProperty(value = "numero_identificacion_vehiculo")
	private String dNroIDVeh;

	@JsonProperty(value = "datos_adicionales")
	private String dAdicVeh;

	@JsonProperty(value = "numero_matrícula_vehiculo")
	private String dNroMatVeh;

	@JsonProperty(value = "numero_vuelo")
	private String dNroVuelo;

	public static List<com.roshka.sifen.core.fields.request.de.TgVehTras> convertToTgVehTras(
			List<TgVehTras> gVehTrasList) {

		List<com.roshka.sifen.core.fields.request.de.TgVehTras> gVehTrasLst = new ArrayList<>();

		for (TgVehTras varTgVehTras : gVehTrasList) {
			com.roshka.sifen.core.fields.request.de.TgVehTras gVehTras = new com.roshka.sifen.core.fields.request.de.TgVehTras();

			gVehTras.setdAdicVeh(varTgVehTras.getDAdicVeh());
			gVehTras.setdMarVeh(varTgVehTras.getDMarVeh());
			gVehTras.setdNroIDVeh(varTgVehTras.getDNroIDVeh());
			gVehTras.setdNroMatVeh(varTgVehTras.getDNroMatVeh());
			gVehTras.setdNroVuelo(varTgVehTras.getDNroVuelo());
			gVehTras.setdTiVehTras(varTgVehTras.getDTiVehTras());
			gVehTras.setdTipIdenVeh(varTgVehTras.getDTipIdenVeh());

			gVehTrasLst.add(gVehTras);
		}

		return gVehTrasLst;
	}

}
