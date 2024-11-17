package com.example.lambda.controller;

import com.example.lambda.bo.CreateSuggestionRequest;
import com.example.lambda.entity.GuestSuggestionEntity;
import com.example.lambda.service.GuestServiceSuggestionImpl;
import com.example.lambda.service.GuestSuggestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/")
public class SuggestionController {

    private final GuestServiceSuggestionImpl guestSuggestionService;

    public SuggestionController(GuestServiceSuggestionImpl guestSuggestionService) {
        this.guestSuggestionService = guestSuggestionService;
    }

    @PostMapping("/suggestions")
    public ResponseEntity<String> postSuggestion(@RequestBody CreateSuggestionRequest guestSuggestion) {
        guestSuggestionService.printAndProcessSuggestion(guestSuggestion);
        return ResponseEntity.ok("Suggestion has been successfully added.");
    }

    @GetMapping("/viewSuggestions")
    public ResponseEntity<List<GuestSuggestionEntity>> viewSuggestions() {
        List<GuestSuggestionEntity> suggestions = guestSuggestionService.getSuggestions();
        return ResponseEntity.ok(suggestions);
    }
}
