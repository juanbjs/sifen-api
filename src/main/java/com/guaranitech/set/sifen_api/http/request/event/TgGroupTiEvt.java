package com.guaranitech.set.sifen_api.http.request.event;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.v3.oas.annotations.Hidden;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Schema(name = "Eventos", description = "Grupo de campos del tipo de evento.")
@Getter
@Setter
@ToString
public class TgGroupTiEvt {

    @JsonProperty(value = "cancelacion")
    private TrGeVeCan rGeVeCan;

    @Hidden
    @JsonIgnore
    private TrGeVeInu rGeVeInu;

    @Hidden
    @JsonIgnore
    private TrGeVeNotRec rGeVeNotRec;

    @Hidden
    @JsonIgnore
    private TrGeVeConf rGeVeConf;

    @Hidden
    @JsonIgnore
    private TrGeVeDisconf rGeVeDisconf;

    @Hidden
    @JsonIgnore
    private TrGeVeDescon rGeVeDescon;

    @Hidden
    @JsonIgnore
    private TrGeVeTr rGeVeTr;

    // Automáticos
    @Hidden
    @JsonIgnore
    private TrGeVeRetAce rGeVeRetAce;

    @Hidden
    @JsonIgnore
    private TrGeVeRetAnu rGeVeRetAnu;

    @Hidden
    @JsonIgnore
    private TrGeVeCCFF rGeVeCCFF;

    @Hidden
    @JsonIgnore
    private TrGeDevCCFFCue rGeDevCCFFCue;

    @Hidden
    @JsonIgnore
    private TrGeDevCCFFDev rGeDevCCFFDev;

    @Hidden
    @JsonIgnore
    private TrGeVeAnt rGeVeAnt;

    @Hidden
    @JsonIgnore
    private TrGeVeRem rGeVeRem;

    public com.roshka.sifen.core.fields.request.event.TgGroupTiEvt convertToTgGroupTiEvt() {

        com.roshka.sifen.core.fields.request.event.TgGroupTiEvt gGroupTiEvt = new com.roshka.sifen.core.fields.request.event.TgGroupTiEvt();

        if (rGeVeCan != null) {
            gGroupTiEvt.setrGeVeCan(rGeVeCan.convertToTrGeVeCan());
        }

        return gGroupTiEvt;
    }
}