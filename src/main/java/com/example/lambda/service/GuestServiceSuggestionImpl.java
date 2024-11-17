package com.example.lambda.service;

import com.example.lambda.bo.CreateSuggestionRequest;
import com.example.lambda.entity.GuestSuggestionEntity;
import com.example.lambda.processor.SuggestionProcessor;
import com.example.lambda.repository.GuestSuggestionRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GuestServiceSuggestionImpl implements GuestSuggestionService {

    private GuestSuggestionRepository guestSuggestionRepository;
    public GuestServiceSuggestionImpl(GuestSuggestionRepository guestSuggestionRepository) {
        this.guestSuggestionRepository = guestSuggestionRepository;
    }


    public SuggestionProcessor processSuggestion = suggestion ->{
        GuestSuggestionEntity entity = new GuestSuggestionEntity();
        entity.setSuggestionText(suggestion);
        entity.setRate("Rating out of 5");
        guestSuggestionRepository.save(entity);
    };

    public void printAndProcessSuggestion(CreateSuggestionRequest request) {
        System.out.println("Suggestion text: " + request.getSuggestionText());
        processSuggestion.process(request.getSuggestionText());

    }

    public List<GuestSuggestionEntity> getSuggestions() {
        return guestSuggestionRepository.findAll();
    }

}
