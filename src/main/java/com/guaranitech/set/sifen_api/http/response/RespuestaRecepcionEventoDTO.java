package com.guaranitech.set.sifen_api.http.response;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import com.guaranitech.set.sifen_api.http.response.core.TgResProcEVe;
import com.roshka.sifen.core.beans.response.RespuestaRecepcionEvento;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class RespuestaRecepcionEventoDTO extends BaseResponse {
    private LocalDateTime dFecProc;
    private final List<TgResProcEVe> gResProcEVe = new ArrayList<>();

    public RespuestaRecepcionEventoDTO convertFromRespuestaRecepcionEvento(
            RespuestaRecepcionEvento respuestaRecepcionEvento) {

        this.dFecProc = respuestaRecepcionEvento.getdFecProc();

        respuestaRecepcionEvento
                .getgResProcEVe()
                .stream()
                .forEach(i -> {
                    gResProcEVe.add(new TgResProcEVe().convertFromTgResProcEVe(i));
                });

        this.setCodigoEstado(respuestaRecepcionEvento.getCodigoEstado());
        this.setRespuestaBruta(respuestaRecepcionEvento.getRespuestaBruta());
        this.setDCodRes(respuestaRecepcionEvento.getdCodRes());
        this.setDMsgRes(respuestaRecepcionEvento.getdMsgRes());
        this.setRequestSent(respuestaRecepcionEvento.getRequestSent());

        return this;
    }

}