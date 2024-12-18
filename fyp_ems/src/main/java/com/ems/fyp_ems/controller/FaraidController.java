package com.ems.fyp_ems.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import com.ems.fyp_ems.dto.WasiatDto;

import com.ems.fyp_ems.entity.AnakLelakiDetail;
import com.ems.fyp_ems.entity.AnakPerempuanDetail;
import com.ems.fyp_ems.entity.AyahDetail;
import com.ems.fyp_ems.entity.IsteriDetail;
import com.ems.fyp_ems.entity.IbuDetail;

import com.ems.fyp_ems.service.AnakLelakiDetailService;
import com.ems.fyp_ems.service.AnakPerempuanDetailService;
import com.ems.fyp_ems.service.AyahDetailService;
import com.ems.fyp_ems.service.IsteriDetailService;
import com.ems.fyp_ems.service.IbuDetailService;

import com.ems.fyp_ems.repository.AnakLelakiDetailRepository;
import com.ems.fyp_ems.repository.AnakPerempuanDetailRepository;
import com.ems.fyp_ems.repository.IsteriDetailRepository;
import com.ems.fyp_ems.repository.IbuDetailRepository;

import java.util.ArrayList;
import java.util.List;

@Controller
public class FaraidController {

    @Autowired
    private  IbuDetailService ibuDetailService;

    @Autowired
    private  AyahDetailService ayahDetailService;

    @Autowired
    private  IsteriDetailService isteriDetailService;
    
    @Autowired
    private  AnakLelakiDetailService anakLelakiDetailService;
    
    @Autowired
    private  AnakPerempuanDetailService anakPerempuanDetailService;
    
    @Autowired
    private AnakLelakiDetailRepository anakLelakiDetailRepository;
    @Autowired
    private AnakPerempuanDetailRepository anakPerempuanDetailRepository;
        
        //Display Heir data
        @GetMapping("/user/heirs")
        
        public String viewHeirs(Model model) {
            // Fetch data from your services
            List<IsteriDetail> isteriDetail = isteriDetailService.findAll();
            List<AnakLelakiDetail> anakLelakiDetail = anakLelakiDetailService.findAll();
            List<AnakPerempuanDetail> anakPerempuanDetail = anakPerempuanDetailService.findAll();
            List<IbuDetail> ibuDetail = ibuDetailService.findAll();
            List<AyahDetail> ayahDetail = ayahDetailService.findAll();
            
            // Populate WasiatDto
            WasiatDto wasiatDto = new WasiatDto();
            wasiatDto.setIsteriDetail(isteriDetail);
            wasiatDto.setAnakLelakiDetail(anakLelakiDetail);
            wasiatDto.setAnakPerempuanDetail(anakPerempuanDetail);
            wasiatDto.setIbuDetail(ibuDetail);
            wasiatDto.setAyahDetail(ayahDetail);
            
            // Add WasiatDto to the model
            model.addAttribute("wasiatDto", wasiatDto);
        
            return "users/viewHeirs"; // Return the Thymeleaf template name
        }
        /*public String viewHeirs(Model model) {
            
            List<IsteriDetail> isteriDetail = isteriDetailService.findAll();
            List<AnakLelakiDetail> anakLelakiDetail = anakLelakiDetailService.findAll();
            List<AnakPerempuanDetail> anakPerempuanDetail = anakPerempuanDetailService.findAll();
            List<IbuDetail> ibuDetail = ibuDetailService.findAll();
            List<AyahDetail> ayahDetail = ayahDetailService.findAll();
            model.addAttribute("isteriDetail", isteriDetail);
            model.addAttribute("anakLelakiDetail", anakLelakiDetail); 
            model.addAttribute("anakPerempuanDetail", anakPerempuanDetail);
            model.addAttribute("ibuDetail", ibuDetail);
            model.addAttribute("ayahDetail", ayahDetail); 
            return "users/viewHeirs"; 
        }*/
    
