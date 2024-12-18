package com.ems.fyp_ems.repository;

import com.ems.fyp_ems.entity.AnakPerempuanDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnakPerempuanDetailRepository extends JpaRepository<AnakPerempuanDetail, Long> {
    
}