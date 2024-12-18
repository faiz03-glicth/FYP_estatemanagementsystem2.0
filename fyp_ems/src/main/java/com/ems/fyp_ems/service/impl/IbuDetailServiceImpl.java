package com.ems.fyp_ems.service.impl;

import com.ems.fyp_ems.entity.IbuDetail;
import com.ems.fyp_ems.repository.IbuDetailRepository;
import com.ems.fyp_ems.service.IbuDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IbuDetailServiceImpl implements IbuDetailService {

    @Autowired
    private IbuDetailRepository ibuDetailRepository; // Make sure this is autowired correctly

    @Override
    public List<IbuDetail> findAll() {
        return ibuDetailRepository.findAll(); // Find all ibu details
    }

    @Override
    public IbuDetail findById(Integer id) {
        return ibuDetailRepository.findById(id).orElse(null); // Find ibu detail by id
    }

    @Override
    public IbuDetail save(IbuDetail ibuDetail) {
        return ibuDetailRepository.save(ibuDetail); // Save ibu detail to the database
    }

    @Override
    public void deleteById(Integer id) {
        ibuDetailRepository.deleteById(id); // Corrected: use the autowired repository
    }
}
