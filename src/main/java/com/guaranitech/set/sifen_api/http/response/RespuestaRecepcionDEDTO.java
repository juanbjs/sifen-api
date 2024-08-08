package com.guaranitech.set.sifen_api.http.response;

import com.guaranitech.set.sifen_api.http.response.core.TxProtDe;
import com.roshka.sifen.core.beans.response.RespuestaRecepcionDE;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class RespuestaRecepcionDEDTO extends BaseResponse {
    private TxProtDe xProtDE;

    public RespuestaRecepcionDEDTO convertFromRespuestaRecepcionDE(RespuestaRecepcionDE respuestaRecepcionDE) {
        this.xProtDE = new TxProtDe().convertFromTxProtDe(respuestaRecepcionDE.getxProtDE());

        this.setCodigoEstado(respuestaRecepcionDE.getCodigoEstado());
        this.setRespuestaBruta(respuestaRecepcionDE.getRespuestaBruta());
        this.setDCodRes(respuestaRecepcionDE.getdCodRes());
        this.setDMsgRes(respuestaRecepcionDE.getdMsgRes());
        this.setRequestSent(respuestaRecepcionDE.getRequestSent());

        return this;
    }
}