package com.guaranitech.set.sifen_api.http.request.de;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.roshka.sifen.core.types.TTipEmi;

import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.Schema.RequiredMode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Schema(name = "DatosOperacion", description = "Campos inherentes a la operación de DE.")
@Getter
@Setter
@ToString
public class TgOpeDE {

	@Schema(name = "tipo_emision", description = "Campo iTipEmi. Tipo de emisión.", requiredMode = RequiredMode.REQUIRED)
	@JsonProperty(value = "tipo_emision")
	private TTipEmi iTipEmi = TTipEmi.NORMAL;

	@Schema(name = "codigo_seguridad", description = "Campo dCodSeg. Código de seguridad. Código generado por el emisor de "
			+ "manera aleatoria para asegurar la confidencialidad de la "
			+ "consulta pública del DE", requiredMode = RequiredMode.REQUIRED)
	@JsonProperty(value = "codigo_seguridad ")
	private String dCodSeg;

	@Schema(name = "informacion_fiscal", description = "Campo dInfoEmi. Información de interés del emisor respecto al DE.")
	@JsonProperty(value = "informacion_emisior")
	private String dInfoEmi;

	@Schema(name = "informacion_fiscal", description = "Campo dInfoFisc. Información de interés del Fisco respecto al DE. "
			+ "Esta información debe ser impresa en el KuDE. "
			+ "Cuando el tipo de documento es Nota de remisión es obligatorio informar "
			+ "el mensaje según el Art. 3 Inc. 7 de la "
			+ "Resolución general Nro. 41/2014.")
	@JsonProperty(value = "informacion_fiscal")
	private String dInfoFisc;

	public com.roshka.sifen.core.fields.request.de.TgOpeDE convertToTgOpeDE() {

		com.roshka.sifen.core.fields.request.de.TgOpeDE gOpeDE = new com.roshka.sifen.core.fields.request.de.TgOpeDE();

		gOpeDE.setiTipEmi(iTipEmi);
		gOpeDE.setdCodSeg(dCodSeg);
		gOpeDE.setdInfoEmi(dInfoEmi);
		gOpeDE.setdInfoFisc(dInfoFisc);

		return gOpeDE;
	}

}