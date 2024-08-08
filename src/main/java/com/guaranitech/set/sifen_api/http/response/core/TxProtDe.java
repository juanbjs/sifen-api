package com.guaranitech.set.sifen_api.http.response.core;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class TxProtDe {
    private String id;
    private LocalDateTime dFecProc;
    private String dDigVal;
    private String dEstRes;
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