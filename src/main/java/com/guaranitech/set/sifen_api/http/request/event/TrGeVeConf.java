package com.guaranitech.set.sifen_api.http.request.event;

import java.time.LocalDateTime;

import com.roshka.sifen.core.types.TiTipConf;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class TrGeVeConf {
	private String Id;
	private TiTipConf iTipConf;
	private LocalDateTime dFecRecep;

}