package com.guaranitech.set.sifen_api.util;

import java.io.File;
import java.io.FileNotFoundException;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.roshka.sifen.core.SifenConfig;
import com.roshka.sifen.core.SifenConfig.TipoAmbiente;
import com.roshka.sifen.core.SifenConfig.TipoCertificadoCliente;

import lombok.extern.log4j.Log4j2;

@Log4j2
@Component
public class SifenUtil {

    @Value("${sifen.certificadoCliente}")
    private static String certificadoCliente;

    @Value("${sifen.sifenAmbiente}")
    private static String sifenAmbiente;

    @Value("${sifen.tipoCertificadoCliente}")
    private static String tipoCertificadoCliente;

    @Value("${sifen.idCsc}")
    private static String idCsc;

    @Value("${sifen.csc}")
    private static String csc;

	private static boolean isFileexists(String path) {
		File archivo = new File(path);
		return archivo.exists();
	}

    public static SifenConfig getSifenConfig() throws FileNotFoundException {

        log.info("Se obtienen los datos del certificado desde la Base de datos");
        SifenConfig sifenConfig = new SifenConfig();

        if (isFileexists(certificadoCliente)) {
        	log.info("El certificado existe");
        } else {
        	log.info("El certificado no existe. " + certificadoCliente);
        	throw new FileNotFoundException("El certificado no existe. " + certificadoCliente);
        }
        
        sifenConfig.setAmbiente(TipoAmbiente.valueOf(sifenAmbiente));
        sifenConfig.setTipoCertificadoCliente(TipoCertificadoCliente.valueOf(tipoCertificadoCliente));
        sifenConfig.setCertificadoCliente(certificadoCliente);
        sifenConfig.setContrasenaCertificadoCliente(certificadoCliente);
        sifenConfig.setIdCSC(idCsc);
        sifenConfig.setCSC(csc);
        sifenConfig.setHabilitarNotaTecnica13(true);

        return sifenConfig;

    }

}
