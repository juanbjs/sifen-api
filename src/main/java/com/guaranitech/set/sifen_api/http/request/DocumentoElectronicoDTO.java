package com.guaranitech.set.sifen_api.http.request;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.guaranitech.set.sifen_api.http.request.de.TdDatGralOpe;
import com.guaranitech.set.sifen_api.http.request.de.TgCamDEAsoc;
import com.guaranitech.set.sifen_api.http.request.de.TgCamGen;
import com.guaranitech.set.sifen_api.http.request.de.TgDtipDE;
import com.guaranitech.set.sifen_api.http.request.de.TgOpeDE;
import com.guaranitech.set.sifen_api.http.request.de.TgTimb;
import com.guaranitech.set.sifen_api.http.request.de.TgTotSub;
import com.roshka.sifen.core.beans.DocumentoElectronico;

import io.swagger.v3.oas.annotations.Hidden;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.Schema.AccessMode;
import io.swagger.v3.oas.annotations.media.Schema.RequiredMode;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * Clase que representa un Documento Electrónico, incluyendo todos los campos
 * disponibles en un DE en formato XML.
 */
@Schema(name = "DocumentoElectronico", description = "Dto de Documentos Electronicos")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class DocumentoElectronicoDTO {

	@Hidden
	@JsonProperty(value = "cdc")
	private String Id;

	@Schema(name = "fecha_firma", description = "Campo dFecFirma. La fecha y hora de la firma digital debe "
			+ "ser anterior a la fecha y hora de transmisión al SIFEN. Fecha y hora en el formato YYYY-MM-DD HH:MI:SS. "
			+ "El plazo límite de transmisión del DE al SIFEN para la aprobación normal es de 72 h contadas a partir de la fecha y"
			+ "hora de la firma digital." , example = "9999-12-31 23:59:59", format = "YYYY-MM-DD HH:MI:SS", requiredMode = RequiredMode.REQUIRED)
	@JsonProperty(value = "fecha_firma")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private LocalDateTime dFecFirma;

	@JsonProperty(value = "datos_operacion")
	private TgOpeDE gOpeDE;

	@JsonProperty(value = "datos_timbrado")
	private TgTimb gTimb;

	@JsonProperty(value = "datos_generales")
	private TdDatGralOpe gDatGralOpe;

	@JsonProperty(value = "tipo_documento")
	private TgDtipDE gDtipDE;

	@Hidden
	@JsonIgnore
	private TgTotSub gTotSub = new TgTotSub();

	@JsonProperty(value = "datos_complementarios")
	private TgCamGen gCamGen = new TgCamGen();

	@JsonProperty(value = "datos_de_asociado")
	private List<TgCamDEAsoc> gCamDEAsocList = new ArrayList<TgCamDEAsoc>();

	@Schema(name = "enlaceQR", accessMode = AccessMode.READ_ONLY)
	@JsonProperty(value = "enlaceQR", access = JsonProperty.Access.READ_ONLY)
	private String enlaceQR;

	public DocumentoElectronico dtoToDocumentoElectronico() {

		DocumentoElectronico DE = new DocumentoElectronico();

		// Grupo A
		DE.setdFecFirma(getDFecFirma());
		DE.setdSisFact(new Short("1"));

		// Grupo B
		DE.setgOpeDE(getGOpeDE().convertToTgOpeDE());

		// Grupo C
		DE.setgTimb(getGTimb().convertToTgTimb());

		// Grupo D
		DE.setgDatGralOpe(getGDatGralOpe().convertToTdDatGralOpe());

		// Grupo E
		DE.setgDtipDE(getGDtipDE().convertToTgDtipDE());

		// Grupo F
		if (gTotSub != null)
			DE.setgTotSub(getGTotSub().convertToTgTotSub());

		// Grupo F
		DE.setgCamGen(getGCamGen().convertToTgCamGen());

		// Grupo H
		DE.setgCamDEAsocList(TgCamDEAsoc.convertToTgCamDEAsoc(getGCamDEAsocList()));

		return DE;
	}

}