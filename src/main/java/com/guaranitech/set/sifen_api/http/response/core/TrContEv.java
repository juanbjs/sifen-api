package com.guaranitech.set.sifen_api.http.response.core;

import com.guaranitech.set.sifen_api.http.request.EventoDTO;
import com.guaranitech.set.sifen_api.http.response.RespuestaRecepcionEventoDTO;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class TrContEv {
    private EventoDTO xEvento;
    private RespuestaRecepcionEventoDTO rResEnviEventoDe;

    public TrContEv convertFromTrContEv(com.roshka.sifen.core.fields.response.de.TrContEv rContEv) {

        this.xEvento = new EventoDTO().convertFromEventosDE(rContEv.getxEvento());
        this.rResEnviEventoDe = new RespuestaRecepcionEventoDTO()
                .convertFromRespuestaRecepcionEvento(rContEv.getrResEnviEventoDe());

        return this;
    }

}