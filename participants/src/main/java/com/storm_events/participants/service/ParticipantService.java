package com.storm_events.participants.service;

import com.storm_events.participants.entity.Participant;
import com.storm_events.participants.repository.ParticipantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ParticipantService {

    private ParticipantRepository participantRepository;

    @Autowired
    public ParticipantService(ParticipantRepository participantRepository) {
        this.participantRepository = participantRepository;
    }

    public List<Participant> findAllParticipants() {
        return participantRepository.findAll();
    }

    public Participant saveNewParticipant(Participant participant) {
        return participantRepository.save(participant);
    }

    public ResponseEntity<Participant> findParticipantByEmail(String email) {
        ResponseEntity<Participant> byEmail = participantRepository.findByEmail(email);

        if (byEmail==null){
            return ResponseEntity.notFound().build();
        } else {
            return ResponseEntity.ok(byEmail.getBody());
        }
    }
}
