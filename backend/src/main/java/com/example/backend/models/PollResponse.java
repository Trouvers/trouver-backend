package com.example.backend.models;

import com.example.backend.enums.ResultCode;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.validation.Valid;

@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class PollResponse {

//    @Valid
//    private int pollId;
//
//    @Valid
//    private PollRequest pollRequest;

    @Valid
    private ResultCode resultCode;
}

