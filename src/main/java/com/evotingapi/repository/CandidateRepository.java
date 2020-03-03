package com.evotingapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.evotingapi.model.Candidate;

@Repository
public interface CandidateRepository extends JpaRepository<Candidate, Long> {
	@Query(value= "select c from Candidate c where c.vin=?1 and c.password=?2",nativeQuery = true)
	Candidate findCandidateByLogin(@Param("vin") int vin, @Param("password") String password);
}
