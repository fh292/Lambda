package com.example.lambda.bo;

import com.example.lambda.util.SuggestionStatus;

public class CreateSuggestionRequest {

    private String rate;
    private String suggestionText;
    private SuggestionStatus suggestionType;

    public CreateSuggestionRequest() {
    }

    public CreateSuggestionRequest(String suggestionText, String rate, SuggestionStatus suggestionType) {
        this.suggestionText = suggestionText;
        this.rate = rate;
        this.suggestionType = suggestionType;
    }

    public String getSuggestionText() {
        return suggestionText;
    }

    public void setSuggestionText(String suggestionText) {
        this.suggestionText = suggestionText;
    }

    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }

    public SuggestionStatus getSuggestionType() {
        return suggestionType;
    }

    public void setSuggestionType(SuggestionStatus suggestionType) {
        this.suggestionType = suggestionType;
    }
}
