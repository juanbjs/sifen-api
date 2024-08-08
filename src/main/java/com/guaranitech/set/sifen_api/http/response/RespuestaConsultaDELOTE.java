package com.guaranitech.set.sifen_api.http.response;

import java.time.LocalDateTime;

import com.guaranitech.set.sifen_api.http.response.core.TxContenDE;
import com.roshka.sifen.core.beans.response.RespuestaConsultaDE;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class RespuestaConsultaDELOTE extends BaseResponse {
    private LocalDateTime dFecProc;
    private TxContenDE xContenDE;

    public RespuestaConsultaDELOTE convertFromRespuestaConsultaDELOTE(RespuestaConsultaDE respuestaConsultaDE) {

        this.dFecProc = respuestaConsultaDE.getdFecProc();
        this.xContenDE = new TxContenDE().convertFromTxContenDE(respuestaConsultaDE.getxContenDE());

        return this;
    }

}