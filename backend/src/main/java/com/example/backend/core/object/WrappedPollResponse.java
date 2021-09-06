package com.example.backend.core.object;

import com.example.backend.enums.ResultCode;
import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;

import java.io.Serializable;

@Data
public class WrappedPollResponse<T extends IPollResponse> implements Serializable {

    // There should be no specific setters
    @Setter(AccessLevel.NONE)
    private T response;


    private  ResultCode resultCode;


    public WrappedPollResponse(T response, ResultCode resultCode) {
        this.response = response;
        this.resultCode = resultCode;
    }

}
