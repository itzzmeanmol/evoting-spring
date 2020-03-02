package com.evotingapi.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.evotingapi.model.Candidate;

import com.evotingapi.repository.CandidateRepository;


@Service
public class CandidateService {
	@Autowired
	private CandidateRepository candidateRepository;
	public Candidate saveCandidate(Candidate candidate) {
		return candidateRepository.save(candidate);
	}
}
