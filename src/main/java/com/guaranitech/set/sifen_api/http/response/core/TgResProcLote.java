package com.guaranitech.set.sifen_api.http.response.core;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Schema(name = "ResultadoProcesamientoLote", description = "Resultado de Procesamiento de Lote")
@Getter
@Setter
@ToString
public class TgResProcLote {

    @Schema(name = "Campo id. CDC del DE procesado.")
    @JsonProperty(value = "cdc")
    private String id;

    @Schema(name = "Campo dEstRes. Estado del resultado")
    @JsonProperty(value = "estado_resultado")
    private String dEstRes;

    @Schema(name = "Campo dProtAut. Número de Transacción")
    @JsonProperty(value = "estado_resultado")
    private String dProtAut;

    @JsonProperty(value = "list_resultado_procesamiento")
    private final List<TgResProc> gResProc = new ArrayList<>();

    public TgResProcLote convertFromTgResProcLote(
            com.roshka.sifen.core.fields.response.batch.TgResProcLote gResProcLote) {
        this.id = gResProcLote.getId();
        this.dEstRes = gResProcLote.getdEstRes();
        this.dProtAut = gResProcLote.getdProtAut();

        gResProcLote
                .getgResProc()
                .stream()
                .forEach(i -> {
                    this.gResProc.add(new TgResProc().convertFromTgResProc(i));
                });

        return this;
    }
}