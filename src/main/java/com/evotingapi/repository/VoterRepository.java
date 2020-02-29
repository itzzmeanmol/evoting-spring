package com.evotingapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.evotingapi.model.Voter;


@Repository
public interface VoterRepository extends JpaRepository<Voter, Long> {
	
}
