package com.guaranitech.set.sifen_api.http.request;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.Schema.RequiredMode;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class CambioTipoEnvioDTO {
	
	@Schema(name = "tipo_envio", description = "Valor que tendra el tipo de envio a SIFEN. ONLINE o LOTE", requiredMode = RequiredMode.REQUIRED)
	@JsonProperty(value = "tipo_envio")
	private String tipoEnvio = "ONLINE";
	
}
