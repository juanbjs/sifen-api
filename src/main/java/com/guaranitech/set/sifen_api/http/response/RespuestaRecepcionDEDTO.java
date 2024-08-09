package com.guaranitech.set.sifen_api.http.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.guaranitech.set.sifen_api.http.response.core.TxProtDe;
import com.roshka.sifen.core.beans.response.RespuestaRecepcionDE;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Schema(name = "RespuestaRecepcionDEDTO", description = "Respuesta de Recepcion del DE")
@Getter
@Setter
@ToString
public class RespuestaRecepcionDEDTO extends BaseResponse {

    @JsonProperty(value = "protocolo_procesamiento")
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