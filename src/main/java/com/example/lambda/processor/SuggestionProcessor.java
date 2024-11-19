package com.example.lambda.processor;

import com.example.lambda.util.SuggestionStatus;

@FunctionalInterface
public interface SuggestionProcessor {
    void process(String text, SuggestionStatus status);
}
