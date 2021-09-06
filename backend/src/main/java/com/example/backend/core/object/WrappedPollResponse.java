package com.example.backend.core.object;

import com.example.backend.enums.ResultCode;
import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

@Data
public class WrappedPollResponse<T extends IPollResponse> implements Serializable {

    // There should be no specific setters
    @Setter(AccessLevel.NONE)
    private T response;
    private List<T> responses;


    private  ResultCode resultCode;


    public WrappedPollResponse(T response, ResultCode resultCode) {
        this.response = response;
        this.resultCode = resultCode;
    }
    public WrappedPollResponse(List<T> responses, ResultCode resultCode) {
        this.responses = responses;
        this.resultCode = resultCode;
    }
}
