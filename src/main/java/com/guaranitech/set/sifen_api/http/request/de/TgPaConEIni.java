package com.guaranitech.set.sifen_api.http.request.de;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.roshka.sifen.core.types.CMondT;
import com.roshka.sifen.core.types.TiTiPago;

import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.Schema.RequiredMode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Schema(name = "FormaPago", description = "Campos que describen la forma de "
		+ " pago al contado o del monto de la "
		+ " entrega inicia."
		+ " Obligatorio si condicion = CONTADO")
@Getter
@Setter
@ToString
public class TgPaConEIni {

	@Schema(name = "tipo_pago", description = "Campo iTiPago."
			+ " Tipo de pago.", requiredMode = RequiredMode.REQUIRED)
	@JsonProperty(value = "tipo_pago")
	private TiTiPago iTiPago = TiTiPago.EFECTIVO;

	@Schema(name = "monto", description = "Campo dMonTiPag."
			+ " Monto por tipo de pago.", requiredMode = RequiredMode.REQUIRED)
	@JsonProperty(value = "monto")
	private BigDecimal dMonTiPag;

	@Schema(name = "moneda", description = "Campo cMoneTiPag."
			+ " Moneda por tipo de pago.(https://www.currency-iso.org/en/home/tables/table-a1.html)", requiredMode = RequiredMode.REQUIRED)
	@JsonProperty(value = "moneda")
	private CMondT cMoneTiPag;

	@Schema(name = "tipo_cambio", description = "Campo dTiCamTiPag."
			+ " Tipo de cambio por tipo de pago .", requiredMode = RequiredMode.REQUIRED)
	@JsonProperty(value = "tipo_cambio")
	private BigDecimal dTiCamTiPag;

	@JsonProperty(value = "operacion_tarjeta")
	private TgPagTarCD gPagTarCD;

	@JsonProperty(value = "operacion_cheque")
	private TgPagCheq gPagCheq;

	public static List<com.roshka.sifen.core.fields.request.de.TgPaConEIni> convertToTgPaConEIni(
			List<TgPaConEIni> gPaConEIniList) {

		List<com.roshka.sifen.core.fields.request.de.TgPaConEIni> gPaConEIniLst = new ArrayList<com.roshka.sifen.core.fields.request.de.TgPaConEIni>();

		for (TgPaConEIni varTgPaConEIni : gPaConEIniList) {
			com.roshka.sifen.core.fields.request.de.TgPaConEIni gPaConEIni = new com.roshka.sifen.core.fields.request.de.TgPaConEIni();

			gPaConEIni.setcMoneTiPag(varTgPaConEIni.getCMoneTiPag());
			gPaConEIni.setdMonTiPag(varTgPaConEIni.getDMonTiPag());
			gPaConEIni.setiTiPago(varTgPaConEIni.getITiPago());
			gPaConEIni.setdDesTiPag(varTgPaConEIni.getITiPago().getDescripcion());
			
			if(varTgPaConEIni.getDTiCamTiPag() != null)
				gPaConEIni.setdTiCamTiPag(varTgPaConEIni.getDTiCamTiPag());
			
			if(varTgPaConEIni.getGPagCheq() != null)
				gPaConEIni.setgPagCheq(varTgPaConEIni.getGPagCheq().convertToTgPagCheq());

			if(varTgPaConEIni.getGPagTarCD() != null)
				gPaConEIni.setgPagTarCD(varTgPaConEIni.getGPagTarCD().convertToTgPagTarCD());
			
			gPaConEIniLst.add(gPaConEIni);
		}

		return gPaConEIniLst;
	}

}