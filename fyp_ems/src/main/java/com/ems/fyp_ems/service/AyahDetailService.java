package com.ems.fyp_ems.service;

import com.ems.fyp_ems.entity.AyahDetail;
import java.util.List;

public interface AyahDetailService {
    List<AyahDetail> findAll();
    AyahDetail findById(Integer id);
    AyahDetail save(AyahDetail ayahDetail);
    void deleteById(Integer id);
}