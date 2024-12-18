package com.ems.fyp_ems.service.impl;

import com.ems.fyp_ems.entity.AnakPerempuanDetail;
import com.ems.fyp_ems.repository.AnakPerempuanDetailRepository;
import com.ems.fyp_ems.service.AnakPerempuanDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnakPerempuanDetailServiceImpl implements AnakPerempuanDetailService {

    @Autowired
    private AnakPerempuanDetailRepository anakPerempuanDetailRepository;

    @Override
    public List<AnakPerempuanDetail> findAll() {
        return anakPerempuanDetailRepository.findAll();
    }

    @Override
    public AnakPerempuanDetail findById(Long id) {
        return anakPerempuanDetailRepository.findById(id).orElse(null);
    }

    @Override
    public AnakPerempuanDetail save(AnakPerempuanDetail anakPerempuanDetail) {
        return anakPerempuanDetailRepository.save(anakPerempuanDetail);  // Fixed: save the entity, not the class
    }

    @Override
    public void deleteById(Long id) {
        anakPerempuanDetailRepository.deleteById(id);
    }

}
