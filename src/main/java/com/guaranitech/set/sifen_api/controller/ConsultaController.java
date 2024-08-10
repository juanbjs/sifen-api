package com.guaranitech.set.sifen_api.controller;

import java.io.FileNotFoundException;

import javax.xml.soap.SOAPException;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.guaranitech.set.sifen_api.http.response.RespuestaConsultaRUCDTO;
import com.guaranitech.set.sifen_api.service.ConsultaRucService;
import com.roshka.sifen.core.exceptions.SifenException;

import io.swagger.v3.oas.annotations.tags.Tag;

@Tag(name = "Consulta de RUC", description = "API para consultar RUC a la SIFEN")
@RestController
@RequestMapping("/api/consulta")
public class ConsultaController {

    private final ConsultaRucService consultaRucService;

    public ConsultaController(ConsultaRucService consultaRucService) {
        this.consultaRucService = consultaRucService;
    }

    @GetMapping("/ruc/{ruc}")
    public RespuestaConsultaRUCDTO consultaRuc(@PathVariable String ruc)
            throws FileNotFoundException, SifenException, SOAPException {
        return consultaRucService.consultaRuc(ruc);
    }
}
