package com.snhu.consumingrest;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record MTGCard (
    String object,
    String name,
    String uri
    ) { }