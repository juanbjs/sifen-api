package com.guaranitech.set.sifen_api.http.request.de;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.Schema.RequiredMode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Schema(name = "RastreoMercaderia", description = "Grupo de rastreo de la mercadería.")
@Getter
@Setter
@ToString
public class TgRasMerc {

	@Schema(name = "numero_lote", description = "Campo dNumLote."
			+ " Número de lote.", requiredMode = RequiredMode.NOT_REQUIRED)
	@JsonProperty(value = "numero_lote")
	private String dNumLote;

	@Schema(name = "fecha_vencimiento", description = "Campo dVencMerc."
			+ " Fecha de vencimiento"
			+ " de la mercadería.", requiredMode = RequiredMode.NOT_REQUIRED)
	@JsonProperty(value = "fecha_vencimiento")
	private LocalDate dVencMerc;

	@Schema(name = "serie", description = "Campo dNSerie."
			+ " Número de serie.", requiredMode = RequiredMode.NOT_REQUIRED)
	@JsonProperty(value = "serie")
	private String dNSerie;

	@Schema(name = "numero_pedido", description = "Campo dNumPedi."
			+ " Número de pedido.", requiredMode = RequiredMode.NOT_REQUIRED)
	@JsonProperty(value = "numero_pedido")
	private String dNumPedi;

	@Schema(name = "numero_seguimiento", description = "Campo dNumSegui."
			+ " Número de seguimiento del envío.", requiredMode = RequiredMode.NOT_REQUIRED)
	@JsonProperty(value = "numero_seguimiento")
	private String dNumSegui;

	@Schema(name = "nombre_importador", description = "Campo dNomImp."
			+ " Nombre del Importador.", requiredMode = RequiredMode.NOT_REQUIRED)
	@JsonProperty(value = "nombre_importador")
	private String dNomImp;

	@Schema(name = "direccion_importador", description = "Campo dDirImp."
			+ " Dirección de Importador.", requiredMode = RequiredMode.NOT_REQUIRED)
	@JsonProperty(value = "direccion_importador")
	private String dDirImp;

	@Schema(name = "numero_registro_firma", description = "Campo dNumFir."
			+ " Número de registro de"
			+ " la firma del importado.", requiredMode = RequiredMode.NOT_REQUIRED)
	@JsonProperty(value = "numero_registro_firma")
	private String dNumFir;

	@Schema(name = "numero_registro_producto", description = "Campo dNumReg."
			+ " Número de registro del"
			+ " producto otorgado por"
			+ " el SENAVE.", requiredMode = RequiredMode.NOT_REQUIRED)
	@JsonProperty(value = "numero_registro_producto")
	private String dNumReg;

	@Schema(name = "numero_registro_senave", description = "Campo dNumRegEntCom."
			+ " Número de registro de"
			+ " entidad comercial"
			+ " otorgado por el"
			+ " SENAVE.", requiredMode = RequiredMode.NOT_REQUIRED)
	@JsonProperty(value = "numero_registro_senave")
	private String dNumRegEntCom;

	public com.roshka.sifen.core.fields.request.de.TgRasMerc convertToTgRasMerc() {

		com.roshka.sifen.core.fields.request.de.TgRasMerc gRasMerc = new com.roshka.sifen.core.fields.request.de.TgRasMerc();

		gRasMerc.setdDirImp(dDirImp);
		gRasMerc.setdNSerie(dNSerie);
		gRasMerc.setdNomImp(dNomImp);
		gRasMerc.setdNumFir(dNumFir);
		gRasMerc.setdNumLote(dNumLote);
		gRasMerc.setdNumPedi(dNumPedi);
		gRasMerc.setdNumReg(dNumReg);
		gRasMerc.setdNumRegEntCom(dNumRegEntCom);
		gRasMerc.setdNumSegui(dNumSegui);
		gRasMerc.setdVencMerc(dVencMerc);

		return gRasMerc;
	}

}
