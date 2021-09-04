package models;

import enums.ResultCode;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.validation.Valid;
import java.sql.Timestamp;
import java.util.List;

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

