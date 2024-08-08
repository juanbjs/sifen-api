package com.guaranitech.set.sifen_api.exception;

import lombok.*;

import java.time.ZonedDateTime;

@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ErrorResponse {

    private String errorMessage;
    private Integer statusCode;
    private ZonedDateTime zonedDateTime;

    public ErrorResponse(String errorMessage) {
        this.errorMessage = errorMessage;
    }
}
