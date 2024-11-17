package com.example.lambda.bo;

public class CreateSuggestionRequest {

    private String rate;
    private String suggestionText;

    public CreateSuggestionRequest() {
    }

    public CreateSuggestionRequest(String suggestionText, String rate) {
        this.suggestionText = suggestionText;
        this.rate = rate;
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
}
