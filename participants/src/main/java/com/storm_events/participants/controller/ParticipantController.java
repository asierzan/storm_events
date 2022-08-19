package com.storm_events.participants.controller;

import com.storm_events.participants.entity.Participant;
import com.storm_events.participants.service.ParticipantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api")
public class ParticipantController {

    private ParticipantService participantService;

    @Autowired
    public ParticipantController(ParticipantService participantService) {
        this.participantService = participantService;
    }

    @GetMapping("/participant")
    public List<Participant> getAllParticipants() {
        return participantService.findAllParticipants();
    }

    @PostMapping("/participant")
    public Participant addNewParticipant(@RequestBody @Valid Participant participant) {
       return participantService.saveNewParticipant(participant);
    }

    @GetMapping("/participant/{email}")
    public ResponseEntity<Participant> findByEmail(@PathVariable String email){
        return participantService.findParticipantByEmail(email);
    }
}
