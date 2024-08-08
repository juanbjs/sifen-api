package com.guaranitech.set.sifen_api.http.response;

import java.time.LocalDateTime;

import com.roshka.sifen.core.beans.response.RespuestaRecepcionLoteDE;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class RespuestaRecepcionLoteDEDTO extends BaseResponse {
    private LocalDateTime dFecProc;
    private String dProtConsLote;
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