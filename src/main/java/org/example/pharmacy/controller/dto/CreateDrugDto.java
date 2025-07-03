package org.example.pharmacy.controller.dto;

import jakarta.validation.constraints.*;

public class CreateDrugDto {
    /**
     * Marketing Authorization (MA) number of the drug.
     */
    @NotBlank(message = "MA cannot be blank")
    @Pattern(regexp = "[A-Z]{2}\\d{6}", message = "MA number must be in format AA123456")
    private String ma;

    /**
     * Price of the drug.
     */
    @Max(value = 10000, message = "Price cannot exceed 10000")
    @Digits(integer = 5, fraction = 2, message = "Price must be a valid number with up to 2 decimal places")
    @DecimalMin(value = "0.01", message = "Price must be at least 0.01")
    private double price;

    /**
     * Brand name of the drug.
     */
    @NotBlank(message = "Brand name cannot be blank")
    @Size(max = 50, message = "Brand name cannot exceed 50 characters")
    private String brandName;

    /**
     * Manufacturer of the drug.
     */
    @NotBlank(message = "Manufacturer cannot be blank")
    @Size(max = 50, message = "Manufacturer cannot exceed 50 characters")
    private String manufacturer;

    /**
     * Active ingredient of the drug.
     */
    @NotBlank(message = "Active ingredient cannot be blank")
    @Size(max = 100, message = "Active ingredient cannot exceed 100 characters")
    private String activeIngredient;

    /**
     * National Drug Code (NDC) of the drug.
     */
    @NotBlank(message = "NDC cannot be blank")
    @Pattern(regexp = "\\d{4}-\\d{4}-\\d{2}", message = "NDC must be in format 1234-5678-90")
    private String ndc;

    /**
     * Anatomical Therapeutic Chemical (ATC) code of the drug.
     */
    @NotBlank(message = "ATC code cannot be blank")
    @Pattern(regexp = "[A-Z]{1}\\d{2}[A-Z]{2}\\d{2}", message = "ATC code must follow the format A00AA00")
    private String atcCode;

    /**
     * Drug form (e.g., tablet, capsule).
     */
    @NotBlank(message = "Drug form cannot be blank")
    @Size(max = 30, message = "Drug form cannot exceed 30 characters")
    private String drugForm;

    /**
     * Route of administration (e.g., oral, topical).
     */
    @NotBlank(message = "Route of administration cannot be blank")
    @Size(max = 30, message = "Route of administration cannot exceed 30 characters")
    private String routeOfAdministration;

    /**
     * Prescription status (OTC or Rx-only).
     */
    @NotBlank(message = "Prescription status cannot be blank")
    @Pattern(regexp = "OTC|Rx-only", message = "Prescription status must be either 'OTC' or 'Rx-only'")
    private String prescriptionStatus;

    /**
     * Controlled substance status (e.g., C-I, C-II).
     */
    @NotBlank(message = "Controlled substance status cannot be blank")
    @Pattern(regexp = "C-[IV]{1,3}", message = "Controlled substance status must follow the format C-I, C-II, etc.")
    private String controlledSubstanceStatus;

    /**
     * Contraindications for the drug.
     */
    @Size(max = 100, message = "Contraindications cannot exceed 100 characters")
    private String contraindications = "There's no known contraindications";

    /**
     * Side effects of the drug.
     */
    @Size(max = 100, message = "Side effects cannot exceed 100 characters")
    private String sideEffects = "There's no known side effects";

    /**
     * Dosage information for the drug.
     */
    @NotBlank(message = "Dosage cannot be blank")
    @Size(max = 50, message = "Dosage cannot exceed 50 characters")
    private String dosage;

    /**
     * Batch number of the drug.
     */
    @NotBlank(message = "Batch number cannot be blank")
    @Size(max = 20, message = "Batch number cannot exceed 20 characters")
    private String batchNumber;

    /**
     * Expiration date of the drug (YYYY-MM-DD).
     */
    @NotBlank(message = "Expiration date cannot be blank")
    @Pattern(regexp = "\\d{4}-\\d{2}-\\d{2}", message = "Expiration date must follow the format YYYY-MM-dd")
    private String expirationDate;

    /**
     * Storage conditions for the drug.
     */
    @Size(max = 100, message = "Storage conditions cannot exceed 100 characters")
    private String storageConditions = "There's no specific storage conditions";

    /**
     * Number of available copies of the drug.
     */
    @Min(value = 1, message = "Available copies must be a positive integer")
    private int availableCopies;

    /**
     * Link to a graphic representation of the drug.
     */
    @Pattern(
            regexp = "^(http|https)://.*\\.(jpeg|jpg|gif|png|bmp|svg)(\\?.*)?$",
            message = "Graphic link must be a valid image URL"
    )
    @Size(max = 1000, message = "Graphic link cannot exceed 1000 characters")
    private String graphicLink;

    /**
     * Default constructor.
     */
    public CreateDrugDto() {
    }

    /**
     * Constructor with all fields.
     */
    public CreateDrugDto(String ma, String brandName, Double price, String manufacturer, String activeIngredient, String ndc, String atcCode, String drugForm, String routeOfAdministration, String prescriptionStatus, String controlledSubstanceStatus, String contraindications, String sideEffects, String dosage, String batchNumber, String expirationDate, String storageConditions, int availableCopies, String graphicLink) {
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
        this.graphicLink = graphicLink;
    }

    /**
     * Gets the Marketing Authorization (MA) number.
     * @return The MA number.
     */
    public String getMa() {
        return ma;
    }

    /**
     * Sets the Marketing Authorization (MA) number.
     * @param ma The MA number to set.
     */
    public void setMa(String ma) {
        this.ma = ma;
    }

