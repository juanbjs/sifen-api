package com.guaranitech.set.sifen_api.http.request.de;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.roshka.sifen.core.types.CMondT;
import com.roshka.sifen.core.types.TTImp;
import com.roshka.sifen.core.types.TTipTra;
import com.roshka.sifen.core.types.TdCondTiCam;
import com.roshka.sifen.core.types.TiCondAnt;

import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.Schema.RequiredMode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Schema(name = "DatosOperacionComercial", description = "Campos inherentes a la operación comercial. No enviar si el "
		+ "Tipo de Documento Electrónico es Nota de remisión electrónica.")
@Getter
@Setter
@ToString
public class TgOpeCom {

	@Schema(name = "tipo_transaccion", description = "Campo iTipTra. Tipo de transacción. Obligatorio si el"
			+ " Tipo de Documento Electrónico es Factura electrónica o Autofactura electrónica", requiredMode = RequiredMode.NOT_REQUIRED)
	@JsonProperty(value = "tipo_transaccion")
	private TTipTra iTipTra;

	@Schema(name = "tipo_impuesto", description = "Campo iTImp. Tipo de impuesto.", requiredMode = RequiredMode.REQUIRED)
	@JsonProperty(value = "tipo_impuesto")
	private TTImp iTImp = TTImp.IVA;

	@Schema(name = "moneda", description = "Campo cMoneOpe. Moneda de la operación. Segun ISO 4217. https://www.currency-iso.org/en/home/tables/table-a1.html", requiredMode = RequiredMode.REQUIRED)
	@JsonProperty(value = "moneda")
	private CMondT cMoneOpe;

	@Schema(name = "condicion_tipo_cambio", description = "Campo dCondTiCam. Condición del tipo de cambio."
			+ " Obligatorio si la moneda = PYG.", requiredMode = RequiredMode.NOT_REQUIRED)
	@JsonProperty(value = "condicion_tipo_cambio")
	private TdCondTiCam dCondTiCam;

	@Schema(name = "tipo_cambio", description = "Campo dTiCam. Tipo de cambio de la operación."
			+ " Obligatorio si condicion_tipo_cambio = GLOBAL."
			+ " No informar condicion_tipo_cambio = POR_ITEM o si la moneda = PYG.", requiredMode = RequiredMode.NOT_REQUIRED)
	@JsonProperty(value = "tipo_cambio")
	private BigDecimal dTiCam;

	@Schema(name = "condicion_anticipo", description = "Campo iCondAnt."
			+ " Condición del Anticipo."
			+ "ANTICIPO_GLOBAL (un solo tipo de anticipo para todo el DE)."
			+ "ANTICIPO_POR_ITEM (corresponde a la distribución de Anticipos facturados por ítem).",
			requiredMode = RequiredMode.NOT_REQUIRED)
	@JsonProperty(value = "condicion_anticipo")
	private TiCondAnt iCondAnt;

	public com.roshka.sifen.core.fields.request.de.TgOpeCom convertToTgOpeCom() {

		com.roshka.sifen.core.fields.request.de.TgOpeCom gOpeCom = new com.roshka.sifen.core.fields.request.de.TgOpeCom();

		gOpeCom.setcMoneOpe(cMoneOpe);
		gOpeCom.setdCondTiCam(dCondTiCam);
		gOpeCom.setdTiCam(dTiCam);
		gOpeCom.setiCondAnt(iCondAnt);
		gOpeCom.setiTImp(iTImp);
		gOpeCom.setiTipTra(iTipTra);

		return gOpeCom;
	}

}