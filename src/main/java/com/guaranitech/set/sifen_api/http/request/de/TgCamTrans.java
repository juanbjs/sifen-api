package com.guaranitech.set.sifen_api.http.request.de;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.roshka.sifen.core.types.PaisType;
import com.roshka.sifen.core.types.TiNatRec;
import com.roshka.sifen.core.types.TiTipDoc;

import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.Schema.RequiredMode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Schema(name = "Transportista", description = "Campos que identifican al transportista.")
@Getter
@Setter
@ToString
public class TgCamTrans {

	@JsonProperty(value = "naturaleza_transportista")
	private TiNatRec iNatTrans;

	@JsonProperty(value = "nombre_transportista")
	private String dNomTrans;

	@JsonProperty(value = "ruc_transportista")
	private String dRucTrans;

	@JsonProperty(value = "digito_verificador_transportista")
	private short dDVTrans;

	@JsonProperty(value = "tipo_documento_transportista")
	private TiTipDoc iTipIDTrans;

	@JsonProperty(value = "numero_documento_transportista")
	private String dNumIDTrans;

	@Schema(name = "nacionalidad_transportista", description = "Campo cNacTrans."
			+ " Código del país de origen del producto. https://es.wikipedia.org/wiki/ISO_3166-1#C%C3%B3digos_ISO_3166-1", requiredMode = RequiredMode.REQUIRED)
	@JsonProperty(value = "nacionalidad_transportista")
	private PaisType cNacTrans;

	@JsonProperty(value = "numero_documento_chofer")
	private String dNumIDChof;

	@JsonProperty(value = "nombre_chofer")
	private String dNomChof;

	@JsonProperty(value = "domicilio_fiscal_transportista")
	private String dDomFisc;

	@JsonProperty(value = "direccion_fiscal_chofer")
	private String dDirChof;

	@JsonProperty(value = "razon_socia_agente")
	private String dNombAg;

	@JsonProperty(value = "ruc_agente")
	private String dRucAg;

	@JsonProperty(value = "digito_verificador_agente")
	private short dDVAg;

	@JsonProperty(value = "direccion_agente")
	private String dDirAge;

	public com.roshka.sifen.core.fields.request.de.TgCamTrans convertToTgCamTrans() {

		com.roshka.sifen.core.fields.request.de.TgCamTrans gCamTrans = new com.roshka.sifen.core.fields.request.de.TgCamTrans();

		gCamTrans.setcNacTrans(cNacTrans);
		gCamTrans.setdDVAg(dDVAg);
		gCamTrans.setdDVTrans(dDVTrans);
		gCamTrans.setdDirAge(dDirAge);
		gCamTrans.setdDirChof(dDirChof);
		gCamTrans.setdDomFisc(dDomFisc);
		gCamTrans.setdNomTrans(dNomTrans);
		gCamTrans.setdNomChof(dNomChof);
		gCamTrans.setdNombAg(dNombAg);
		gCamTrans.setdNumIDChof(dNumIDChof);
		gCamTrans.setdNumIDTrans(dNumIDTrans);
		gCamTrans.setdRucAg(dRucAg);
		gCamTrans.setdRucTrans(dRucTrans);
		gCamTrans.setiNatTrans(iNatTrans);
		gCamTrans.setiTipIDTrans(iTipIDTrans);

		return gCamTrans;
	}

}
