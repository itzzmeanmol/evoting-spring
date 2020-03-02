package com.evotingapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.evotingapi.model.Candidate;

public interface CandidateRepository extends JpaRepository<Candidate, Long> {

}
