package com.guaranitech.set.sifen_api.http.request.event;

import java.time.LocalDateTime;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class TrGeVeRetAnu {
	private String Id;
	private int dNumTimRet;
	private String dEstRet;
	private String dPunExpRet;
	private String dNumDocRet;
	private String dCodConRet;
	private LocalDateTime dFeEmiRet;
	private LocalDateTime dFecAnRet;

}