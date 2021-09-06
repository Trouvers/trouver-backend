package com.example.backend.models;

import com.example.backend.core.object.IPollResponse;
import com.example.backend.entity.PollEntity;
import com.example.backend.enums.ResultCode;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.validation.Valid;
import java.util.List;

@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class PollResponse {
    @Valid
    private IPollResponse iPollResponse;

    @Valid
    private List<IPollResponse> iPollResponses;

    @Valid
    private ResultCode resultCode;

    public PollResponse(List<IPollResponse> iPollResponses,ResultCode resultCode){
        this.iPollResponses  = iPollResponses;
        this.resultCode = resultCode;
    }
}

