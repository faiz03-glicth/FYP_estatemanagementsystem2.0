package com.ems.fyp_ems.repository;

import com.ems.fyp_ems.entity.SuamiDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SuamiDetailRepository extends JpaRepository<SuamiDetail,Long> {
}