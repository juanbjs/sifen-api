package com.guaranitech.set.sifen_api.service;

import java.io.FileNotFoundException;

import javax.xml.soap.SOAPException;

import org.springframework.stereotype.Service;

import com.guaranitech.set.sifen_api.http.response.RespuestaConsultaRUCDTO;
import com.guaranitech.set.sifen_api.util.SifenUtil;
import com.roshka.sifen.Sifen;
import com.roshka.sifen.core.SifenConfig;
import com.roshka.sifen.core.beans.response.RespuestaConsultaRUC;
import com.roshka.sifen.core.exceptions.SifenException;

import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
public class ConsultaRucService {

	public RespuestaConsultaRUCDTO consultaRuc(String ruc) throws FileNotFoundException, SifenException, SOAPException {
		SifenConfig sifenConfig = SifenUtil.getSifenConfig();

		log.info(ruc);

		Sifen.setSifenConfig(sifenConfig);
		RespuestaConsultaRUC response = Sifen.consultaRUC(ruc);
		log.info("Se obtienen los datos del RUC sin Exceptions");
		log.info(response.getRespuestaBruta());

		return new RespuestaConsultaRUCDTO().convertFromRespuestaConsultaRUC(response);

	}

}