        //Forward to addHeirInfo page to insert heirs
        @GetMapping("/user/heirs/add")
        public String addHeirs(Model model) {
            WasiatDto wasiatDto = new WasiatDto();
 
            wasiatDto.setAnakLelakiDetail(new ArrayList<>());
            wasiatDto.setAnakPerempuanDetail(new ArrayList<>());
        
            // Set into WasiatDto
            model.addAttribute("wasiatDto", wasiatDto);
        
            /*model.addAttribute("anakLelakiDetail", new AnakLelakiDetail());
            model.addAttribute("anakPerempuanDetail", new AnakPerempuanDetail());
            model.addAttribute("ibuDetail", new IbuDetail());
            model.addAttribute("ayahDetail", new AyahDetail());*/

                    /*List<AnakLelakiDetail> anakLelakiDetail = new ArrayList<>();
                    List<AnakPerempuanDetail> anakPerempuanDetail = new ArrayList<>();
            
                    model.addAttribute("anakLelakiDetail", anakLelakiDetail);
                    model.addAttribute("anakPerempuanDetail", anakPerempuanDetail);*/
        return "users/addHeirsInfo";
    }

    @PostMapping("/user/heirs/add")
    public String addHeir(@ModelAttribute WasiatDto wasiatDto) {
        // Process the WasiatDto (save to database or handle logic as needed)
    
        // You can access individual lists from the DTO, e.g.
        for (AnakLelakiDetail anakLelaki : wasiatDto.getAnakLelakiDetail()) {
        anakLelakiDetailRepository.save(anakLelaki);
        }
        
        for (AnakPerempuanDetail anakPerempuan : wasiatDto.getAnakPerempuanDetail()) {
            anakPerempuanDetailRepository.save(anakPerempuan);
            }
        return "redirect:/user/heirs"; // Redirect after adding the data
    }

    /*@PostMapping("/user/heirs/add")
    public String addHeir(@ModelAttribute AnakLelakiDetail anakLelakiDetail) {
        anakLelakiDetailRepository.save(anakLelakiDetail);
        return "redirect:/user/heirs"; // Redirect after adding data
    }*/

    /*@GetMapping("/user/heirs/edit/{id}")
    public String editHeir(@PathVariable Integer id, Model model) {
        SuamiDetail suamiDetail = suamiDetailService.findById(id);
        IsteriDetail isteriDetail = isteriDetailService.findById(id);
        AnakLelakiDetail anakLelakiDetail = anakLelakiDetailService.findById(id);
        AnakPerempuanDetail anakPerempuanDetail = anakPerempuanDetailService.findById(id);
        if (suamiDetail == null || isteriDetail == null) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Heir not found");
        }
    
        model.addAttribute("suamiDetail", suamiDetail);
        model.addAttribute("isteriDetail", isteriDetail);
        model.addAttribute("anakLelakiDetails", anakLelakiDetail);
        model.addAttribute("anakPerempuanDetails", anakPerempuanDetail);
    
        return "users/editHeirs";
    }
    
    @PostMapping("/user/heirs/delete/{id}")
    public String deleteHeir(@PathVariable Integer id) {
        suamiDetailService.deleteById(id);
        isteriDetailService.deleteById(id);
        anakLelakiDetailService.deleteById(id);
        anakPerempuanDetailService.deleteById(id);
        return "redirect:/user/heirs";
    }*/

    @GetMapping("/login")
    public String login()
    {
        return "/log/login";
    }

