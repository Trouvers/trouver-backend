package models;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.validation.Valid;
import java.sql.Timestamp;
import java.util.List;


@Getter
@Setter
@ToString
public class PollRequest {

   
    private String question;

    @Valid
    private String options;

    @Valid
    private long userId;

    @Valid
    private String pollType;

    @Valid
    private Timestamp customExpiry;

    @Valid
    private String url;

    @Valid
    private List<String> tags;

    @Valid
    private boolean isModified;
}
