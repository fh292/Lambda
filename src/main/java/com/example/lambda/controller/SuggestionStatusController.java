package com.example.lambda.controller;

import com.example.lambda.entity.GuestSuggestionEntity;
import com.example.lambda.service.GuestSuggestionService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/")
public class SuggestionStatusController {

    private final GuestSuggestionService guestSuggestionService;
    public SuggestionStatusController(GuestSuggestionService guestSuggestionService) {
        this.guestSuggestionService = guestSuggestionService;
    }

    @GetMapping("/createdSuggestions")
    public List<GuestSuggestionEntity> createdSuggestions() {
        return guestSuggestionService.findAllCreatedSuggestions();
    }

    @GetMapping("/removedSuggestions")
    public List<GuestSuggestionEntity> removedSuggestions() {
        return guestSuggestionService.findAllRemovedSuggestions();
    }

    @GetMapping("/duplicatedSuggestions")
    public List<GuestSuggestionEntity> duplicatedSuggestions() {
        return guestSuggestionService.findAllDuplicatedSuggestions();
    }
}
