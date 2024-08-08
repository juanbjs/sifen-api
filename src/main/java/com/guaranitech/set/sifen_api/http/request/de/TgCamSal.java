package com.guaranitech.set.sifen_api.http.request.de;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.roshka.sifen.core.types.TDepartamento;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Schema(name = "SalidaMercaderias", description = "Campos que identifican el local de salida de las mercaderías.")
@Getter
@Setter
@ToString
public class TgCamSal {

	@JsonProperty(value = "direccion_local")
	private String dDirLocSal;

	@JsonProperty(value = "numero_casa")
	private short dNumCasSal;

	@JsonProperty(value = "complemento_direccion_1")
	private String dComp1Sal;

	@JsonProperty(value = "complemento_direccion_2")
	private String dComp2Sal;

	@JsonProperty(value = "departamento_local")
	private TDepartamento cDepSal;

	@JsonProperty(value = "distrito_local")
	private short cDisSal;

	@JsonProperty(value = "descripcion_distrito_local")
	private String dDesDisSal;

	@JsonProperty(value = "ciudad_local")
	private int cCiuSal;

	@JsonProperty(value = "descripcion_ciudad_local")
	private String dDesCiuSal;

	@JsonProperty(value = "telefono")
	private String dTelSal;

	public com.roshka.sifen.core.fields.request.de.TgCamSal convertToTgCamSal() {

		com.roshka.sifen.core.fields.request.de.TgCamSal gCamSal = new com.roshka.sifen.core.fields.request.de.TgCamSal();

		gCamSal.setcCiuSal(cCiuSal);
		gCamSal.setcDepSal(cDepSal);
		gCamSal.setcDisSal(cDisSal);
		gCamSal.setdComp1Sal(dComp1Sal);
		gCamSal.setdComp2Sal(dComp2Sal);
		gCamSal.setdDesCiuSal(dDesCiuSal);
		gCamSal.setdDesDisSal(dDesDisSal);
		gCamSal.setdDirLocSal(dDirLocSal);
		gCamSal.setdNumCasSal(dNumCasSal);
		gCamSal.setdTelSal(dTelSal);

		return gCamSal;
	}

}
