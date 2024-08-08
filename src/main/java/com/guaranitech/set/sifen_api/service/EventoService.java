package com.guaranitech.set.sifen_api.service;

import java.io.FileNotFoundException;

import org.springframework.stereotype.Service;

import com.guaranitech.set.sifen_api.http.request.EventoDTO;
import com.guaranitech.set.sifen_api.http.response.RespuestaRecepcionEventoDTO;
import com.guaranitech.set.sifen_api.util.SifenUtil;
import com.roshka.sifen.Sifen;
import com.roshka.sifen.core.SifenConfig;
import com.roshka.sifen.core.beans.EventosDE;
import com.roshka.sifen.core.beans.response.RespuestaRecepcionEvento;
import com.roshka.sifen.core.exceptions.SifenException;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;

@AllArgsConstructor
@Log4j2
@Service
public class EventoService {

    private RespuestaRecepcionEvento enviarEventoSync(EventosDE eventosDE)
            throws FileNotFoundException, SifenException {

        SifenConfig sifenConfig = SifenUtil.getSifenConfig();
        Sifen.setSifenConfig(sifenConfig);
        log.info("Using CONFIG RecepcionDE: " + sifenConfig);
        log.info(eventosDE.toString());

        RespuestaRecepcionEvento respuestaRecepcionEvento = Sifen.recepcionEvento(eventosDE);

        log.info("Se obtienen los datos del RUC sin Exceptions");
        log.info(respuestaRecepcionEvento.getRespuestaBruta());
        return respuestaRecepcionEvento;

    }

    public RespuestaRecepcionEventoDTO processEvent(EventoDTO dto) throws FileNotFoundException, SifenException {

        RespuestaRecepcionEvento respuestaRecepcionEvento = enviarEventoSync(dto.convertToEventosDE());

        return new RespuestaRecepcionEventoDTO().convertFromRespuestaRecepcionEvento(respuestaRecepcionEvento);
    }

}
