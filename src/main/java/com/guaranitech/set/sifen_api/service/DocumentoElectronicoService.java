package com.guaranitech.set.sifen_api.service;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.guaranitech.set.sifen_api.http.request.DocumentoElectronicoDTO;
import com.guaranitech.set.sifen_api.http.response.RespuestaConsultaLoteDEDTO;
import com.guaranitech.set.sifen_api.http.response.RespuestaRecepcionDEDTO;
import com.guaranitech.set.sifen_api.http.response.RespuestaRecepcionLoteDEDTO;
import com.guaranitech.set.sifen_api.util.SifenUtil;
import com.roshka.sifen.Sifen;
import com.roshka.sifen.core.SifenConfig;
import com.roshka.sifen.core.beans.DocumentoElectronico;
import com.roshka.sifen.core.beans.response.RespuestaConsultaLoteDE;
import com.roshka.sifen.core.beans.response.RespuestaRecepcionDE;
import com.roshka.sifen.core.beans.response.RespuestaRecepcionLoteDE;
import com.roshka.sifen.core.exceptions.SifenException;

import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
public class DocumentoElectronicoService {

	private RespuestaRecepcionDE enviarOline(DocumentoElectronico documentoElectronico)
			throws SifenException, FileNotFoundException {

		SifenConfig sifenConfig = SifenUtil.getSifenConfig();
		Sifen.setSifenConfig(sifenConfig);
		log.info("Using CONFIG RecepcionDE: " + sifenConfig);
		log.info(documentoElectronico.toString());

		RespuestaRecepcionDE respuestaRecepcionDE = Sifen.recepcionDE(documentoElectronico);

		log.info("Se obtienen los datos del RUC sin Exceptions");
		log.info(respuestaRecepcionDE.getRespuestaBruta());

		return respuestaRecepcionDE;
	}

	private RespuestaRecepcionLoteDE enviarLOTE(List<DocumentoElectronico> listDE)
			throws SifenException, FileNotFoundException {
		RespuestaRecepcionLoteDE respuestaRecepcionLoteDE = new RespuestaRecepcionLoteDE();

		log.info("Se encontraron " + listDE.size());

		SifenConfig sifenConfig = SifenUtil.getSifenConfig();
		Sifen.setSifenConfig(sifenConfig);
		log.info("Using CONFIG RecepcionDE: " + sifenConfig);
		log.info(respuestaRecepcionLoteDE.toString());

		respuestaRecepcionLoteDE = Sifen.recepcionLoteDE(listDE);

		log.info("Se obtienen los datos del RUC sin Exceptions");
		log.info(respuestaRecepcionLoteDE.getRespuestaBruta());

		return respuestaRecepcionLoteDE;
	}

	public RespuestaRecepcionDEDTO processDESync(DocumentoElectronicoDTO deDTO)
			throws SifenException, FileNotFoundException {

		RespuestaRecepcionDE respuestaRecepcionDE = enviarOline(deDTO.dtoToDocumentoElectronico());

		return new RespuestaRecepcionDEDTO().convertFromRespuestaRecepcionDE(respuestaRecepcionDE);

	}

	public RespuestaRecepcionLoteDEDTO processDELote(List<DocumentoElectronicoDTO> deDTOList)
			throws SifenException, FileNotFoundException {

		List<DocumentoElectronico> listDE = new ArrayList<>();

		for (DocumentoElectronicoDTO deDTO : deDTOList) {
			listDE.add(deDTO.dtoToDocumentoElectronico());
		}

		RespuestaRecepcionLoteDE respuestaRecepcionLoteDE = enviarLOTE(listDE);

		return new RespuestaRecepcionLoteDEDTO().convertFromRespuestaRecepcionLoteDE(respuestaRecepcionLoteDE);
	}

	public RespuestaConsultaLoteDEDTO consultaLote(String nroLote) throws FileNotFoundException, SifenException {

		log.info("Se obtiene todos los lotes enviados");

		SifenConfig sifenConfig = SifenUtil.getSifenConfig();
		Sifen.setSifenConfig(sifenConfig);
		log.info("Using CONFIG RecepcionDE: " + sifenConfig);

		RespuestaConsultaLoteDE respuestaConsultaLoteDE = Sifen.consultaLoteDE(nroLote);

		log.info("Se obtienen los datos del RUC sin Exceptions");
		log.info(respuestaConsultaLoteDE.getRespuestaBruta());

		return new RespuestaConsultaLoteDEDTO().convertFromRespuestaConsultaLoteDEDTO(respuestaConsultaLoteDE);
	}

}
