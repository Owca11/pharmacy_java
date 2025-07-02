package org.example.pharmacy.controller;

import org.example.pharmacy.controller.dto.CreateDrugDto;
import org.example.pharmacy.controller.dto.CreateDrugResponseDto;
import org.example.pharmacy.controller.dto.GetDrugDto;
import org.example.pharmacy.service.DrugService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.access.prepost.PreAuthorize; // Keep this import
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/drugs")
// Removed @PreAuthorize("isAuthenticated()") from class level as per previous discussion
public class DrugController {
    private final DrugService drugService;

    @Autowired
    public DrugController(DrugService drugService) {
        this.drugService = drugService;
    }

    @GetMapping(value = "/{id}")
    @PreAuthorize("permitAll()") // Allows unauthenticated access to single drug details
    public GetDrugDto getDrug(@PathVariable Long id){
        return drugService.getById(id);
    }

    @GetMapping // NEW: Method to fetch all drugs
    @PreAuthorize("permitAll()") // Allows unauthenticated access to the list of all drugs
    public java.util.List<GetDrugDto> getAllDrugs() {
        return drugService.getAll(); // Assuming drugService has a getAll() method
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    @PreAuthorize("isAuthenticated()") // Requires authentication to create a drug
    public CreateDrugResponseDto createDrug(@Validated @RequestBody CreateDrugDto drug) {
        return drugService.create(drug);
    }

    // Add other methods (PUT, DELETE) here with appropriate @PreAuthorize annotations as needed
}
