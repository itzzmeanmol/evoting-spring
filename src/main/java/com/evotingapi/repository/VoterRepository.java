package com.evotingapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.evotingapi.model.Voter;

@Repository
public interface VoterRepository extends JpaRepository<Voter, Long> {

	@Query(value= "select v from Voter v where v.vin=?1 and v.password=?2",nativeQuery = true)
	Voter findVoterByLogin(@Param("vin") int vin, @Param("password") String password);

}
