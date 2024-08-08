package com.guaranitech.set.sifen_api.http.response.core;

import com.guaranitech.set.sifen_api.http.request.DocumentoElectronicoDTO;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class TxContenDE {
    private DocumentoElectronicoDTO DE;
    private String dProtAut;
    private TxContenEv xContEv;

    public TxContenDE convertFromTxContenDE(com.roshka.sifen.core.fields.response.de.TxContenDE xContenDE) {

        this.dProtAut = xContenDE.getdProtAut();
        this.xContEv = new TxContenEv().convertFromTxContenEv(xContenDE.getxContEv());

        return this;
    }

}