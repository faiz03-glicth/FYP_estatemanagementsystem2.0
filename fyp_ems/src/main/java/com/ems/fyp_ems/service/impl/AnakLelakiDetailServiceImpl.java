package com.ems.fyp_ems.service.impl;

import com.ems.fyp_ems.entity.AnakLelakiDetail;
import com.ems.fyp_ems.repository.AnakLelakiDetailRepository;
import com.ems.fyp_ems.service.AnakLelakiDetailService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnakLelakiDetailServiceImpl implements AnakLelakiDetailService {

    @Autowired
    private AnakLelakiDetailRepository anakLelakiDetailRepository;

    @Override
    public List<AnakLelakiDetail> findAll() {
        return anakLelakiDetailRepository.findAll();
    }

    @Override
    public AnakLelakiDetail findById(Integer id) {
        return anakLelakiDetailRepository. findById(id).orElse(null);
    }

    @Override
    public AnakLelakiDetail save(AnakLelakiDetail anakLelakiDetail) {
        return anakLelakiDetailRepository.save(anakLelakiDetail);
    }

    @Override
    public void deleteById(Integer id) {
        anakLelakiDetailRepository.deleteById(id);
    }
}