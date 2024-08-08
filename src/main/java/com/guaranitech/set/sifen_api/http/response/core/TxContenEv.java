package com.guaranitech.set.sifen_api.http.response.core;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class TxContenEv {
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