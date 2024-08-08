package com.guaranitech.set.sifen_api.http.request.event;

import java.time.LocalDateTime;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class TrGeDevCCFFCue {
	private String Id;
	private String dNumDevSol;
	private String dNumDevInf;
	private String dNumDevRes;
	private LocalDateTime dFeEmiSol;
	private LocalDateTime dFeEmiInf;
	private LocalDateTime dFeEmiRes;

}