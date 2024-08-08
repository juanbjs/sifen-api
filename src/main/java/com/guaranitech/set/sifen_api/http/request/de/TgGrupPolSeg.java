package com.guaranitech.set.sifen_api.http.request.de;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class TgGrupPolSeg {

    @JsonProperty(value = "codigo_poliza")
    private String dPoliza;

    @JsonProperty(value = "unidad_tiempo")
    private String dUnidVig;

    @JsonProperty(value = "vigencia_poliza")
    private BigDecimal dVigencia;

    @JsonProperty(value = "numero_poliza")
    private String dNumPoliza;

    @JsonProperty(value = "fecha_inicio_vigencia")
    private LocalDateTime dFecIniVig;

    @JsonProperty(value = "fecha_fin_vigencia")
    private LocalDateTime dFecFinVig;

    @JsonProperty(value = "codigo_interno")
    private String dCodInt;

    public static List<com.roshka.sifen.core.fields.request.de.TgGrupPolSeg> convertToTgGrupPolSeg(
            List<TgGrupPolSeg> gGrupPolSegList) {

        List<com.roshka.sifen.core.fields.request.de.TgGrupPolSeg> gGrupPolSegLst = new ArrayList<com.roshka.sifen.core.fields.request.de.TgGrupPolSeg>();

        for (TgGrupPolSeg varTgGrupPolSeg : gGrupPolSegList) {
            com.roshka.sifen.core.fields.request.de.TgGrupPolSeg gGrupPolSeg = new com.roshka.sifen.core.fields.request.de.TgGrupPolSeg();

            gGrupPolSeg.setdCodInt(varTgGrupPolSeg.getDCodInt());
            gGrupPolSeg.setdFecFinVig(varTgGrupPolSeg.getDFecFinVig());
            gGrupPolSeg.setdFecIniVig(varTgGrupPolSeg.getDFecIniVig());
            gGrupPolSeg.setdNumPoliza(varTgGrupPolSeg.getDNumPoliza());
            gGrupPolSeg.setdPoliza(varTgGrupPolSeg.getDPoliza());
            gGrupPolSeg.setdUnidVig(varTgGrupPolSeg.getDUnidVig());
            gGrupPolSeg.setdVigencia(varTgGrupPolSeg.getDVigencia());

            gGrupPolSegLst.add(gGrupPolSeg);
        }

        return gGrupPolSegLst;
    }

}
