package com.ems.fyp_ems.service.impl;


import com.ems.fyp_ems.entity.AyahDetail;
import com.ems.fyp_ems.repository.AyahDetailRepository;
import com.ems.fyp_ems.service.AyahDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AyahDetailServiceImpl implements AyahDetailService {

    @Autowired
    private AyahDetailRepository AyahDetailRepository; // Make sure this is autowired correctly

    @Override
    public List<AyahDetail> findAll() {
        return AyahDetailRepository.findAll(); // Find all Ayah details
    }

    @Override
    public AyahDetail findById(Integer id) {
        return AyahDetailRepository.findById(id).orElse(null); // Find Ayah detail by id
    }

    @Override
    public AyahDetail save(AyahDetail AyahDetail) {
        return AyahDetailRepository.save(AyahDetail); // Save Ayah detail to the database
    }

    @Override
    public void deleteById(Integer id) {
        AyahDetailRepository.deleteById(id); // Corrected: use the autowired repository
    }
}