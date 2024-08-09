package com.guaranitech.set.sifen_api.http.response.core;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Schema(name = "ProtocoloProcesamientoDE", description = "Protocolo de procesamiento del DE")
@Getter
@Setter
@ToString
public class TxProtDe {

    @Schema(name = "Campo id. CDC del DE procesado.")
    @JsonProperty(value = "cdc")
    private String id;

    @Schema(name = "Campo dFecProc. Fecha y hora del procesamiento")
    @JsonProperty(value = "fecha_hora_procesamiento")
    private LocalDateTime dFecProc;

    @Schema(name = "Campo dDigVal. DigestValue del DE procesado.")
    @JsonProperty(value = "digest_value")
    private String dDigVal;

    @Schema(name = "Campo dEstRes. Estado del resultado")
    @JsonProperty(value = "estado_resultado")
    private String dEstRes;

    @Schema(name = "Campo dProtAut. Número de Transacción")
    @JsonProperty(value = "estado_resultado")
    private String dProtAut;
    private final List<TgResProc> gResProc = new ArrayList<>();

    public TxProtDe convertFromTxProtDe(com.roshka.sifen.core.fields.response.TxProtDe xProtDe) {
        this.id = xProtDe.getId();
        this.dFecProc = xProtDe.getdFecProc();
        this.dDigVal = xProtDe.getdDigVal();
        this.dEstRes = xProtDe.getdEstRes();
        this.dProtAut = xProtDe.getdProtAut();

        xProtDe
                .getgResProc()
                .stream()
                .forEach(i -> {
                    this.gResProc.add(new TgResProc().convertFromTgResProc(i));
                });

        return this;
    }

}