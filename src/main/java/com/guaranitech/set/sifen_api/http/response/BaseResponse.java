package com.guaranitech.set.sifen_api.http.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public abstract class BaseResponse {

    @Schema(name = "Campo codigoEstado. Código del resultado")
    @JsonProperty(value = "codigoEstado")
    private int codigoEstado;

    @Schema(name = "Campo respuestaBruta. XML de Respuesta")
    @JsonProperty(value = "respuestaBruta")
    private String respuestaBruta;

    @Schema(name = "Campo dCodRes. Código del resultado de procesamiento.")
    @JsonProperty(value = "codigo_resultado")
    private String dCodRes;

    @Schema(name = "Campo dMsgRes. Mensaje del resultado de procesamiento.")
    @JsonProperty(value = "mensaje_resultado")
    private String dMsgRes;

    @Schema(name = "Campo requestSent. XML de Enviado")
    @JsonProperty(value = "requestSent")
    private String requestSent;

}