package com.guaranitech.set.sifen_api.http.request.de;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.roshka.sifen.core.types.PaisType;
import com.roshka.sifen.core.types.TDepartamento;
import com.roshka.sifen.core.types.TiNatRec;
import com.roshka.sifen.core.types.TiTiOpe;
import com.roshka.sifen.core.types.TiTipCont;
import com.roshka.sifen.core.types.TiTipDocRec;

import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.Schema.RequiredMode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Schema(name = "Receptor", description = "Campos que identifican al receptor.")
@Getter
@Setter
@ToString
public class TgDatRec {

	@Schema(name = "naturaleza_receptor", description = "Campo iNatRec."
			+ " Naturaleza del receptor.", requiredMode = RequiredMode.REQUIRED)
	@JsonProperty(value = "naturaleza_receptor")
	private TiNatRec iNatRec;

	@Schema(name = "tipo_operacion", description = "Campo iTiOpe."
			+ " Tipo de operación.", requiredMode = RequiredMode.REQUIRED)
	@JsonProperty(value = "tipo_operacion")
	private TiTiOpe iTiOpe = TiTiOpe.B2C;

	@Schema(name = "pais_receptor", description = "Campo cPaisRec."
			+ " País del receptor."
			+ " Según XSD de Codificación de"
			+ " Países(https://ekuatia.set.gov.py/sifen/xsd/Paises_v100.xsd). https://es.wikipedia.org/wiki/ISO_3166-1#C%C3%B3digos_ISO_3166-1.",
			requiredMode = RequiredMode.REQUIRED)
	@JsonProperty(value = "pais_receptor")
	private PaisType cPaisRec = PaisType.PRY;

	@Schema(name = "tipo_contribuyente", description = "Campo iTiContRec."
			+ " Tipo de contribuyente receptor."
			+ " Obligatorio si naturaleza_receptor = CONTRIBUYENTE.", requiredMode = RequiredMode.NOT_REQUIRED)
	@JsonProperty(value = "tipo_contribuyente")
	private TiTipCont iTiContRec;

	@Schema(name = "ruc", description = "Campo dRucRec."
			+ " RUC del receptor."
			+ " Obligatorio si naturaleza_receptor = CONTRIBUYENTE.", requiredMode = RequiredMode.NOT_REQUIRED)
	@JsonProperty(value = "ruc")
	private String dRucRec;

	@Schema(name = "dígito_verificador", description = "Campo dDVRec."
			+ " Dígito verificador."
			+ " Obligatorio si naturaleza_receptor = CONTRIBUYENTE.", requiredMode = RequiredMode.NOT_REQUIRED)
	@JsonProperty(value = "dígito_verificador")
	private short dDVRec;

	@Schema(name = "tipo_documento", description = "Campo iTipIDRec."
			+ " Tipo de documento."
			+ " Obligatorio si naturaleza_receptor = NO_CONTRIBUYENTE y tipo_operacion != B2F."
			+ " No informar si naturaleza_receptor = CONTRIBUYENTE o tipo_operacion = B2F.", requiredMode = RequiredMode.NOT_REQUIRED)
	@JsonProperty(value = "tipo_documento", required = true)
	private TiTipDocRec iTipIDRec = TiTipDocRec.CEDULA_PARAGUAYA;

	@Schema(name = "numero_documento", description = "Campo dNumIDRec."
			+ " Número de documento de identidad."
			+ " Obligatorio si naturaleza_receptor = NO_CONTRIBUYENTE y tipo_operacion != B2F."
			+ " No informar si naturaleza_receptor = CONTRIBUYENTE o tipo_operacion = B2F.", requiredMode = RequiredMode.NOT_REQUIRED)
	@JsonProperty(value = "numero_documento")
	private String dNumIDRec;

	@Schema(name = "razon_social", description = "Campo dNomRec."
			+ " Nombre o razón social."
			+ " Obligatorio si naturaleza_receptor = NO_CONTRIBUYENTE y tipo_operacion != B2F."
			+ " No informar si naturaleza_receptor = CONTRIBUYENTE o tipo_operacion = B2F.", requiredMode = RequiredMode.NOT_REQUIRED)
	@JsonProperty(value = "razon_social")
	private String dNomRec;

	@Schema(name = "nombre_fantasía", description = "Campo dNomFanRec."
			+ " Nombre de fantasía.", requiredMode = RequiredMode.NOT_REQUIRED)
	@JsonProperty(value = "nombre_fantasía")
	private String dNomFanRec;

