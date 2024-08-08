package com.guaranitech.set.sifen_api.controller;

import java.io.FileNotFoundException;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.guaranitech.set.sifen_api.http.request.EventoDTO;
import com.guaranitech.set.sifen_api.http.response.RespuestaRecepcionEventoDTO;
import com.guaranitech.set.sifen_api.service.EventoService;
import com.roshka.sifen.core.exceptions.SifenException;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;

@Tag(name = "Eventos", description = "API para enviar eventos a la SIFEN")
@RestController
@RequestMapping("/api/eventos")
public class EventoController {

    private final EventoService eventoService;

    public EventoController(EventoService eventoService) {
        this.eventoService = eventoService;
    }

    @Operation(summary = "Enviar eventos de cancelacion de CDCs a la SIFEN")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Evento  enviado a la SIFEN exitosamente", content = {
                    @Content(mediaType = "application/json", schema = @Schema(implementation = RespuestaRecepcionEventoDTO.class)) }),
            @ApiResponse(responseCode = "400", description = "Error al intentar enviar el evento a la SIFEN", content = @Content) })
    @PostMapping
    public ResponseEntity<RespuestaRecepcionEventoDTO> enviarNotaCreditoDebitoElectronica(
            @RequestBody @Valid EventoDTO dto)
            throws SifenException, FileNotFoundException {
        return ResponseEntity.ok(eventoService.processEvent(dto));
    }

}
