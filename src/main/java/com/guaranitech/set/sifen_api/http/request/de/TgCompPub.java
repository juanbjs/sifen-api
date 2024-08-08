package com.guaranitech.set.sifen_api.http.request.de;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.Schema.RequiredMode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Schema(name = "ComprasPublicas", description = "Campos que describen "
		+ " las informaciones de compras públicas."
		+ " Obligatorio si tipo_operacion = B2G.")
@Getter
@Setter
@ToString
public class TgCompPub {

	@Schema(name = "modalidad", description = "Campo dModCont."
			+ "Modalidad - Código emitido por la DNCP.", requiredMode = RequiredMode.REQUIRED)
	@JsonProperty(value = "modalidad")
	private String dModCont;

	@Schema(name = "entidad", description = "Campo dEntCont."
			+ "Entidad - Código emitido por la DNCP.", requiredMode = RequiredMode.REQUIRED)
	@JsonProperty(value = "entidad")
	private int dEntCont;

	@Schema(name = "ano", description = "Campo dAnoCont."
			+ "Año - Código emitido por la DNCP.", requiredMode = RequiredMode.REQUIRED)
	@JsonProperty(value = "ano")
	private short dAnoCont;

	@Schema(name = "secuencia", description = "Campo dSecCont."
			+ "Secuencia - emitido por la DNCP .", requiredMode = RequiredMode.REQUIRED)
	@JsonProperty(value = "secuencia")
	private int dSecCont;

	@Schema(name = "fecha_emision", description = "Campo dFeCodCont."
			+ " Fecha de emisión del código de "
			+ " contratación por la DNCP."
			+ " Fecha en el formato YYYY-MM-DD.", requiredMode = RequiredMode.REQUIRED)
	@JsonProperty(value = "fecha_emision")
	private LocalDate dFeCodCont = LocalDate.now();

	public com.roshka.sifen.core.fields.request.de.TgCompPub convertToTgCompPub() {

		com.roshka.sifen.core.fields.request.de.TgCompPub gCompPub = new com.roshka.sifen.core.fields.request.de.TgCompPub();

		gCompPub.setdAnoCont(dAnoCont);
		gCompPub.setdEntCont(dEntCont);
		gCompPub.setdFeCodCont(dFeCodCont);
		gCompPub.setdModCont(dModCont);
		gCompPub.setdSecCont(dSecCont);

		return gCompPub;
	}

}
