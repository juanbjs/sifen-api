package com.guaranitech.set.sifen_api.http.response.core;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.guaranitech.set.sifen_api.http.request.DocumentoElectronicoDTO;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Schema(name = "ContenedorDocumentoElectronico", description = "Contenedor documento electronico")
@Getter
@Setter
@ToString
public class TxContenDE {

    @JsonProperty(value = "documento_electronico")
    private DocumentoElectronicoDTO DE;

    @Schema(name = "Campo dProtAut. Número de Transacción")
    @JsonProperty(value = "numero_transaccion")
    private String dProtAut;

    @JsonProperty(value = "contenedor_evento")
    private TxContenEv xContEv;

    public TxContenDE convertFromTxContenDE(com.roshka.sifen.core.fields.response.de.TxContenDE xContenDE) {

        this.dProtAut = xContenDE.getdProtAut();
        this.xContEv = new TxContenEv().convertFromTxContenEv(xContenDE.getxContEv());

        return this;
    }

}