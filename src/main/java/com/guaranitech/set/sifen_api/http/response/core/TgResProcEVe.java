package com.guaranitech.set.sifen_api.http.response.core;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Schema(name = "ResultadoProcesamientoEvento", description = "Grupo Resultado de Procesamiento del Evento")
@Getter
@Setter
@ToString
public class TgResProcEVe {

    @Schema(name = "Campo dEstRes. Estado del resultado")
    @JsonProperty(value = "estado_resultado")
    private String dEstRes;

    @Schema(name = "Campo dProtAut. Número de Transacción")
    @JsonProperty(value = "estado_resultado")
    private String dProtAut;

    @Schema(name = "Campo id. Identificador del evento ")
    @JsonProperty(value = "id_evento")
    private String id;

    @JsonProperty(value = "list_resultado_procesamiento")
    private final List<TgResProc> gResProc = new ArrayList<>();

    public TgResProcEVe convertFromTgResProcEVe(com.roshka.sifen.core.fields.response.event.TgResProcEVe gResProcEVe) {

        this.id = gResProcEVe.getId();
        this.dEstRes = gResProcEVe.getdEstRes();
        this.dProtAut = gResProcEVe.getdProtAut();

        gResProcEVe
                .getgResProc()
                .stream()
                .forEach(i -> {
                    this.gResProc.add(new TgResProc().convertFromTgResProc(i));
                });

        return this;
    }
}