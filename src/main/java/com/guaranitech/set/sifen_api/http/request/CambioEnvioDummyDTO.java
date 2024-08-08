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
public class CambioEnvioDummyDTO {
	
	@Schema(name = "envio_dummy", description = "Valor que tendra el envio dummy. True o False", requiredMode = RequiredMode.REQUIRED)
	@JsonProperty(value = "envio_dummy")
	private boolean envioDummy = false;
	
}
