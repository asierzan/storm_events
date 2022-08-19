package com.storm_events.participants.repository;

import com.storm_events.participants.entity.Participant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

@Repository
public interface ParticipantRepository extends JpaRepository<Participant, Long> {

    ResponseEntity<Participant> findByEmail(String email);
}
