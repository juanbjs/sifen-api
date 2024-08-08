package com.guaranitech.set.sifen_api.http.request.event;

import java.time.LocalDateTime;

import com.roshka.sifen.core.types.TiNatRec;
import com.roshka.sifen.core.types.TiTipDocRec;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class TrGeVeDescon {
	private String Id;
	private LocalDateTime dFecEmi;
	private LocalDateTime dFecRecep;
	private TiNatRec iTipRec;
	private String dNomRec;
	private String dRucRec;
	private String dDVRec;
	private TiTipDocRec dTipIDRec;
	private String dNumID;
	private String mOtEve;

}