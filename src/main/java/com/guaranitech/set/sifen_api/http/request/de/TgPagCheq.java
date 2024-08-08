package com.guaranitech.set.sifen_api.http.request.de;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.Schema.RequiredMode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Schema(name = "OperacionCheque", description = "Campos que describen"
		+ " el pago o entrega inicial"
		+ " de la operación con cheque."
		+ " Obligatorio si condicion = CHEQUE")
@Getter
@Setter
@ToString
public class TgPagCheq {

	@Schema(name = "numero_cheque", description = "Campo dNumCheq."
			+ " Número de cheque.", requiredMode = RequiredMode.REQUIRED)
	@JsonProperty(value = "numero_cheque")
	private String dNumCheq;

	@Schema(name = "banco_emisor", description = "Campo dBcoEmi."
			+ " Banco emisor.", requiredMode = RequiredMode.REQUIRED)
	@JsonProperty(value = "banco_emisor")
	private String dBcoEmi;

	public com.roshka.sifen.core.fields.request.de.TgPagCheq convertToTgPagCheq() {

		com.roshka.sifen.core.fields.request.de.TgPagCheq gPagCheq = new com.roshka.sifen.core.fields.request.de.TgPagCheq();

		gPagCheq.setdNumCheq(dNumCheq);
		gPagCheq.setdBcoEmi(dBcoEmi);

		return gPagCheq;
	}

}