package com.guaranitech.set.sifen_api.http.request.de;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.roshka.sifen.core.types.TiTipCom;
import com.roshka.sifen.core.types.TiTipOpVN;

import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.Schema.RequiredMode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Schema(name = "AutomotoresNuevosUsados", description = "Grupo de detalle de vehículos nuevos.")
@Getter
@Setter
@ToString
public class TgVehNuevo {

	@Schema(name = "tipo_operacion", description = "Campo iTipOpVN."
			+ " Tipo de operación de venta de vehículos.", requiredMode = RequiredMode.NOT_REQUIRED)
	@JsonProperty(value = "tipo_operacion")
	private TiTipOpVN iTipOpVN;

	@Schema(name = "chasis", description = "Campo dChasis."
			+ " Chasis del vehículo.", requiredMode = RequiredMode.NOT_REQUIRED)
	@JsonProperty(value = "chasis")
	private String dChasis;

	@Schema(name = "color", description = "Campo dColor."
			+ " Color del vehículo.", requiredMode = RequiredMode.NOT_REQUIRED)
	@JsonProperty(value = "color")
	private String dColor;

	@Schema(name = "potencia_motor", description = "Campo dPotencia."
			+ " Potencia del motor (CV).", requiredMode = RequiredMode.NOT_REQUIRED)
	@JsonProperty(value = "potencia_motor")
	private short dPotencia;

	@Schema(name = "capacidad_motor", description = "Campo dCapMot."
			+ " Capacidad del motor.", requiredMode = RequiredMode.NOT_REQUIRED)
	@JsonProperty(value = "capacidad_motor")
	private short dCapMot;

	@Schema(name = "peso_neto", description = "Campo dPNet."
			+ " Peso Neto.", requiredMode = RequiredMode.NOT_REQUIRED)
	@JsonProperty(value = "peso_neto")
	private BigDecimal dPNet;

	@Schema(name = "peso_bruto", description = "Campo dPBruto."
			+ " Peso Bruto.", requiredMode = RequiredMode.NOT_REQUIRED)
	@JsonProperty(value = "peso_bruto")
	private BigDecimal dPBruto;

	@Schema(name = "tipo_combustible", description = "Campo iTipCom."
			+ " Tipo de combustible.", requiredMode = RequiredMode.NOT_REQUIRED)
	@JsonProperty(value = "tipo_combustible")
	private TiTipCom iTipCom;

	@Schema(name = "numero_motor", description = "Campo dNroMotor."
			+ " Número del motor.", requiredMode = RequiredMode.NOT_REQUIRED)
	@JsonProperty(value = "numero_motor")
	private String dNroMotor;

	@Schema(name = "capacidad_traccion", description = "Campo dCapTracc."
			+ " Número del motor.", requiredMode = RequiredMode.NOT_REQUIRED)
	@JsonProperty(value = "capacidad_traccion")
	private BigDecimal dCapTracc;

	@Schema(name = "ano_fabricacion", description = "Campo dAnoFab."
			+ " Año de fabricación.", requiredMode = RequiredMode.NOT_REQUIRED)
	@JsonProperty(value = "ano_fabricacion")
	private short dAnoFab;

	@Schema(name = "tipo_vehículo", description = "Campo cTipVeh."
			+ " Tipo de vehículo.", requiredMode = RequiredMode.NOT_REQUIRED)
	@JsonProperty(value = "tipo_vehículo")
	private String cTipVeh;

	@Schema(name = "capacidad_pasajeros", description = "Campo dCapac."
			+ " Capacidad máxima de pasajeros.", requiredMode = RequiredMode.NOT_REQUIRED)
	@JsonProperty(value = "capacidad_pasajeros")
	private short dCapac;

	@Schema(name = "Cilindradas_motor", description = "Campo dCdCilinapac."
			+ " Cilindradas del motor.", requiredMode = RequiredMode.NOT_REQUIRED)
	@JsonProperty(value = "Cilindradas_motor")
	private String dCilin;

	public com.roshka.sifen.core.fields.request.de.TgVehNuevo convertToTgVehNuevo() {

		com.roshka.sifen.core.fields.request.de.TgVehNuevo gVehNuevo = new com.roshka.sifen.core.fields.request.de.TgVehNuevo();

		gVehNuevo.setcTipVeh(cTipVeh);
		gVehNuevo.setdAnoFab(dAnoFab);
		gVehNuevo.setdCapMot(dCapMot);
		gVehNuevo.setdCapTracc(dCapTracc);
		gVehNuevo.setdCapac(dCapac);
		gVehNuevo.setdChasis(dChasis);
		gVehNuevo.setdCilin(dCilin);
		gVehNuevo.setdColor(dColor);
		gVehNuevo.setdNroMotor(dNroMotor);
		gVehNuevo.setdPBruto(dPBruto);
		gVehNuevo.setdPNet(dPNet);
		gVehNuevo.setdPotencia(dPotencia);
		gVehNuevo.setiTipOpVN(iTipOpVN);
		gVehNuevo.setiTipCom(iTipCom);
		gVehNuevo.setdDesTipCom(iTipCom.getDescripcion());

		return gVehNuevo;
	}

}
