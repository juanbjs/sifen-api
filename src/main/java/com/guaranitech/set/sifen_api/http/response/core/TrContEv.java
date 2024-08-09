package com.guaranitech.set.sifen_api.http.response.core;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.guaranitech.set.sifen_api.http.request.EventoDTO;
import com.guaranitech.set.sifen_api.http.response.RespuestaRecepcionEventoDTO;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Schema(name = "ContenedorEvento", description = "Contenedor evento")
@Getter
@Setter
@ToString
public class TrContEv {

    @JsonProperty(value = "evento")
    private EventoDTO xEvento;

    @JsonProperty(value = "respuesta_recepcion_evento")
    private RespuestaRecepcionEventoDTO rResEnviEventoDe;

    public TrContEv convertFromTrContEv(com.roshka.sifen.core.fields.response.de.TrContEv rContEv) {

        this.xEvento = new EventoDTO().convertFromEventosDE(rContEv.getxEvento());
        this.rResEnviEventoDe = new RespuestaRecepcionEventoDTO()
                .convertFromRespuestaRecepcionEvento(rContEv.getrResEnviEventoDe());

        return this;
    }

}