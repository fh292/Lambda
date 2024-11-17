package com.example.lambda.processor;

@FunctionalInterface
public interface SuggestionProcessor {
    void process(String text);
}
