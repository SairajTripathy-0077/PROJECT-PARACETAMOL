package com.example.drugwatch.dto.fda;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
@JsonIgnoreProperties(ignoreUnknown = true)
public record OpenFdaResponse(List<Report> results) {
    public OpenFdaResponse {
        results = results == null ? List.of() : results;
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public record Report() {
    }
}