	@Schema(name = "direccion", description = "Campo dDirRec."
			+ " Dirección del receptor.", requiredMode = RequiredMode.REQUIRED)
	@JsonProperty(value = "direccion")
	private String dDirRec;

	@Schema(name = "numero_casa", description = "Campo dNumCasRec."
			+ " Número de casa.", requiredMode = RequiredMode.REQUIRED)
	@JsonProperty(value = "numero_casa")
	private int dNumCasRec;

	@Schema(name = "numero_casa", description = "Campo dNumCasRec."
			+ " Número de casa.", requiredMode = RequiredMode.REQUIRED)
	@JsonProperty(value = "departamento")
	private TDepartamento cDepRec;

	@Schema(name = "codigo_distrito", description = "Campo cDisRec."
			+ " Código del distrito.", requiredMode = RequiredMode.REQUIRED)
	@JsonProperty(value = "codigo_distrito")
	private short cDisRec;

	@Schema(name = "descripcion_distrito", description = "Campo dDesDisRec."
			+ " Descripción del distrito.", requiredMode = RequiredMode.REQUIRED)
	@JsonProperty(value = "descripcion_distrito")
	private String dDesDisRec;

	@Schema(name = "codigo_ciudad", description = "Campo cCiuRec."
			+ " Código de la ciudad.", requiredMode = RequiredMode.REQUIRED)
	@JsonProperty(value = "codigo_ciudad")
	private int cCiuRec;

	@Schema(name = "descripcion_ciudad", description = "Campo dDesCiuRec."
			+ " Descripción de la ciudad.", requiredMode = RequiredMode.REQUIRED)
	@JsonProperty(value = "descripcion_ciudad")
	private String dDesCiuRec;

	@Schema(name = "telefono", description = "Campo dTelRec."
			+ " Número de teléfono.", requiredMode = RequiredMode.NOT_REQUIRED)
	@JsonProperty(value = "telefono")
	private String dTelRec;

	@Schema(name = "celular", description = "Campo dCelRec."
			+ " Número de celular.", requiredMode = RequiredMode.NOT_REQUIRED)
	@JsonProperty(value = "celular")
	private String dCelRec;

	@Schema(name = "correo_electronico", description = "Campo dEmailRec."
			+ " Correo electrónico.", requiredMode = RequiredMode.REQUIRED)
	@JsonProperty(value = "correo_electronico")
	private String dEmailRec;

	@Schema(name = "codigo_cliente", description = "Campo dCodCliente."
			+ " Código del cliente.", requiredMode = RequiredMode.NOT_REQUIRED)
	@JsonProperty(value = "codigo_cliente")
	private String dCodCliente;

	public com.roshka.sifen.core.fields.request.de.TgDatRec convertToTgDatRec() {

		com.roshka.sifen.core.fields.request.de.TgDatRec gDatRec = new com.roshka.sifen.core.fields.request.de.TgDatRec();

		gDatRec.setcCiuRec(cCiuRec);
		gDatRec.setcDepRec(cDepRec);
		gDatRec.setcDisRec(cDisRec);
		gDatRec.setcPaisRec(cPaisRec);
		gDatRec.setdCelRec(dCelRec);
		gDatRec.setdCodCliente(dCodCliente);
		gDatRec.setdDVRec(dDVRec);
		gDatRec.setdDesCiuRec(dDesCiuRec);
		gDatRec.setdDesDisRec(dDesDisRec);
		gDatRec.setdDirRec(dDirRec);
		gDatRec.setdEmailRec(dEmailRec);
		gDatRec.setdNomFanRec(dNomFanRec);
		gDatRec.setdNomRec(dNomRec);
		gDatRec.setdNumCasRec(dNumCasRec);
		gDatRec.setdNumIDRec(dNumIDRec);
		gDatRec.setdRucRec(dRucRec);
		gDatRec.setdTelRec(dTelRec);
		gDatRec.setiNatRec(iNatRec);
		gDatRec.setiTiContRec(iTiContRec);
		gDatRec.setiTiOpe(iTiOpe);
		gDatRec.setiTipIDRec(iTipIDRec);
		gDatRec.setdDTipIDRec(iTipIDRec.getDescripcion());

		return gDatRec;
	}
}
