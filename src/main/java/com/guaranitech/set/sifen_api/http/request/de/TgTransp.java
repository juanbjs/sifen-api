package com.guaranitech.set.sifen_api.http.request.de;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.roshka.sifen.core.types.PaisType;
import com.roshka.sifen.core.types.TcCondNeg;
import com.roshka.sifen.core.types.TiModTrans;
import com.roshka.sifen.core.types.TiRespFlete;
import com.roshka.sifen.core.types.TiTTrans;

import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.Schema.RequiredMode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Schema(name = "TransporteMercaderias", description = "Dto de Documentos Electronicos")
@Getter
@Setter
@ToString
public class TgTransp {

	@JsonProperty(value = "tipo_transporte")
	private TiTTrans iTipTrans;

	@JsonProperty(value = "modalidad_transporte")
	private TiModTrans iModTrans;

	@JsonProperty(value = "responsable_costo_flete")
	private TiRespFlete iRespFlete;

	@JsonProperty(value = "condicion_negociacion")
	private TcCondNeg cCondNeg;

	@JsonProperty(value = "numero_manifiesto")
	private String dNuManif;

	@JsonProperty(value = "numero_despacho_importacion")
	private String dNuDespImp;

	@JsonProperty(value = "fecha_inicio_traslado")
	private LocalDate dIniTras;

	@JsonProperty(value = "fecha_fin_traslado")
	private LocalDate dFinTras;

	@Schema(name = "pais", description = "Campo cPaisDest."
			+ " Código del país del detino. https://es.wikipedia.org/wiki/ISO_3166-1#C%C3%B3digos_ISO_3166-1", requiredMode = RequiredMode.REQUIRED)
	@JsonProperty(value = "pais")
	private PaisType cPaisDest;

	@JsonProperty(value = "local_salida_mercaderías")
	private TgCamSal gCamSal = new TgCamSal();

	@JsonProperty(value = "local_entrega_mercaderias")
	private List<TgCamEnt> gCamEntList = new ArrayList<TgCamEnt>();

	@JsonProperty(value = "vehiculo_traslado")
	private List<TgVehTras> gVehTrasList = new ArrayList<TgVehTras>();

	@JsonProperty(value = "transportista")
	private TgCamTrans gCamTrans = new TgCamTrans();

	public com.roshka.sifen.core.fields.request.de.TgTransp convertToTgTransp() {

		com.roshka.sifen.core.fields.request.de.TgTransp gTransp = new com.roshka.sifen.core.fields.request.de.TgTransp();

		gTransp.setcCondNeg(cCondNeg);
		gTransp.setcPaisDest(cPaisDest);
		gTransp.setdFinTras(dFinTras);
		gTransp.setdIniTras(dIniTras);
		gTransp.setdNuDespImp(dNuDespImp);
		gTransp.setdNuManif(dNuManif);
		gTransp.setgCamEntList(TgCamEnt.convertToTgCamEnt(getGCamEntList()));
		gTransp.setgCamSal(getGCamSal().convertToTgCamSal());
		gTransp.setgCamTrans(getGCamTrans().convertToTgCamTrans());
		gTransp.setgVehTrasList(TgVehTras.convertToTgVehTras(getGVehTrasList()));
		gTransp.setiModTrans(iModTrans);
		gTransp.setiRespFlete(iRespFlete);
		gTransp.setiTipTrans(iTipTrans);

		return gTransp;
	}

}
