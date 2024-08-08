package com.guaranitech.set.sifen_api.http.response;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import com.guaranitech.set.sifen_api.http.response.core.TgResProcLote;
import com.roshka.sifen.core.beans.response.RespuestaConsultaLoteDE;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class RespuestaConsultaLoteDEDTO extends BaseResponse {
    private LocalDateTime dFecProc;
    private String dCodResLot;
    private String dMsgResLot;
    private final List<TgResProcLote> gResProcLoteList = new ArrayList<>();

    public RespuestaConsultaLoteDEDTO convertFromRespuestaConsultaLoteDEDTO(
            RespuestaConsultaLoteDE respuestaConsultaLoteDE) {

        this.dFecProc = respuestaConsultaLoteDE.getdFecProc();
        this.dCodResLot = respuestaConsultaLoteDE.getdCodResLot();
        this.dMsgResLot = respuestaConsultaLoteDE.getdMsgResLot();

        this.setCodigoEstado(respuestaConsultaLoteDE.getCodigoEstado());
        this.setRespuestaBruta(respuestaConsultaLoteDE.getRespuestaBruta());
        this.setDCodRes(respuestaConsultaLoteDE.getdCodRes());
        this.setDMsgRes(respuestaConsultaLoteDE.getdMsgRes());
        this.setRequestSent(respuestaConsultaLoteDE.getRequestSent());

        respuestaConsultaLoteDE
                .getgResProcLoteList()
                .stream()
                .forEach(i -> {
                    gResProcLoteList.add(new TgResProcLote().convertFromTgResProcLote(i));
                });

        return this;
    }

}