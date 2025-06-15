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

@RestController
@RequestMapping("/api/drugs")
@PreAuthorize("isAuthenticated()")
public class DrugController {
    private final DrugService drugService;

    @Autowired
    public DrugController(DrugService drugService) {
        this.drugService = drugService;
    }

    @GetMapping(value = "/{id}")
    @PreAuthorize("permitAll()")
    public GetDrugDto getDrug(@PathVariable Long id){
        return drugService.getById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public CreateDrugResponseDto createDrug(@Validated @RequestBody CreateDrugDto drug) {
        return drugService.create(drug);
    }

}