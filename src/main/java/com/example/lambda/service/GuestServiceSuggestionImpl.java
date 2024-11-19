package com.example.lambda.service;

import com.example.lambda.bo.CreateSuggestionRequest;
import com.example.lambda.entity.GuestSuggestionEntity;
import com.example.lambda.processor.SuggestionProcessor;
import com.example.lambda.repository.GuestSuggestionRepository;
import com.example.lambda.util.SuggestionStatus;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class GuestServiceSuggestionImpl implements GuestSuggestionService {

    private  GuestSuggestionRepository guestSuggestionRepository;
    public GuestServiceSuggestionImpl(GuestSuggestionRepository guestSuggestionRepository) {
        this.guestSuggestionRepository = guestSuggestionRepository;
    }


    public SuggestionProcessor processSuggestion = (suggestion, status) ->{
        GuestSuggestionEntity entity = new GuestSuggestionEntity();
        entity.setSuggestionText(suggestion);
        entity.setRate("Rating out of 5");
        entity.setSuggestionStatus(status);
        guestSuggestionRepository.save(entity);
    };

    public void printAndProcessSuggestion(CreateSuggestionRequest request) {
        System.out.println("Suggestion text: " + request.getSuggestionText());
        processSuggestion.process(request.getSuggestionText(), request.getSuggestionType());

    }

    public List<GuestSuggestionEntity> getSuggestions() {
        return guestSuggestionRepository.findAll();
    }

    public List<GuestSuggestionEntity> findAllCreatedSuggestions() {
        return guestSuggestionRepository.findAll().stream().filter(suggestion -> suggestion.getSuggestionStatus()== SuggestionStatus.CREATE).collect(Collectors.toList());

    }


    public List<GuestSuggestionEntity> findAllRemovedSuggestions() {
        return guestSuggestionRepository.findAll().stream().filter(suggestion -> suggestion.getSuggestionStatus()== SuggestionStatus.REMOVE).collect(Collectors.toList());

    }

    public List<GuestSuggestionEntity> findAllDuplicatedSuggestions() {
        return guestSuggestionRepository.findAll().stream().distinct().collect(Collectors.toList());
    }

}
