package org.example.pharmacy.infrastructure.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "drugs", schema = "pharmacy")
public class DrugEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private long id;

    @Basic
    @Column(name = "ma", unique = true) // Marketing Authorization Number (MA)
    private String ma;

    @Basic
    @Column(name = "price")
    private double price;

    @Basic
    @Column(name = "brandName")
    private String brandName;

    @Basic
    @Column(name = "manufacturer")
    private String manufacturer;

    @Basic
    @Column(name = "activeIngredient")
    private String activeIngredient;

    @Basic
    @Column(name = "ndc")
    private String ndc; // National Drug Code (NDC)

    @Basic
    @Column(name = "atcCode")
    private String atcCode; // Anatomical Therapeutic Chemical (ATC) code

    @Basic
    @Column(name = "drugForm")
    private String drugForm; // e.g. tablet, capsule, syrup, etc.

    @Basic
    @Column(name = "routeOfAdministration")
    private String routeOfAdministration; // e.g. oral, intravenous, etc.

    @Basic
    @Column(name = "prescriptionStatus")
    private String prescriptionStatus; // e.g. OTC, Rx-only

    @Basic
    @Column(name = "controlledSubstanceStatus")
    private String controlledSubstanceStatus; // e.g. C-II, C-III, etc.

    @Basic
    @Column(name = "contraindications")
    private String contraindications; // e.g. hypersensitivity, pregnancy, etc.

    @Basic
    @Column(name = "sideEffects")
    private String sideEffects; // e.g. dizziness, nausea, etc.

    @Basic
    @Column(name = "dosage")
    private String dosage; // e.g. 500 mg, 1 tablet, etc.

    @Basic
    @Column(name = "batchNumber")
    private String batchNumber; // e.g. 12345

    @Basic
    @Column(name = "expirationDate")
    private String expirationDate; // e.g. 2023-12-31

    @Basic
    @Column(name = "storageConditions")
    private String storageConditions; // e.g. room temperature, refrigerated, etc.

    @Basic
    @Column(name = "availableCopies")
    private int availableCopies;


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

    public int getAvailableCopies() {
        return availableCopies;
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

    public void setAvailableCopies(int availableCopies) {
        this.availableCopies = availableCopies;
    }
}
