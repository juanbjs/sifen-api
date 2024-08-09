package com.guaranitech.set.sifen_api.http.response;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.guaranitech.set.sifen_api.http.response.core.TxContenDE;
import com.roshka.sifen.core.beans.response.RespuestaConsultaDE;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Schema(name = "RespuestaConsultaDEDto", description = "Consulta de documento electronico")
@Getter
@Setter
@ToString
public class RespuestaConsultaDELOTE extends BaseResponse {

    @Schema(name = "Campo dFecProc. Fecha y hora del procesamiento")
    @JsonProperty(value = "fecha_hora_procesamiento")
    private LocalDateTime dFecProc;

    @JsonProperty(value = "contenedor_documento_electronico")
    private TxContenDE xContenDE;

    public RespuestaConsultaDELOTE convertFromRespuestaConsultaDELOTE(RespuestaConsultaDE respuestaConsultaDE) {

        this.dFecProc = respuestaConsultaDE.getdFecProc();
        this.xContenDE = new TxContenDE().convertFromTxContenDE(respuestaConsultaDE.getxContenDE());

        return this;
    }

}