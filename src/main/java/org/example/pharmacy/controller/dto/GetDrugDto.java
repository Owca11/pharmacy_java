package org.example.pharmacy.controller.dto;

public class GetDrugDto {
    /**
     * Unique identifier for the drug.
     */
    private long id;
    /**
     * Marketing Authorization (MA) number of the drug.
     */
    private String ma;
    /**
     * Price of the drug.
     */
    private double price;
    /**
     * Brand name of the drug.
     */
    private String brandName;
    /**
     * Manufacturer of the drug.
     */
    private String manufacturer;
    /**
     * Active ingredient of the drug.
     */
    private String activeIngredient;
    /**
     * National Drug Code (NDC) of the drug.
     */
    private String ndc;
    /**
     * Anatomical Therapeutic Chemical (ATC) code of the drug.
     */
    private String atcCode;
    /**
     * Drug form (e.g., tablet, capsule).
     */
    private String drugForm;
    /**
     * Route of administration (e.g., oral, topical).
     */
    private String routeOfAdministration;
    /**
     * Prescription status (OTC or Rx-only).
     */
    private String prescriptionStatus;
    /**
     * Controlled substance status (e.g., C-I, C-II).
     */
    private String controlledSubstanceStatus;
    /**
     * Contraindications for the drug.
     */
    private String contraindications;
    /**
     * Side effects of the drug.
     */
    private String sideEffects;
    /**
     * Dosage information for the drug.
     */
    private String dosage;
    /**
     * Batch number of the drug.
     */
    private String batchNumber;
    /**
     * Expiration date of the drug.
     */
    private String expirationDate;
    /**
     * Storage conditions for the drug.
     */
    private String storageConditions;
    /**
     * Availability status of the drug.
     */
    private boolean isAvailable;
    /**
     * Link to a graphic representation of the drug.
     */
    private String graphicLink;

    /**
     * Default constructor.
     */
    public GetDrugDto() {
    }

    /**
     * Constructor with all fields.
     */
    public GetDrugDto(long id, String ma, Double price, String brandName, String manufacturer, String activeIngredient, String ndc, String atcCode, String drugForm, String routeOfAdministration, String prescriptionStatus, String controlledSubstanceStatus, String contraindications, String sideEffects, String dosage, String batchNumber, String expirationDate, String storageConditions, boolean isAvailable, String graphicLink) {
        this.id = id;
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
        this.isAvailable = isAvailable;
        this.graphicLink = graphicLink;
    }

    /**
     * Gets the unique identifier of the drug.
     * @return The drug ID.
     */
    public long getId() {
        return id;
    }

    /**
     * Sets the unique identifier of the drug.
     * @param id The drug ID to set.
     */
    public void setId(long id) {
        this.id = id;
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
     * Checks if the drug is available.
     * @return True if available, false otherwise.
     */
    public boolean isAvailable() {
        return isAvailable;
    }

    /**
     * Sets the availability status of the drug.
     * @param available The availability status to set.
     */
    public void setAvailable(boolean available) {
        isAvailable = available;
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