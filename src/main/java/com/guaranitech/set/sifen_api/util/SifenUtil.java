package com.guaranitech.set.sifen_api.util;

import java.io.File;
import java.io.FileNotFoundException;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import com.roshka.sifen.core.SifenConfig;
import com.roshka.sifen.core.SifenConfig.TipoAmbiente;
import com.roshka.sifen.core.SifenConfig.TipoCertificadoCliente;

import lombok.extern.log4j.Log4j2;

@Log4j2
@Component
@PropertySource("classpath:sifen.properties")
public class SifenUtil {

    private static String CERTIFICADO_CLIENTE;

    private static String SIFEN_AMBIENTE;

    private static String TIPO_CERTIFICADO_CLIENTE;

    private static String ID_CSC;

    private static String CSC;

    private static boolean isFileexists(String path) {
        File archivo = new File(path);
        return archivo.exists();
    }

    public static SifenConfig getSifenConfig() throws FileNotFoundException {

        log.info("Se obtienen los datos del certificado desde la Base de datos");
        SifenConfig sifenConfig = new SifenConfig();

        if (isFileexists(CERTIFICADO_CLIENTE)) {
            log.info("El certificado existe");
        } else {
            log.info("El certificado no existe. " + CERTIFICADO_CLIENTE);
            throw new FileNotFoundException("El certificado no existe. " + CERTIFICADO_CLIENTE);
        }

        sifenConfig.setAmbiente(TipoAmbiente.valueOf(SIFEN_AMBIENTE));
        sifenConfig.setTipoCertificadoCliente(TipoCertificadoCliente.valueOf(TIPO_CERTIFICADO_CLIENTE));
        sifenConfig.setCertificadoCliente(CERTIFICADO_CLIENTE);
        sifenConfig.setContrasenaCertificadoCliente(CERTIFICADO_CLIENTE);
        sifenConfig.setIdCSC(ID_CSC);
        sifenConfig.setCSC(CSC);
        sifenConfig.setHabilitarNotaTecnica13(true);

        return sifenConfig;

    }

    @Value("${sifen.sifenAmbiente}")
    public void setSifenAmbiente(String sifenAmbiente) {
        SIFEN_AMBIENTE = sifenAmbiente;
    }

    @Value("${sifen.csc}")
    public void setCsc(String csc) {
        CSC = csc;
    }

    @Value("${sifen.certificadoCliente}")
    public void setCertificadoCliente(String certificadoCliente) {
        CERTIFICADO_CLIENTE = certificadoCliente;
    }

    @Value("${sifen.tipoCertificadoCliente}")
    public void setTipoCertificadoCliente(String tipoCertificadoCliente) {
        TIPO_CERTIFICADO_CLIENTE = tipoCertificadoCliente;
    }

    @Value("${sifen.idCsc}")
    public void setIdCsc(String idCsc) {
        ID_CSC = idCsc;
    }

}
