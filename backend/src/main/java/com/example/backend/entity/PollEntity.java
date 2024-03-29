package com.example.backend.entity;

import com.example.backend.core.object.IPollResponse;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Entity
@Table(name="PollEntity")
@Data
@NoArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class PollEntity implements IPollResponse {

    @Id
    @Column(name="pollId")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long pollId;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "userId")
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private User user;

    @Column(name="createdAt")
    private Timestamp createdAt;

    @Column(name="modifiedAt")
    private Timestamp modifiedAt;

    @Column(name="question")
    private String question;

    @Column(name="pollType")
    private String pollType;

    @Column(name="options")
    private String options;

    @Column(name="customExpiry")
    private Timestamp customExpiry;

    @Column(name="isActive")
    private boolean isActive;

    @Column(name="url")
    private String url;

    @Column(name="voteShare")
    private String voteShare;

    @Column(name="tags")
    private String tags;

}
