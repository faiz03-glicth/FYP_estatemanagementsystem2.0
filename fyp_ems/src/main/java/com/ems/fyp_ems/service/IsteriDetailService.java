package com.ems.fyp_ems.service;

import com.ems.fyp_ems.entity.IsteriDetail;
import java.util.List;

public interface IsteriDetailService {
    List<IsteriDetail> findAll();
    IsteriDetail findById(Integer id);
    IsteriDetail save(IsteriDetail isteriDetail);
    void deleteById(Integer id);
}