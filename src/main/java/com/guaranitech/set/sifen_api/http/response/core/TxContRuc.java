package com.guaranitech.set.sifen_api.http.response.core;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Schema(name = "RespuestaConsultaRUCDTO", description = "Respuesta de Consulta de RUC")
@Getter
@Setter
@ToString
public class TxContRuc {

    @Schema(name = "Campo dRUCCons. RUC consultado.")
    @JsonProperty(value = "ruc")
    private String dRUCCons;

    @Schema(name = "Campo dRazCons. Razón social del RUC Consultado.")
    @JsonProperty(value = "razon_social")
    private String dRazCons;

    @Schema(name = "Campo dCodEstCons. Código del Estado del RUC Consultado.")
    @JsonProperty(value = "codigo_estado")
    private String dCodEstCons;

    @Schema(name = "Campo dDesEstCons. Descripción Código del Estado del RUC Consultado.")
    @JsonProperty(value = "descripcion_estado")
    private String dDesEstCons;

    @Schema(name = "Campo dRUCFactElec. RUC consultado es facturador electrónico.")
    @JsonProperty(value = "descripcion_estado")
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
