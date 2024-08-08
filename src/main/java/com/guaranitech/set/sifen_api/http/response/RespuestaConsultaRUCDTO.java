package com.guaranitech.set.sifen_api.http.response;

import com.guaranitech.set.sifen_api.http.response.core.TxContRuc;
import com.roshka.sifen.core.beans.response.RespuestaConsultaRUC;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class RespuestaConsultaRUCDTO extends BaseResponse {
    private TxContRuc xContRUC;

    public RespuestaConsultaRUCDTO convertFromRespuestaConsultaRUC(RespuestaConsultaRUC respuestaConsultaRUC) {

        this.xContRUC = new TxContRuc().convertFromTxContRuc(respuestaConsultaRUC.getxContRUC());

        return this;
    }
}