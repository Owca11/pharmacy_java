package org.example.pharmacy.controller;

import org.example.pharmacy.controller.dto.CreateDrugDto;
import org.example.pharmacy.controller.dto.CreateDrugResponseDto;
import org.example.pharmacy.controller.dto.GetDrugDto;
import org.example.pharmacy.service.DrugService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

/**
 * REST controller for managing drug-related operations.
 */
@RestController
@RequestMapping("/api/drugs")
public class DrugController {
    private final DrugService drugService;

    /**
     * Constructs a DrugController with the given DrugService.
     * @param drugService The drug service.
     */
    @Autowired
    public DrugController(DrugService drugService) {
        this.drugService = drugService;
    }

    /**
     * Retrieves a drug by its ID.
     * @param id The ID of the drug.
     * @return The GetDrugDto representing the drug.
     */
    @GetMapping(value = "/{id}")
    @PreAuthorize("permitAll()")
    public GetDrugDto getDrug(@PathVariable Long id){
        return drugService.getById(id);
    }

    /**
     * Retrieves all drugs.
     * @return A list of GetDrugDto objects representing all drugs.
     */
    @GetMapping
    @PreAuthorize("permitAll()")
    public java.util.List<GetDrugDto> getAllDrugs() {
        return drugService.getAll();
    }

    /**
     * Creates a new drug.
     * @param drug The CreateDrugDto containing drug information.
     * @return A CreateDrugResponseDto for the created drug.
     */
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    @PreAuthorize("isAuthenticated()")
    public CreateDrugResponseDto createDrug(@Validated @RequestBody CreateDrugDto drug) {
        return drugService.create(drug);
    }
}