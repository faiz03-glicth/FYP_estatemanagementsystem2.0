package com.ems.fyp_ems.service.impl;

import com.ems.fyp_ems.entity.SuamiDetail;
import com.ems.fyp_ems.repository.SuamiDetailRepository;
import com.ems.fyp_ems.service.SuamiDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SuamiDetailServiceImpl implements SuamiDetailService {

    @Autowired
    private SuamiDetailRepository suamiDetailRepository;

    @Override
    public List<SuamiDetail> findAll() {
        return suamiDetailRepository.findAll();
    }

    @Override
    public SuamiDetail findById(Long id) {
        return suamiDetailRepository.findById(id).orElse(null);
    }

    @Override
    public SuamiDetail save(SuamiDetail suamiDetail) {
        return suamiDetailRepository.save(suamiDetail);
    }

    @Override
    public void deleteById(Long id) {
        suamiDetailRepository.deleteById(id);
    }
}