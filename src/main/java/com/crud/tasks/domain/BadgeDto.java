package com.crud.tasks.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@AllArgsConstructor
@Getter
@JsonIgnoreProperties(ignoreUnknown = true)

public class BadgeDto {
    @JsonProperty("votes")
    private String votes;
    @JsonProperty("attachmentsByType")
    private AttachmentsByTypeDto attachmentsByType;
}