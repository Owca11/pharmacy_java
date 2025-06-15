package org.example.pharmacy.controller.dto;

public class CreateDrugResponseDto {
    private long id;
    private String ma;
    private double price;
    private String brandName;
    private String manufacturer;
    private String activeIngredient;
    private String ndc;
    private String atcCode;
    private String drugForm;
    private String routeOfAdministration;
    private String prescriptionStatus;
    private String controlledSubstanceStatus;
    private String contraindications;
    private String sideEffects;
    private String dosage;
    private String batchNumber;
    private String expirationDate;
    private String storageConditions;
    private int availableCopies;

    public CreateDrugResponseDto() {
    }

    public CreateDrugResponseDto(long id, String ma, Double Price, String brandName, String manufacturer, String activeIngredient, String ndc, String atcCode, String drugForm, String routeOfAdministration, String prescriptionStatus, String controlledSubstanceStatus, String contraindications, String sideEffects, String dosage, String batchNumber, String expirationDate, String storageConditions, int availableCopies) {
        this.id = id;
        this.ma = ma;
        this.price = Price;
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

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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