package com.guaranitech.set.sifen_api.http.response.core;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class TxContRuc {
    private String dRUCCons;
    private String dRazCons;
    private String dCodEstCons;
    private String dDesEstCons;
    private String dRUCFactElec;

    public TxContRuc convertFromTxContRuc(com.roshka.sifen.core.fields.response.ruc.TxContRuc xContRuc) {

        this.dRUCCons = xContRuc.getdRUCCons();
        this.dRazCons = xContRuc.getdRazCons();
        this.dCodEstCons = xContRuc.getdCodEstCons();
        this.dDesEstCons = xContRuc.getdDesEstCons();
        this.dRUCFactElec = xContRuc.getdRUCFactElec();

        return this;
    }

}
