package com.guaranitech.set.sifen_api.http.request.de;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.roshka.sifen.core.types.TDepartamento;
import com.roshka.sifen.core.types.TiNatVen;
import com.roshka.sifen.core.types.TiTipDoc;

import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.Schema.RequiredMode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Schema(name = "AutofacturaElectronica", description = "Campos que componen la Autofactura Electrónica."
		+ " Obligatorio si el Tipo de Documento Electrónico = Autofactura Electrónica.")
@Getter
@Setter
@ToString
public class TgCamAE {

	@Schema(name = "naturaleza_vendedor", description = "Campo iNatVen."
			+ " Naturaleza del vendedor.", requiredMode = RequiredMode.REQUIRED)
	@JsonProperty(value = "naturaleza_vendedor")
	private TiNatVen iNatVen;

	@Schema(name = "tipo_documento_vendedor", description = "Campo iTipIDVen."
			+ " Tipo de documento de identidad del vendedo.", requiredMode = RequiredMode.REQUIRED)
	@JsonProperty(value = "tipo_documento_vendedor")
	private TiTipDoc iTipIDVen;

	@Schema(name = "numero_documento_vendedor", description = "Campo dNumIDVen."
			+ " Número de documento de identidad.", requiredMode = RequiredMode.REQUIRED)
	@JsonProperty(value = "numero_documento_vendedor")
	private String dNumIDVen;

	@Schema(name = "nombre_vendedor", description = "Campo dNomVen."
			+ " Nombre y apellido del vendedor.", requiredMode = RequiredMode.REQUIRED)
	@JsonProperty(value = "nombre_vendedor")
	private String dNomVen;

	@Schema(name = "direccion_vendedor", description = "Campo dDirVen."
			+ " Dirección del vendedor."
			+ " En caso de extranjeros, colocar la dirección "
			+ " en donde se realizó la transacción.", requiredMode = RequiredMode.REQUIRED)
	@JsonProperty(value = "direccion_vendedor")
	private String dDirVen;

	@Schema(name = "numero_casa_vendedor", description = "Campo dNumCasVen."
			+ " Número de casa del vendedor.", requiredMode = RequiredMode.REQUIRED)
	@JsonProperty(value = "numero_casa_vendedor")
	private int dNumCasVen;

	@Schema(name = "departamento_vendedor", description = "Campo cDepVen."
			+ " Código del departamento del vendedor.", requiredMode = RequiredMode.REQUIRED)
	@JsonProperty(value = "departamento_vendedor")
	private TDepartamento cDepVen;

	@Schema(name = "distrito_vendedor", description = "Campo cDisVen."
			+ " Código del distrito del vendedor.", requiredMode = RequiredMode.REQUIRED)
	@JsonProperty(value = "distrito_vendedor")
	private short cDisVen;

	@Schema(name = "descripcion_distrito_vendedor", description = "Campo dDesDisVen."
			+ " Descripción del distrito del vendedor.", requiredMode = RequiredMode.REQUIRED)
	@JsonProperty(value = "descripcion_distrito_vendedor")
	private String dDesDisVen;

	@Schema(name = "ciudad_vendedor", description = "Campo cCiuVen."
			+ " Código de la distrito del vendedor.", requiredMode = RequiredMode.REQUIRED)
	@JsonProperty(value = "ciudad_vendedor")
	private int cCiuVen;

	@Schema(name = "descripcion_ciudad_vendedor", description = "Campo dDesCiuVen."
			+ " Descripción de la ciudad del vendedor.", requiredMode = RequiredMode.REQUIRED)
	@JsonProperty(value = "descripcion_ciudad_vendedor")
	private String dDesCiuVen;

	@Schema(name = "direccion_transaccion", description = "Campo dDirProv."
			+ " Lugar de la transacción.", requiredMode = RequiredMode.REQUIRED)
	@JsonProperty(value = "direccion_transaccion")
	private String dDirProv;

	@Schema(name = "departamento_transaccion", description = "Campo cDepProv."
			+ " Código del departamento donde se"
			+ " realiza la transacción.", requiredMode = RequiredMode.REQUIRED)
	@JsonProperty(value = "departamento_transaccion")
	private TDepartamento cDepProv;

	@Schema(name = "distrito_transaccion", description = "Campo cDisProv."
			+ " Código del distrito "
			+ "donde se realiza la transacción.", requiredMode = RequiredMode.REQUIRED)
	@JsonProperty(value = "distrito_transaccion")
	private short cDisProv;

	@Schema(name = "descripcion_distrito_transaccion", description = "Campo dDesDisProv."
			+ " Descripción del distrito "
			+ "donde se realiza la transacción.", requiredMode = RequiredMode.REQUIRED)
	@JsonProperty(value = "descripcion_distrito_transaccion")
	private String dDesDisProv;

	@Schema(name = "ciudad_transaccion", description = "Campo cCiuProv."
			+ " Código de la ciudad "
			+ "donde se realiza la transacción.", requiredMode = RequiredMode.REQUIRED)
	@JsonProperty(value = "ciudad_transaccion")
	private int cCiuProv;

	@Schema(name = "descripcion_ciudad_transaccion", description = "Campo dDesCiuProv."
			+ " Descripción de la ciudad "
			+ "donde se realiza la transacción.", requiredMode = RequiredMode.REQUIRED)
	@JsonProperty(value = "descripcion_ciudad_transaccion")
	private String dDesCiuProv;

	public com.roshka.sifen.core.fields.request.de.TgCamAE convertToTgCamAE() {

		com.roshka.sifen.core.fields.request.de.TgCamAE gCamAE = new com.roshka.sifen.core.fields.request.de.TgCamAE();

		gCamAE.setcCiuProv(cCiuProv);
		gCamAE.setcCiuVen(cCiuVen);
		gCamAE.setcDepProv(cDepProv);
		gCamAE.setcDepVen(cDepVen);
		gCamAE.setcDisProv(cDisProv);
		gCamAE.setcDisVen(cDisVen);
		gCamAE.setdDesCiuProv(dDesCiuProv);
		gCamAE.setdDesCiuVen(dDesCiuVen);
		gCamAE.setdDesDisProv(dDesDisProv);
		gCamAE.setdDesDisVen(dDesDisVen);
		gCamAE.setdDirProv(dDirProv);
		gCamAE.setdDirVen(dDirVen);
		gCamAE.setdNomVen(dNomVen);
		gCamAE.setdNumCasVen(dNumCasVen);
		gCamAE.setdNumIDVen(dNumIDVen);
		gCamAE.setiNatVen(iNatVen);
		gCamAE.setiTipIDVen(iTipIDVen);

		return gCamAE;
	}
}
