package com.guaranitech.set.sifen_api.http.response.core;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Schema(name = "ContenedorEvento", description = "Contenedor evento")
@Getter
@Setter
@ToString
public class TxContenEv {

    @JsonProperty(value = "lista_eventos")
    private final List<TrContEv> rContEvList = new ArrayList<>();

    public TxContenEv convertFromTxContenEv(com.roshka.sifen.core.fields.response.de.TxContenEv xContenEv) {

        xContenEv
                .getrContEvList()
                .stream()
                .forEach(i -> {
                    rContEvList.add(new TrContEv().convertFromTrContEv(i));
                });

        return this;
    }

}