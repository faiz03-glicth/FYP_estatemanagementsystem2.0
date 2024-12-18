package com.ems.fyp_ems.service;

import com.ems.fyp_ems.entity.AnakPerempuanDetail;
import java.util.List;

public interface AnakPerempuanDetailService {
    List<AnakPerempuanDetail> findAll();
    AnakPerempuanDetail findById(Long id);
    AnakPerempuanDetail save(AnakPerempuanDetail anakPerempuanDetail);
    void deleteById(Long id);
}