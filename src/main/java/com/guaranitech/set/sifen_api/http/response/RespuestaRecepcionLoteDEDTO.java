package com.guaranitech.set.sifen_api.http.response;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.roshka.sifen.core.beans.response.RespuestaRecepcionLoteDE;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Schema(name = "RespuestaRecepcionLoteDEDTO", description = "Respuesta de Recepcion de Lote de DE")
@Getter
@Setter
@ToString
public class RespuestaRecepcionLoteDEDTO extends BaseResponse {

    @Schema(name = "Campo dFecProc. Fecha y hora del procesamiento")
    @JsonProperty(value = "fecha_hora_procesamiento")
    private LocalDateTime dFecProc;

    @Schema(name = "Campo dProtConsLote. Número de Lote.")
    @JsonProperty(value = "numero_lote")
    private String dProtConsLote;

    @Schema(name = "Campo dTpoProces. Tiempo medio de procesamiento en segundos.")
    @JsonProperty(value = "tiempo_medio_procesamiento")
    private int dTpoProces;

    public RespuestaRecepcionLoteDEDTO convertFromRespuestaRecepcionLoteDE(
            RespuestaRecepcionLoteDE respuestaRecepcionLoteDE) {

        this.dFecProc = respuestaRecepcionLoteDE.getdFecProc();
        this.dProtConsLote = respuestaRecepcionLoteDE.getdProtConsLote();
        this.dTpoProces = respuestaRecepcionLoteDE.getdTpoProces();

        this.setCodigoEstado(respuestaRecepcionLoteDE.getCodigoEstado());
        this.setRespuestaBruta(respuestaRecepcionLoteDE.getRespuestaBruta());
        this.setDCodRes(respuestaRecepcionLoteDE.getdCodRes());
        this.setDMsgRes(respuestaRecepcionLoteDE.getdMsgRes());
        this.setRequestSent(respuestaRecepcionLoteDE.getRequestSent());

        return this;
    }
}