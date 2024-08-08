package com.guaranitech.set.sifen_api.http.response.core;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class TgResProcLote {
    private String id;
    private String dEstRes;
    private String dProtAut;
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