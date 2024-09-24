package com.kilicdev.personalfinancetracking.controller.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Error {
    private String errorCode;
    private String errorDetails;
    private String errorMessage;

}
