package com.guaranitech.set.sifen_api.http.request.event;

import com.roshka.sifen.core.types.TTiDE;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class TrGeVeInu {
	private int dNumTim;
	private String dEst;
	private String dPunExp;
	private String dNumIn;
	private String dNumFin;
	private TTiDE iTiDE;
	private String mOtEve;

}