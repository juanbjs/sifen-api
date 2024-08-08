package com.guaranitech.set.sifen_api.http.response.core;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class TgResProcEVe {
    private String dEstRes;
    private String dProtAut;
    private String id;
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