package com.guaranitech.set.sifen_api.http.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.guaranitech.set.sifen_api.http.response.core.TxContRuc;
import com.roshka.sifen.core.beans.response.RespuestaConsultaRUC;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Schema(name = "RespuestaConsultaRUCDTO", description = "Respuesta de Consulta de RUC")
@Getter
@Setter
@ToString
public class RespuestaConsultaRUCDTO extends BaseResponse {

    @Schema(name = "Campo xContRUC. Contenedor de consulta de RUC.")
    @JsonProperty(value = "contenedor_consulta_ruc")
    private TxContRuc xContRUC;

    public RespuestaConsultaRUCDTO convertFromRespuestaConsultaRUC(RespuestaConsultaRUC respuestaConsultaRUC) {

        this.xContRUC = new TxContRuc().convertFromTxContRuc(respuestaConsultaRUC.getxContRUC());

        return this;
    }
}