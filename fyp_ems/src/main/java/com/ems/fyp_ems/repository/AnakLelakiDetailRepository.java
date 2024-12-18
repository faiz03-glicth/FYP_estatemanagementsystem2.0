package com.ems.fyp_ems.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ems.fyp_ems.entity.AnakLelakiDetail;

@Repository
public interface AnakLelakiDetailRepository extends JpaRepository<AnakLelakiDetail,Integer> {
   
}
