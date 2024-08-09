package com.guaranitech.set.sifen_api.http.response;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.guaranitech.set.sifen_api.http.response.core.TgResProcEVe;
import com.roshka.sifen.core.beans.response.RespuestaRecepcionEvento;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Schema(name = "RespuestaRecepcionEventoDTO", description = "Respuestas de recepcion de eventos")
@Getter
@Setter
@ToString
public class RespuestaRecepcionEventoDTO extends BaseResponse {

    @Schema(name = "Campo dFecProc. Fecha y hora del procesamiento")
    @JsonProperty(value = "fecha_hora_procesamiento")
    private LocalDateTime dFecProc;

    @JsonProperty(value = "lista_respuesta_recepcion_evento")
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