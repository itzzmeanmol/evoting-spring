package com.evotingapi.services;

import java.util.List;

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

	public List<Candidate> getCandidates() {
		return candidateRepository.findAll();
	}

	public Candidate getCandidate(Long id) {
		return candidateRepository.findById(id).get();
	}

	public Candidate findCandidateByLogin(Candidate candidate) {
		return candidateRepository.findCandidateByLogin(candidate.getVin(), candidate.getPassword());
	}
	
	public int addVote(Candidate candidate) {
		return candidateRepository.addVote(candidate.getVin());
	}
}
