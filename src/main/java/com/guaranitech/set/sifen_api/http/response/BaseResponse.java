package com.guaranitech.set.sifen_api.http.response;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public abstract class BaseResponse {
    private int codigoEstado;
    private String respuestaBruta;

    private String dCodRes;
    private String dMsgRes;
    private String requestSent;

}