    /**
     * Gets the price of the drug.
     * @return The price.
     */
    public double getPrice() {
        return price;
    }

    /**
     * Sets the price of the drug.
     * @param price The price to set.
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * Gets the brand name of the drug.
     * @return The brand name.
     */
    public String getBrandName() {
        return brandName;
    }

    /**
     * Sets the brand name of the drug.
     * @param brandName The brand name to set.
     */
    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    /**
     * Gets the manufacturer of the drug.
     * @return The manufacturer.
     */
    public String getManufacturer() {
        return manufacturer;
    }

    /**
     * Sets the manufacturer of the drug.
     * @param manufacturer The manufacturer to set.
     */
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    /**
     * Gets the active ingredient of the drug.
     * @return The active ingredient.
     */
    public String getActiveIngredient() {
        return activeIngredient;
    }

    /**
     * Sets the active ingredient of the drug.
     * @param activeIngredient The active ingredient to set.
     */
    public void setActiveIngredient(String activeIngredient) {
        this.activeIngredient = activeIngredient;
    }

    /**
     * Gets the National Drug Code (NDC).
     * @return The NDC.
     */
    public String getNdc() {
        return ndc;
    }

    /**
     * Sets the National Drug Code (NDC).
     * @param ndc The NDC to set.
     */
    public void setNdc(String ndc) {
        this.ndc = ndc;
    }

    /**
     * Gets the Anatomical Therapeutic Chemical (ATC) code.
     * @return The ATC code.
     */
    public String getAtcCode() {
        return atcCode;
    }

    /**
     * Sets the Anatomical Therapeutic Chemical (ATC) code.
     * @param atcCode The ATC code to set.
     */
    public void setAtcCode(String atcCode) {
        this.atcCode = atcCode;
    }

    /**
     * Gets the drug form.
     * @return The drug form.
     */
    public String getDrugForm() {
        return drugForm;
    }

    /**
     * Sets the drug form.
     * @param drugForm The drug form to set.
     */
    public void setDrugForm(String drugForm) {
        this.drugForm = drugForm;
    }

    /**
     * Gets the route of administration.
     * @return The route of administration.
     */
    public String getRouteOfAdministration() {
        return routeOfAdministration;
    }

    /**
     * Sets the route of administration.
     * @param routeOfAdministration The route of administration to set.
     */
    public void setRouteOfAdministration(String routeOfAdministration) {
        this.routeOfAdministration = routeOfAdministration;
    }

    /**
     * Gets the prescription status.
     * @return The prescription status.
     */
    public String getPrescriptionStatus() {
        return prescriptionStatus;
    }

    /**
     * Sets the prescription status.
     * @param prescriptionStatus The prescription status to set.
     */
    public void setPrescriptionStatus(String prescriptionStatus) {
        this.prescriptionStatus = prescriptionStatus;
    }

    /**
     * Gets the controlled substance status.
     * @return The controlled substance status.
     */
    public String getControlledSubstanceStatus() {
        return controlledSubstanceStatus;
    }

    /**
     * Sets the controlled substance status.
     * @param controlledSubstanceStatus The controlled substance status to set.
     */
    public void setControlledSubstanceStatus(String controlledSubstanceStatus) {
        this.controlledSubstanceStatus = controlledSubstanceStatus;
    }

    /**
     * Gets the contraindications.
     * @return The contraindications.
     */
    public String getContraindications() {
        return contraindications;
    }

    /**
     * Sets the contraindications.
     * @param contraindications The contraindications to set.
     */
    public void setContraindications(String contraindications) {
        this.contraindications = contraindications;
    }

    /**
     * Gets the side effects.
     * @return The side effects.
     */
    public String getSideEffects() {
        return sideEffects;
    }

    /**
     * Sets the side effects.
     * @param sideEffects The side effects to set.
     */
    public void setSideEffects(String sideEffects) {
        this.sideEffects = sideEffects;
    }

    /**
     * Gets the dosage information.
     * @return The dosage.
     */
    public String getDosage() {
        return dosage;
    }

    /**
     * Sets the dosage information.
     * @param dosage The dosage to set.
     */
    public void setDosage(String dosage) {
        this.dosage = dosage;
    }

    /**
     * Gets the batch number.
     * @return The batch number.
     */
    public String getBatchNumber() {
        return batchNumber;
    }

    /**
     * Sets the batch number.
     * @param batchNumber The batch number to set.
     */
    public void setBatchNumber(String batchNumber) {
        this.batchNumber = batchNumber;
    }

    /**
     * Gets the expiration date.
     * @return The expiration date.
     */
    public String getExpirationDate() {
        return expirationDate;
    }

    /**
     * Sets the expiration date.
     * @param expirationDate The expiration date to set.
     */
    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    /**
     * Gets the storage conditions.
     * @return The storage conditions.
     */
    public String getStorageConditions() {
        return storageConditions;
    }

    /**
     * Sets the storage conditions.
     * @param storageConditions The storage conditions to set.
     */
    public void setStorageConditions(String storageConditions) {
        this.storageConditions = storageConditions;
    }

    /**
     * Gets the number of available copies.
     * @return The available copies.
     */
    public int getAvailableCopies() {
        return availableCopies;
    }

    /**
     * Sets the number of available copies.
     * @param availableCopies The available copies to set.
     */
    public void setAvailableCopies(int availableCopies) {
        this.availableCopies = availableCopies;
    }

    /**
     * Gets the graphic link.
     * @return The graphic link.
     */
    public String getGraphicLink() {
        return graphicLink;
    }

    /**
     * Sets the graphic link.
     * @param graphicLink The graphic link to set.
     */
    public void setGraphicLink(String graphicLink) {
        this.graphicLink = graphicLink;
    }
}