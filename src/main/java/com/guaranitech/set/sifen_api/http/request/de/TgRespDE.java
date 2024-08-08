package com.guaranitech.set.sifen_api.http.request.de;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.roshka.sifen.core.types.TiTipIDRespDE;

import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.Schema.RequiredMode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Schema(name = "ResponsableGeneracion", description = "Campos que identifican al responsable"
		+ " de la generación del DE.")
@Getter
@Setter
@ToString
public class TgRespDE {

	@Schema(name = "tipo_documento", description = "Campo iTipIDRespDE."
			+ " Tipo de documento de identidad.",
			requiredMode = RequiredMode.REQUIRED)
	@JsonProperty(value = "tipo_documento")
	private TiTipIDRespDE iTipIDRespDE = TiTipIDRespDE.CEDULA_PARAGUAYA;

	@Schema(hidden = true, name = "descripcion_tipo_documento")
	@JsonIgnore
	@JsonProperty(value = "descripcion_tipo_documento")
	private String dDTipIDRespDE = iTipIDRespDE.getDescripcion();

	@Schema(name = "numero_documento", description = "Campo dNumIDRespDE."
			+ " Número de documento de identidad.",
			requiredMode = RequiredMode.REQUIRED)
	@JsonProperty(value = "numero_documento")
	private String dNumIDRespDE;

	@Schema(name = "razon_social", description = "Campo dNomRespDE."
			+ " Nombre o razón social del responsable.",
			requiredMode = RequiredMode.REQUIRED)
	@JsonProperty(value = "razon_social")
	private String dNomRespDE;

	@Schema(name = "cargo_responsable_generacion", description = "Campo dCarRespDE."
			+ " Cargo del responsable.",
			requiredMode = RequiredMode.REQUIRED)
	@JsonProperty(value = "cargo_responsable_generacion")
	private String dCarRespDE;

	public com.roshka.sifen.core.fields.request.de.TgRespDE convertToTgRespDE() {

		com.roshka.sifen.core.fields.request.de.TgRespDE gRespDE = new com.roshka.sifen.core.fields.request.de.TgRespDE();

		gRespDE.setdCarRespDE(dCarRespDE);
		gRespDE.setdDTipIDRespDE(dDTipIDRespDE);
		gRespDE.setdNomRespDE(dNomRespDE);
		gRespDE.setdNumIDRespDE(dNumIDRespDE);
		gRespDE.setiTipIDRespDE(iTipIDRespDE);

		return gRespDE;
	}

}