package org.example.pharmacy.controller.dto;

import jakarta.validation.constraints.*;

public class CreateDrugDto {
    @NotBlank(message = "MA cannot be blank")
    @Pattern(regexp = "[A-Z]{2}\\d{6}", message = "MA number must be in format AA123456")
    private String ma;

    @Max(value = 10000, message = "Price cannot exceed 10000")
    @Digits(integer = 5, fraction = 2, message = "Price must be a valid number with up to 2 decimal places")
    @DecimalMin(value = "0.01", message = "Price must be at least 0.01")
    private double price;

    @NotBlank(message = "Brand name cannot be blank")
    @Size(max = 50, message = "Brand name cannot exceed 50 characters")
    private String brandName;

    @NotBlank(message = "Manufacturer cannot be blank")
    @Size(max = 50, message = "Manufacturer cannot exceed 50 characters")
    private String manufacturer;

    @NotBlank(message = "Active ingredient cannot be blank")
    @Size(max = 100, message = "Active ingredient cannot exceed 100 characters")
    private String activeIngredient;

    @NotBlank(message = "NDC cannot be blank")
    @Pattern(regexp = "\\d{4}-\\d{4}-\\d{2}", message = "NDC must be in format 1234-5678-90")
    private String ndc;

    @NotBlank(message = "ATC code cannot be blank")
    @Pattern(regexp = "[A-Z]{1}\\d{2}[A-Z]{2}\\d{2}", message = "ATC code must follow the format A00AA00")
    private String atcCode;

    @NotBlank(message = "Drug form cannot be blank")
    @Size(max = 30, message = "Drug form cannot exceed 30 characters")
    private String drugForm;

    @NotBlank(message = "Route of administration cannot be blank")
    @Size(max = 30, message = "Route of administration cannot exceed 30 characters")
    private String routeOfAdministration;

    @NotBlank(message = "Prescription status cannot be blank")
    @Pattern(regexp = "OTC|Rx-only", message = "Prescription status must be either 'OTC' or 'Rx-only'")
    private String prescriptionStatus;

    @NotBlank(message = "Controlled substance status cannot be blank")
    @Pattern(regexp = "C-[IV]{1,3}", message = "Controlled substance status must follow the format C-I, C-II, etc.")
    private String controlledSubstanceStatus;

    @Size(max = 100, message = "Contraindications cannot exceed 100 characters")
    private String contraindications = "There's no known contraindications";

    @Size(max = 100, message = "Side effects cannot exceed 100 characters")
    private String sideEffects = "There's no known side effects";

    @NotBlank(message = "Dosage cannot be blank")
    @Size(max = 50, message = "Dosage cannot exceed 50 characters")
    private String dosage;

    @NotBlank(message = "Batch number cannot be blank")
    @Size(max = 20, message = "Batch number cannot exceed 20 characters")
    private String batchNumber;

    @NotBlank(message = "Expiration date cannot be blank")
    @Pattern(regexp = "\\d{4}-\\d{2}-\\d{2}", message = "Expiration date must follow the format yyyy-MM-dd")
//    @Future(message = "The expiration date has passed, you cannot add this drug")
    private String expirationDate;

    @Size(max = 100, message = "Storage conditions cannot exceed 100 characters")
    private String storageConditions = "There's no specific storage conditions";

    @Min(value = 1, message = "Available copies must be a positive integer")
    private int availableCopies;

    public CreateDrugDto() {
    }

    public CreateDrugDto(String ma, String brandName, Double price, String manufacturer, String activeIngredient, String ndc, String atcCode, String drugForm, String routeOfAdministration, String prescriptionStatus, String controlledSubstanceStatus, String contraindications, String sideEffects, String dosage, String batchNumber, String expirationDate, String storageConditions, int availableCopies) {
        this.ma = ma;
        this.price = price;
        this.brandName = brandName;
        this.manufacturer = manufacturer;
        this.activeIngredient = activeIngredient;
        this.ndc = ndc;
        this.atcCode = atcCode;
        this.drugForm = drugForm;
        this.routeOfAdministration = routeOfAdministration;
        this.prescriptionStatus = prescriptionStatus;
        this.controlledSubstanceStatus = controlledSubstanceStatus;
        this.contraindications = contraindications;
        this.sideEffects = sideEffects;
        this.dosage = dosage;
        this.batchNumber = batchNumber;
        this.expirationDate = expirationDate;
        this.storageConditions = storageConditions;
        this.availableCopies = availableCopies;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getActiveIngredient() {
        return activeIngredient;
    }

    public void setActiveIngredient(String activeIngredient) {
        this.activeIngredient = activeIngredient;
    }

    public String getNdc() {
        return ndc;
    }

    public void setNdc(String ndc) {
        this.ndc = ndc;
    }

    public String getAtcCode() {
        return atcCode;
    }

    public void setAtcCode(String atcCode) {
        this.atcCode = atcCode;
    }

    public String getDrugForm() {
        return drugForm;
    }

    public void setDrugForm(String drugForm) {
        this.drugForm = drugForm;
    }

    public String getRouteOfAdministration() {
        return routeOfAdministration;
    }

    public void setRouteOfAdministration(String routeOfAdministration) {
        this.routeOfAdministration = routeOfAdministration;
    }

    public String getPrescriptionStatus() {
        return prescriptionStatus;
    }

    public void setPrescriptionStatus(String prescriptionStatus) {
        this.prescriptionStatus = prescriptionStatus;
    }

    public String getControlledSubstanceStatus() {
        return controlledSubstanceStatus;
    }

    public void setControlledSubstanceStatus(String controlledSubstanceStatus) {
        this.controlledSubstanceStatus = controlledSubstanceStatus;
    }

    public String getContraindications() {
        return contraindications;
    }

    public void setContraindications(String contraindications) {
        this.contraindications = contraindications;
    }

    public String getSideEffects() {
        return sideEffects;
    }

    public void setSideEffects(String sideEffects) {
        this.sideEffects = sideEffects;
    }

    public String getDosage() {
        return dosage;
    }

    public void setDosage(String dosage) {
        this.dosage = dosage;
    }

    public String getBatchNumber() {
        return batchNumber;
    }

    public void setBatchNumber(String batchNumber) {
        this.batchNumber = batchNumber;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    public String getStorageConditions() {
        return storageConditions;
    }

    public void setStorageConditions(String storageConditions) {
        this.storageConditions = storageConditions;
    }

    public int getAvailableCopies() {
        return availableCopies;
    }

    public void setAvailableCopies(int availableCopies) {
        this.availableCopies = availableCopies;
    }
}
