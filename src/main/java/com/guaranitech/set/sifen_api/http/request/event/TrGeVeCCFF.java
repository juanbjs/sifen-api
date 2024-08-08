package com.guaranitech.set.sifen_api.http.request.event;

import java.time.LocalDateTime;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class TrGeVeCCFF {
	private String Id;
	private String dNumTraCCFF;
	private LocalDateTime dFeAceTraCCFF;

}