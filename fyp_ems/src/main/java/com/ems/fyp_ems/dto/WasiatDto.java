package com.ems.fyp_ems.dto;

import java.util.List;

import com.ems.fyp_ems.entity.AnakAngkatDetail;
import com.ems.fyp_ems.entity.AnakLelakiDetail;
import com.ems.fyp_ems.entity.AnakPerempuanDetail;
import com.ems.fyp_ems.entity.IsteriDetail;
import com.ems.fyp_ems.entity.SuamiDetail;
import com.ems.fyp_ems.entity.IbuDetail;
import com.ems.fyp_ems.entity.AyahDetail;
import com.ems.fyp_ems.entity.User;

//import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class WasiatDto {

    private Integer id;
    private User user;

    //@NotEmpty(message = "Content should not be empty")

    private String gender;
    private String ibu;
    private String ayah;
    private String isteri;
    private String suami;
    private String anakLelaki;
    private String anakPerempuan;
    private String anakAngkat;
    private String confirmation;
    private String perbelanjaan;
    private String anggaran;
    private String hibah;
    private List<AnakLelakiDetail> anakLelakiDetail;
    private List<AnakPerempuanDetail> anakPerempuanDetail;
    private List<AnakAngkatDetail> anakAngkatDetail;
    private List<IsteriDetail> isteriDetail;
    private List<SuamiDetail> suamiDetail;
    private List<IbuDetail> ibuDetail;
    private List<AyahDetail> ayahDetail;
}
