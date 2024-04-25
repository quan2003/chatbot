package com.example.chatGPT;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Query {

    private String query;

    // No-argument constructor
    public Query() {
    }

    // Constructor with argument
    @JsonCreator
    public Query(@JsonProperty("query") String query) {

        this.query = query;
    }

    // Getter
    public String getQuery() {
        return query;
    }

    // Setter
    public void setQuery(String query) {
        this.query = query;
    }
}