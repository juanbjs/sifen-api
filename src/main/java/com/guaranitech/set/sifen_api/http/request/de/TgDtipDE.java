package com.guaranitech.set.sifen_api.http.request.de;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.v3.oas.annotations.Hidden;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Schema(name = "TipoDocumento", description = "Campos específicos por "
		+ "tipo de Documento Electrónico.")
@Getter
@Setter
@ToString
public class TgDtipDE {

	@JsonProperty(value = "factura_electronica")
	private TgCamFE gCamFE = new TgCamFE();

	@Hidden
	@JsonIgnore
	// @JsonProperty(value = "autofactura_electronica")
	private TgCamAE gCamAE = new TgCamAE();

	@JsonProperty(value = "nota_credito_debito_electronica")
	private TgCamNCDE gCamNCDE = new TgCamNCDE();

	@JsonProperty(value = "nota_remision_electronica")
	private TgCamNRE gCamNRE = new TgCamNRE();

	@JsonProperty(value = "condicion_operacion")
	private TgCamCond gCamCond = new TgCamCond();

	@JsonProperty(value = "ítems_operacion")
	private List<TgCamItem> gCamItemList = new ArrayList<TgCamItem>();

	@Hidden
	@JsonIgnore
	// @JsonProperty(value = "campos_específicos")
	private TgCamEsp gCamEsp;

	@JsonProperty(value = "transporte_mercaderias")
	private TgTransp gTransp;

	public com.roshka.sifen.core.fields.request.de.TgDtipDE convertToTgDtipDE() {

		com.roshka.sifen.core.fields.request.de.TgDtipDE gDtipDE = new com.roshka.sifen.core.fields.request.de.TgDtipDE();

		gDtipDE.setgCamFE(getGCamFE().convertToTgCamFE());
		gDtipDE.setgCamAE(getGCamAE().convertToTgCamAE());
		gDtipDE.setgCamNCDE(getGCamNCDE().convertToTgCamNCDE());
		gDtipDE.setgCamNRE(getGCamNRE().convertToTgCamNRE());
		gDtipDE.setgCamCond(getGCamCond().convertToTgCamCond());
		gDtipDE.setgCamItemList(TgCamItem.convertToTgCamItem(getGCamItemList()));

		if (gCamEsp != null)
			gDtipDE.setgCamEsp(getGCamEsp().convertToTgCamEsp());

		if (gTransp != null)
			gDtipDE.setgTransp(getGTransp().convertToTgTransp());

		return gDtipDE;
	}

}
