package com.guaranitech.set.sifen_api.http.request.de;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.roshka.sifen.core.types.TDepartamento;
import com.roshka.sifen.core.types.TTipReg;
import com.roshka.sifen.core.types.TiTipCont;

import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.Schema.RequiredMode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Schema(name = "Emisor", description = "Campos que identifican al emisor.")
@Getter
@Setter
@NoArgsConstructor
@ToString
public class TgEmis {

	@Schema(hidden = true)
	@JsonIgnore
	private String dRucEm;

	@Schema(hidden = true)
	@JsonIgnore
	private String dDVEmi;

	@Schema(hidden = true)
	@JsonIgnore
	private TiTipCont iTipCont;

	@Schema(hidden = true)
	@JsonIgnore
	private TTipReg cTipReg;

	@Schema(hidden = true)
	@JsonIgnore
	private String dNomEmi;

	@Schema(hidden = true)
	@JsonIgnore
	private String dNomFanEmi;

	@Schema(hidden = true)
	@JsonIgnore
	private String dDirEmi;

	@Schema(hidden = true)
	@JsonIgnore
	private String dNumCas;

	@Schema(hidden = true)
	@JsonIgnore
	private String dCompDir1;

	@Schema(hidden = true)
	@JsonIgnore
	private String dCompDir2;

	@Schema(hidden = true)
	@JsonIgnore
	private TDepartamento cDepEmi;

	@Schema(hidden = true)
	@JsonIgnore
	private short cDisEmi;

	@Schema(hidden = true)
	@JsonIgnore
	private String dDesDisEmi;

	@Schema(hidden = true)
	@JsonIgnore
	private int cCiuEmi;

	@Schema(hidden = true)
	@JsonIgnore
	private String dDesCiuEmi;

	@Schema(hidden = true)
	@JsonIgnore
	private String dTelEmi;

	@Schema(hidden = true)
	@JsonIgnore
	private String dEmailE;

	@Schema(hidden = true)
	@JsonIgnore
	private List<TgActEco> gActEcoList;

	@Schema(name = "sucursal", description = "Campo dDenSuc."
			+ " Denominación comercial de la sucursal",
			requiredMode = RequiredMode.REQUIRED)
	@JsonProperty(value = "sucursal")
	private String dDenSuc;
	
	@JsonProperty(value = "responsable_generacion")
	private TgRespDE gRespDE;

	public com.roshka.sifen.core.fields.request.de.TgEmis convertToTgEmis() {

		com.roshka.sifen.core.fields.request.de.TgEmis gEmis = new com.roshka.sifen.core.fields.request.de.TgEmis();

		gEmis.setcCiuEmi(cCiuEmi);
		gEmis.setcDepEmi(cDepEmi);
		gEmis.setcDisEmi(cDisEmi);
		gEmis.setcTipReg(cTipReg);
		gEmis.setdCompDir1(dCompDir1);
		gEmis.setdCompDir2(dCompDir2);
		gEmis.setdDVEmi(dDVEmi);
		gEmis.setdDenSuc(dDenSuc);
		gEmis.setdDesCiuEmi(dDesCiuEmi);
		gEmis.setdDesDisEmi(dDesDisEmi);
		gEmis.setdDirEmi(dDirEmi);
		gEmis.setdEmailE(dEmailE);
		gEmis.setdNomEmi(dNomEmi);
		gEmis.setdNomFanEmi(dNomFanEmi);
		gEmis.setdNumCas(dNumCas);
		gEmis.setdRucEm(dRucEm);
		gEmis.setdTelEmi(dTelEmi);
		gEmis.setgActEcoList(TgActEco.convertToTgActEco(gActEcoList));
		gEmis.setgRespDE(getGRespDE().convertToTgRespDE());
		gEmis.setiTipCont(iTipCont);

		return gEmis;
	}

	@Schema(hidden = true)
	@JsonIgnore
	public void setITipCont(String value) {
		iTipCont = TiTipCont.valueOf(value);
	}

	@Schema(hidden = true)
	@JsonIgnore
	public void setCTipReg(String value) {
		cTipReg = TTipReg.valueOf(value);
	}

	@Schema(hidden = true)
	@JsonIgnore
	public void setTDepartamento(String value) {
		cDepEmi = TDepartamento.valueOf(value);
	}
	
	@Schema(hidden = true)
	@JsonIgnore
	public void setTDepartamento(short value) {
		cDepEmi = TDepartamento.getByVal(value);
	}

}
