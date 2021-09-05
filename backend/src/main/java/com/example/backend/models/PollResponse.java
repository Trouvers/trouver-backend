package com.example.backend.models;

import com.example.backend.entity.PollEntity;
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
    @Valid
    private PollEntity pollEntity;

    @Valid
    private ResultCode resultCode;
}

