package com.guaranitech.set.sifen_api.http.response;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.guaranitech.set.sifen_api.http.response.core.TgResProcLote;
import com.roshka.sifen.core.beans.response.RespuestaConsultaLoteDE;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Schema(name = "RespuestaConsultaLoteDEDTO", description = "Consulta de lote de documentos electronicos")
@Getter
@Setter
@ToString
public class RespuestaConsultaLoteDEDTO extends BaseResponse {

    @Schema(name = "Campo dFecProc. Fecha y hora del procesamiento")
    @JsonProperty(value = "fecha_hora_procesamiento")
    private LocalDateTime dFecProc;

    @Schema(name = "Campo dCodResLot. Código de resultado de procesamiento del lote.")
    @JsonProperty(value = "codigo_resultado_lote")
    private String dCodResLot;

    @Schema(name = "Campo dMsgResLot. Mensaje del resultado de procesamiento del lote.")
    @JsonProperty(value = "mensaje_resultado_lote")
    private String dMsgResLot;

    @JsonProperty(value = "list_resultado_procesamiento_lote")
    private final List<TgResProcLote> gResProcLoteList = new ArrayList<>();

    public RespuestaConsultaLoteDEDTO convertFromRespuestaConsultaLoteDEDTO(
            RespuestaConsultaLoteDE respuestaConsultaLoteDE) {

        this.dFecProc = respuestaConsultaLoteDE.getdFecProc();
        this.dCodResLot = respuestaConsultaLoteDE.getdCodResLot();
        this.dMsgResLot = respuestaConsultaLoteDE.getdMsgResLot();

        this.setCodigoEstado(respuestaConsultaLoteDE.getCodigoEstado());
        this.setRespuestaBruta(respuestaConsultaLoteDE.getRespuestaBruta());
        this.setDCodRes(respuestaConsultaLoteDE.getdCodRes());
        this.setDMsgRes(respuestaConsultaLoteDE.getdMsgRes());
        this.setRequestSent(respuestaConsultaLoteDE.getRequestSent());

        respuestaConsultaLoteDE
                .getgResProcLoteList()
                .stream()
                .forEach(i -> {
                    gResProcLoteList.add(new TgResProcLote().convertFromTgResProcLote(i));
                });

        return this;
    }

}