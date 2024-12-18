package com.ems.fyp_ems.service;

import com.ems.fyp_ems.entity.SuamiDetail;
import java.util.List;

public interface SuamiDetailService {
    List<SuamiDetail> findAll();
    SuamiDetail findById(Long id);
    SuamiDetail save(SuamiDetail suamiDetail);
    void deleteById(Long id);
}