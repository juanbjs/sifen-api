package com.guaranitech.set.sifen_api.http.request;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.guaranitech.set.sifen_api.http.request.event.TrGesEve;
import com.roshka.sifen.core.beans.EventosDE;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.log4j.Log4j2;

@Schema(name = "EventoElectronicoDto", description = "Dto de Eventos Electronicos")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Log4j2
public class EventoDTO {

    @JsonProperty(value = "lista_eventos")
    List<TrGesEve> rGesEveList = new ArrayList<TrGesEve>();

    public EventosDE convertToEventosDE() {

        EventosDE eventosDE = new EventosDE();

        List<com.roshka.sifen.core.fields.request.event.TrGesEve> trGesEveList = new ArrayList<>();

        log.info("EventoDTO - Datos");
        log.info(getRGesEveList().toString());

        for (TrGesEve trGesEve : getRGesEveList()) {
            log.info("EventoDTO - Datos - trGesEve");
            log.info(trGesEve.toString());
            trGesEveList.add(trGesEve.convertToTrGesEve());
        }

        eventosDE.setrGesEveList(trGesEveList);

        return eventosDE;
    }

    public EventoDTO convertFromEventosDE(EventosDE eventosDE) {

        // TODO falta convertir
        eventosDE
                .getrGesEveList()
                .stream()
                .forEach(i -> {
                    rGesEveList.add(new TrGesEve());
                });

        return this;
    }

}
