package com.ems.fyp_ems.service;

import com.ems.fyp_ems.entity.IbuDetail;
import java.util.List;

public interface IbuDetailService {
    List<IbuDetail> findAll();
    IbuDetail findById(Integer id);
    IbuDetail save(IbuDetail ibuDetail);
    void deleteById(Integer id);
}