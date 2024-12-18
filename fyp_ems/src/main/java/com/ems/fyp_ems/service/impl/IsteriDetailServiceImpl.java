package com.ems.fyp_ems.service.impl;

import com.ems.fyp_ems.entity.IsteriDetail;
import com.ems.fyp_ems.repository.IsteriDetailRepository;
import com.ems.fyp_ems.service.IsteriDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IsteriDetailServiceImpl implements IsteriDetailService {

    @Autowired
    private IsteriDetailRepository isteriDetailRepository;

    @Override
    public List<IsteriDetail> findAll() {
        return isteriDetailRepository.findAll();
    }

    @Override
    public IsteriDetail findById(Integer id) {
        return isteriDetailRepository.findById(id).orElse(null);
    }

    @Override
    public IsteriDetail save(IsteriDetail isteriDetail) {
        return isteriDetailRepository.save(isteriDetail);
    }

    @Override
    public void deleteById(Integer id) {
        isteriDetailRepository.deleteById(id);
    }
}