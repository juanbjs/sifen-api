package com.guaranitech.set.sifen_api.http.request.event;

import com.roshka.sifen.core.types.TDepartamento;
import com.roshka.sifen.core.types.TdMotEv;
import com.roshka.sifen.core.types.TdTipIdenVeh;
import com.roshka.sifen.core.types.TiModTrans;
import com.roshka.sifen.core.types.TiNatRec;
import com.roshka.sifen.core.types.TiTTrans;
import com.roshka.sifen.core.types.TiTipDocRec;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class TrGeVeTr {
	private String Id;
	private TdMotEv dMotEv;
	private TDepartamento cDepEnt;
	private short cDisEnt;
	private String dDesDisEnt;
	private short cCiuEnt;
	private String dDesCiuEnt;
	private String dDirEnt;
	private int dNumCas;
	private String dCompDir1;
	private String dNomChof;
	private String dNumIDChof;
	private TiNatRec iNatTrans;
	private String dRucTrans;
	private String dDVTrans;
	private String dNomTrans;
	private TiTipDocRec iTipIDTrans;
	private String dNumIDTrans;
	private TiTTrans iTipTrans;
	private TiModTrans iModTrans;
	private String dTiVehTras;
	private String dMarVeh;
	private TdTipIdenVeh dTipIdenVeh;
	private String dNroIDVeh;
	private String dNroMatVeh;

}