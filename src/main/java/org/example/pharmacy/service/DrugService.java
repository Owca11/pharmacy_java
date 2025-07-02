package org.example.pharmacy.service;

import org.example.pharmacy.controller.dto.CreateDrugDto;
import org.example.pharmacy.controller.dto.CreateDrugResponseDto;
import org.example.pharmacy.controller.dto.GetDrugDto;
import org.example.pharmacy.infrastructure.entity.DrugEntity;
import org.example.pharmacy.infrastructure.repository.DrugRepository;
import org.example.pharmacy.service.errors.DrugNotFoundError;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DrugService {

    private final DrugRepository drugRepository;

    @Autowired
    public DrugService(DrugRepository drugRepository){
        this.drugRepository = drugRepository;
    }

    public List<GetDrugDto> getAll(){
        var drugs = drugRepository.findAll();

        return drugs.stream()
                .map((drug) -> new GetDrugDto(drug.getId(), drug.getMa(), drug.getPrice(), drug.getBrandName(), drug.getManufacturer(), drug.getActiveIngredient(), drug.getNdc(), drug.getAtcCode(), drug.getDrugForm(), drug.getRouteOfAdministration(), drug.getPrescriptionStatus(), drug.getControlledSubstanceStatus(), drug.getContraindications(), drug.getSideEffects(), drug.getDosage(), drug.getBatchNumber(), drug.getExpirationDate(), drug.getStorageConditions(), drug.getAvailableCopies() > 0, drug.getGraphicLink()))
                .toList();
    }

    public GetDrugDto getById(long id){

        var drugEntity = drugRepository.findById(id).orElseThrow(() -> new DrugNotFoundError(id));
        return new GetDrugDto(drugEntity.getId(), drugEntity.getMa(), drugEntity.getPrice(), drugEntity.getBrandName(), drugEntity.getManufacturer(), drugEntity.getActiveIngredient(), drugEntity.getNdc(), drugEntity.getAtcCode(), drugEntity.getDrugForm(), drugEntity.getRouteOfAdministration(), drugEntity.getPrescriptionStatus(), drugEntity.getControlledSubstanceStatus(), drugEntity.getContraindications(), drugEntity.getSideEffects(), drugEntity.getDosage(), drugEntity.getBatchNumber(), drugEntity.getExpirationDate(), drugEntity.getStorageConditions(), drugEntity.getAvailableCopies() > 0, drugEntity.getGraphicLink());
    }

    public CreateDrugResponseDto create(CreateDrugDto drug){

        var price = drug.getPrice();

        var roundedPrice = Math.round(price * 100.0) / 100.0;

        var drugEntity = new DrugEntity();
        drugEntity.setMa(drug.getMa());
        drugEntity.setPrice(roundedPrice);
        drugEntity.setBrandName(drug.getBrandName());
        drugEntity.setManufacturer(drug.getManufacturer());
        drugEntity.setActiveIngredient(drug.getActiveIngredient());
        drugEntity.setNdc(drug.getNdc());
        drugEntity.setAtcCode(drug.getAtcCode());
        drugEntity.setDrugForm(drug.getDrugForm());
        drugEntity.setRouteOfAdministration(drug.getRouteOfAdministration());
        drugEntity.setPrescriptionStatus(drug.getPrescriptionStatus());
        drugEntity.setControlledSubstanceStatus(drug.getControlledSubstanceStatus());
        drugEntity.setContraindications(drug.getContraindications());
        drugEntity.setSideEffects(drug.getSideEffects());
        drugEntity.setDosage(drug.getDosage());
        drugEntity.setBatchNumber(drug.getBatchNumber());
        drugEntity.setExpirationDate(drug.getExpirationDate());
        drugEntity.setStorageConditions(drug.getStorageConditions());
        drugEntity.setAvailableCopies(drug.getAvailableCopies());
        drugEntity.setGraphicLink(drug.getGraphicLink()); // Set graphic link

        var newDrug = drugRepository.save(drugEntity);

        return new CreateDrugResponseDto(newDrug.getId(), newDrug.getMa(), newDrug.getPrice(), newDrug.getBrandName(), newDrug.getManufacturer(), newDrug.getActiveIngredient(), newDrug.getNdc(), newDrug.getAtcCode(), newDrug.getDrugForm(), newDrug.getRouteOfAdministration(), newDrug.getPrescriptionStatus(), newDrug.getControlledSubstanceStatus(), newDrug.getContraindications(), newDrug.getSideEffects(), newDrug.getDosage(), newDrug.getBatchNumber(), newDrug.getExpirationDate(), newDrug.getStorageConditions(), newDrug.getAvailableCopies(), newDrug.getGraphicLink());
    }

    public void delete(long id){
        if (!drugRepository.existsById(id)){
            throw new RuntimeException("Drug not found");
        }
        drugRepository.deleteById(id);
    }
}