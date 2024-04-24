package com.mfortune.softwarephoenix.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class ApiErrorResponse {

    private int errorCode;
    private String description;

}
