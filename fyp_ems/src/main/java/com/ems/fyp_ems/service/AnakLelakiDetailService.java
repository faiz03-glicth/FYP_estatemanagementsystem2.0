package com.ems.fyp_ems.service;

import com.ems.fyp_ems.entity.AnakLelakiDetail;

import java.util.List;


import org.springframework.stereotype.Service;

@Service
public interface AnakLelakiDetailService {
 
    List<AnakLelakiDetail> findAll();
    AnakLelakiDetail findById(Integer id);
    AnakLelakiDetail save(AnakLelakiDetail anakLelakiDetail);
    void deleteById(Integer id);
}

