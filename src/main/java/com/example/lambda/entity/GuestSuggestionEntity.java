package com.example.lambda.entity;


import com.example.lambda.util.SuggestionStatus;
import jakarta.persistence.*;

@Entity
public class GuestSuggestionEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id", nullable = false)
    private Long id;

    @Column(name="rate")
    private String rate;

    @Column(name="suggestionText")
    private String suggestionText;

    @Enumerated(EnumType.STRING)
    @Column(name="suggestionStatus")
    private SuggestionStatus suggestionStatus;

    public GuestSuggestionEntity() {
    }

    public GuestSuggestionEntity(Long id, String rate, String suggestionText) {
        this.id = id;
        this.rate = rate;
        this.suggestionText = suggestionText;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }

    public String getSuggestionText() {
        return suggestionText;
    }

    public void setSuggestionText(String suggestionText) {
        this.suggestionText = suggestionText;
    }

    public SuggestionStatus getSuggestionStatus() {
        return suggestionStatus;
    }

    public void setSuggestionStatus(SuggestionStatus suggestionStatus) {
        this.suggestionStatus = suggestionStatus;
    }
}