    /*//User goes to editHeir page
    @GetMapping("/user/heirs/edit/{id}")
    public String editHeir(@PathVariable int id, Model model){
        Heir heir = HeirDBService.getHeirs().stream()
            .filter(h -> h.getId() == id)
            .findFirst()
            .orElse(null);

        if (heir == null) {
            return "redirect:/user/heirs"; 
    }
        model.addAttribute("heir", heir);
        return "users/EditHeirs";
    }

    //Forward insert data HeirDBService
    @PostMapping("/user/heirs/edit")
    public String saveEditedHeir(@ModelAttribute Heir updatedHeir) {
        List<Heir> heirs = HeirDBService.getHeirs();
    
        // Update the existing heir
        for (Heir heir : heirs) {
            if (heir.getId() == updatedHeir.getId()) {
                heir.setName(updatedHeir.getName());
                heir.setStatus(updatedHeir.getStatus());
                heir.setQuantity(updatedHeir.getQuantity());
                heir.setDocumentId(updatedHeir.getDocumentId());
                heir.setSharePercentage(updatedHeir.getSharePercentage());
                break;
            }
        }
    
        return "redirect:/user/heirs"; // Redirect to the list of heirs
    }

    //User delete Heir
    @GetMapping("/user/heirs/delete/{id}")
    public String deleteHeir(@PathVariable int id) {
        // Remove the heir by ID
        List<Heir> heirs = HeirDBService.getHeirs();
        heirs.removeIf(heir -> heir.getId() == id);

        return "redirect:/user/heirs"; // Redirect to the list of heirs
    }

    //User view Estate Data
    @GetMapping("/user/estate")
    public String viewEstates(Model model) {
        model.addAttribute("estates", EstateDBService.getEstates()); // Fetch estates
        model.addAttribute("totalValue", Estate.getTotalValue()); // Fetch total value from Estate class
        return "users/viewEstate"; // Map to viewEstate.html
}

    //Forward to addEstate page to insert heirs
    @GetMapping("/user/estate/add")
    public String addEstate(Model model){
        model.addAttribute("estates", new Estate());
        return "users/addEstate";
    }

    //Forward insert data EstateDBService
    @PostMapping("/user/estate/add")
    public String addEstate(@ModelAttribute Estate estate, Model model) {
        EstateDBService.getEstates().add(estate); 
        return "redirect:/user/estates"; 
    }

    //ADMIN FUNCTION
    //Admin view HeirInfo
    @GetMapping("/admin/heirs")
    public String adViewHeir(Model model){
        model.addAttribute("heirs",  HeirDBService.getHeirs());
        return "admin/HeirsInfo";
    }

    //Forward to Calculate faraid page for admin
    @GetMapping("/admin/calc")
    public String toCalcFaraid(Model model) {
        // Calculate Faraid results dynamically
        FaraidDBService.calculateAndSaveFaraidResults();

        // Fetch the results and total estate value
        List<Map<String, Object>> faraidResult = FaraidDBService.getFaraidResults();
        double totalEstate = EstateDBService.getEstates().stream().mapToDouble(Estate::getValue).sum();

        model.addAttribute("faraidResult", faraidResult);
        model.addAttribute("totalEstate", totalEstate);
        model.addAttribute("heirs", HeirDBService.getHeirs());
        model.addAttribute("estates", EstateDBService.getEstates());
        return "admin/CalculateFaraid";
    }

    //Forward to Calculate faraid page for admin
    @PostMapping("/admin/viewcalc")
    public String calculateFaraid(Model model) {
        // Trigger Faraid calculation
        FaraidDBService.calculateAndSaveFaraidResults();
    
        // Fetch results and total estate value
        List<Map<String, Object>> faraidResult = FaraidDBService.getFaraidResults();
        double totalEstate = EstateDBService.getEstates().stream().mapToDouble(Estate::getValue).sum();
    
        // Add attributes to the model
        model.addAttribute("faraidResult", faraidResult);
        model.addAttribute("totalEstate", totalEstate);
    
        // Forward to the results page
        return "admin/viewResult";
    }

    //User view Faraid Result
    @GetMapping("/user/viewresults")
    public String ViewFaraid(Model model){
  
        // Fetch the stored Faraid results from FaraidDBService
        List<Map<String, Object>> faraidResult = FaraidDBService.getFaraidResults();
        double totalEstate = EstateDBService.getEstates().stream().mapToDouble(Estate::getValue).sum();
      
        model.addAttribute("faraidResult", faraidResult);
        model.addAttribute("totalEstate", totalEstate);
        model.addAttribute("heirs", HeirDBService.getHeirs());
        model.addAttribute("estates", EstateDBService.getEstates());
        return "users/faraidResults";
    }*/

}
    