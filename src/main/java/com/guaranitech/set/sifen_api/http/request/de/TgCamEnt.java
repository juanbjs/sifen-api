package com.guaranitech.set.sifen_api.http.request.de;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.roshka.sifen.core.types.TDepartamento;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Schema(name = "EntregaMercaderias", description = "Campos que identifican el local de la entrega de las mercaderías.")
@Getter
@Setter
@ToString
public class TgCamEnt {

	@JsonProperty(value = "direccion_local")
	private String dDirLocEnt;

	@JsonProperty(value = "numero_casa")
	private short dNumCasEnt;

	@JsonProperty(value = "complemento_direccion_1")
	private String dComp1Ent;

	@JsonProperty(value = "complemento_direccion_2")
	private String dComp2Ent;

	@JsonProperty(value = "departamento_local")
	private TDepartamento cDepEnt;

	@JsonProperty(value = "distrito_local")
	private short cDisEnt;

	@JsonProperty(value = "descripcion_distrito_local")
	private String dDesDisEnt;

	@JsonProperty(value = "ciudad_local")
	private int cCiuEnt;

	@JsonProperty(value = "descripcion_ciudad_local")
	private String dDesCiuEnt;

	@JsonProperty(value = "telefono")
	private String dTelEnt;

	public static List<com.roshka.sifen.core.fields.request.de.TgCamEnt> convertToTgCamEnt(
			List<TgCamEnt> gCamEntList) {

		List<com.roshka.sifen.core.fields.request.de.TgCamEnt> gCamEntLst = new ArrayList<>();

		for (TgCamEnt varTgCamEnt : gCamEntList) {
			com.roshka.sifen.core.fields.request.de.TgCamEnt gCamEnt = new com.roshka.sifen.core.fields.request.de.TgCamEnt();

			gCamEnt.setcCiuEnt(varTgCamEnt.getCCiuEnt());
			gCamEnt.setcDepEnt(varTgCamEnt.getCDepEnt());
			gCamEnt.setcDisEnt(varTgCamEnt.getCDisEnt());
			gCamEnt.setdComp1Ent(varTgCamEnt.getDComp1Ent());
			gCamEnt.setdComp2Ent(varTgCamEnt.getDComp2Ent());
			gCamEnt.setdDesCiuEnt(varTgCamEnt.getDDesCiuEnt());
			gCamEnt.setdDesDisEnt(varTgCamEnt.getDDesDisEnt());
			gCamEnt.setdDirLocEnt(varTgCamEnt.getDDirLocEnt());
			gCamEnt.setdNumCasEnt(varTgCamEnt.getDNumCasEnt());
			gCamEnt.setdTelEnt(varTgCamEnt.getDTelEnt());

			gCamEntLst.add(gCamEnt);
		}

		return gCamEntLst;
	}

}
