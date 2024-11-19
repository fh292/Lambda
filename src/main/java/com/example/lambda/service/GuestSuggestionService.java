package com.example.lambda.service;

import com.example.lambda.entity.GuestSuggestionEntity;

import java.util.List;

public interface GuestSuggestionService {

    List<GuestSuggestionEntity> findAllCreatedSuggestions();
    List<GuestSuggestionEntity> findAllRemovedSuggestions();
    List<GuestSuggestionEntity> findAllDuplicatedSuggestions();

}
