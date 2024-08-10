package com.guaranitech.set.sifen_api.controller;

import java.io.FileNotFoundException;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.guaranitech.set.sifen_api.http.request.DocumentoElectronicoDTO;
import com.guaranitech.set.sifen_api.http.response.RespuestaConsultaLoteDEDTO;
import com.guaranitech.set.sifen_api.http.response.RespuestaRecepcionDEDTO;
import com.guaranitech.set.sifen_api.http.response.RespuestaRecepcionLoteDEDTO;
import com.guaranitech.set.sifen_api.service.DocumentoElectronicoService;
import com.roshka.sifen.core.exceptions.SifenException;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;

@Tag(name = "Documentos Electronicos", description = "API para enviar documentos electronicos a la SIFEN")
@RestController
@RequestMapping("/api/documento/electronico")
public class DocumentoElectronicoController {

	private DocumentoElectronicoService documentoElectronicoService;

	@Operation(summary = "Enviar documentos electronicos a la SIFEN")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "DE enviada a la SIFEN exitosamente", content = {
					@Content(mediaType = "application/json", schema = @Schema(implementation = RespuestaRecepcionDEDTO.class)) }),
			@ApiResponse(responseCode = "400", description = "Error al intentar enviar el DE a la SIFEN", content = @Content),
			@ApiResponse(responseCode = "500", description = "Error al obtener el Certidicado del Emisor o firmar el documento", content = @Content) })
	@PostMapping("/sync")
	public ResponseEntity<RespuestaRecepcionDEDTO> sendDESync(
			@RequestBody @Valid DocumentoElectronicoDTO deDTO)
			throws SifenException, FileNotFoundException {
		return ResponseEntity.ok(documentoElectronicoService.processDESync(deDTO));
	}

	@Operation(summary = "Enviar documentos electronicos a la SIFEN en Lotes")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "Lote enviado a la SIFEN exitosamente", content = {
					@Content(mediaType = "application/json", schema = @Schema(implementation = RespuestaRecepcionDEDTO.class)) }),
			@ApiResponse(responseCode = "400", description = "Error al intentar enviar el Lote a la SIFEN", content = @Content),
			@ApiResponse(responseCode = "500", description = "Error al obtener el Certidicado del Emisor o firmar el documento", content = @Content) })
	@PostMapping("/lote")
	public ResponseEntity<RespuestaRecepcionLoteDEDTO> sendDELote(
			@RequestBody @Valid List<DocumentoElectronicoDTO> deDTOList)
			throws SifenException, FileNotFoundException {
		return ResponseEntity.ok(documentoElectronicoService.processDELote(deDTOList));
	}

	@Operation(summary = "Consultar el estado de los documentos electronicos a la SIFEN por LOTE")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "Consulta procesada con Exito", content = {
					@Content(mediaType = "application/json", schema = @Schema(implementation = RespuestaConsultaLoteDEDTO.class)) }),
			@ApiResponse(responseCode = "400", description = "Error al intentar consultar el estado de los lotes a la SIFEN", content = @Content) })
	@PostMapping("/consulta/lote/{nroLote}")
	public RespuestaConsultaLoteDEDTO consultaLote(@PathVariable String nroLote)
			throws FileNotFoundException, SifenException {
		return documentoElectronicoService.consultaLote(nroLote);
	}

}
