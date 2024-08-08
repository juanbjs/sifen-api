package com.guaranitech.set.sifen_api.http.response.core;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class TgResProc {
    private String dCodRes;
    private String dMsgRes;

    public TgResProc convertFromTgResProc(com.roshka.sifen.core.fields.response.TgResProc gResProc) {
        this.dCodRes = gResProc.getdCodRes();
        this.dMsgRes = gResProc.getdMsgRes();

        return this;
    }
}