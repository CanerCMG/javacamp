package com.Odev6.HMRS.dataAccess;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Odev6.HMRS.entities.JobPositions;


public interface JobPositionsDao extends JpaRepository<JobPositions, Integer>  {

}
