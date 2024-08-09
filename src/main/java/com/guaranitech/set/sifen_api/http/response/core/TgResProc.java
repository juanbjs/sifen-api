package com.guaranitech.set.sifen_api.http.response.core;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Schema(name = "ResultadoProcesamiento", description = "Resultado de Procesamiento")
@Getter
@Setter
@ToString
public class TgResProc {

    @Schema(name = "Campo dCodRes. Código del resultado de procesamiento.")
    @JsonProperty(value = "codigo_resultado")
    private String dCodRes;

    @Schema(name = "Campo dMsgRes. Mensaje del resultado de procesamiento.")
    @JsonProperty(value = "mensaje_resultado")
    private String dMsgRes;

    public TgResProc convertFromTgResProc(com.roshka.sifen.core.fields.response.TgResProc gResProc) {
        this.dCodRes = gResProc.getdCodRes();
        this.dMsgRes = gResProc.getdMsgRes();

        return this;
    }
}