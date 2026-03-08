package com.example.demo;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDate;
import java.sql.Date;
import java.math.BigDecimal;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "business_domain")
public class BusinessDomain {
    // Finance and Banking
    private String financeName; // DMAP Comment : Dead Code Detected - The Following Field has no reference financeName
    private Date financeEstablishmentDate; // DMAP Comment : Dead Code Detected - The Following Field has no reference financeEstablishmentDate
    private BigDecimal financeAmount; // DMAP Comment : Dead Code Detected - The Following Field has no reference financeAmount

    // Healthcare
    private String healthcareServiceName; // DMAP Comment : Dead Code Detected - The Following Field has no reference healthcareServiceName
    private java.sql.Date healthcareServiceCreationDate; // DMAP Comment : Dead Code Detected - The Following Field has no reference healthcareServiceCreationDate
    private BigDecimal healthcareAmount; // DMAP Comment : Dead Code Detected - The Following Field has no reference healthcareAmount

    // E-commerce
    private String ecommercePlatformName; // DMAP Comment : Dead Code Detected - The Following Field has no reference ecommercePlatformName
    private LocalDate ecommercePlatformLaunchDate; // DMAP Comment : Dead Code Detected - The Following Field has no reference ecommercePlatformLaunchDate
    private BigDecimal ecommerceAmount; // DMAP Comment : Dead Code Detected - The Following Field has no reference ecommerceAmount

    // Education
    private String educationInstitutionName; // DMAP Comment : Dead Code Detected - The Following Field has no reference educationInstitutionName
    private java.sql.Date educationInstitutionEstablishedDate; // DMAP Comment : Dead Code Detected - The Following Field has no reference educationInstitutionEstablishedDate
    private BigDecimal educationAmount; // DMAP Comment : Dead Code Detected - The Following Field has no reference educationAmount

    // Travel and Hospitality
    private String travelServiceName; // DMAP Comment : Dead Code Detected - The Following Field has no reference travelServiceName
    private Date travelServiceLaunchDate; // DMAP Comment : Dead Code Detected - The Following Field has no reference travelServiceLaunchDate
    private BigDecimal travelAmount; // DMAP Comment : Dead Code Detected - The Following Field has no reference travelAmount

    // Real Estate
    private String realEstateProjectName; // DMAP Comment : Dead Code Detected - The Following Field has no reference realEstateProjectName
    private LocalDate realEstateProjectCompletionDate; // DMAP Comment : Dead Code Detected - The Following Field has no reference realEstateProjectCompletionDate
    private BigDecimal realEstateAmount; // DMAP Comment : Dead Code Detected - The Following Field has no reference realEstateAmount

    // Manufacturing
    private String manufacturingCompanyName; // DMAP Comment : Dead Code Detected - The Following Field has no reference manufacturingCompanyName
    private java.sql.Date manufacturingCompanyFoundedDate; // DMAP Comment : Dead Code Detected - The Following Field has no reference manufacturingCompanyFoundedDate
    private BigDecimal manufacturingAmount; // DMAP Comment : Dead Code Detected - The Following Field has no reference manufacturingAmount

    // Telecommunications
    private String telecomProviderName; // DMAP Comment : Dead Code Detected - The Following Field has no reference telecomProviderName
    private Date telecomProviderEstablishedDate; // DMAP Comment : Dead Code Detected - The Following Field has no reference telecomProviderEstablishedDate
    private BigDecimal telecomAmount; // DMAP Comment : Dead Code Detected - The Following Field has no reference telecomAmount

    // Retail
    private String retailStoreName; // DMAP Comment : Dead Code Detected - The Following Field has no reference retailStoreName
    private LocalDate retailStoreOpeningDate; // DMAP Comment : Dead Code Detected - The Following Field has no reference retailStoreOpeningDate
    private BigDecimal retailAmount; // DMAP Comment : Dead Code Detected - The Following Field has no reference retailAmount

    // Automotive
    private String automotiveCompanyName; // DMAP Comment : Dead Code Detected - The Following Field has no reference automotiveCompanyName
    private java.sql.Date automotiveCompanyFoundedDate; // DMAP Comment : Dead Code Detected - The Following Field has no reference automotiveCompanyFoundedDate
    private BigDecimal automotiveAmount; // DMAP Comment : Dead Code Detected - The Following Field has no reference automotiveAmount

    // Media and Entertainment
    private String mediaCompanyName; // DMAP Comment : Dead Code Detected - The Following Field has no reference mediaCompanyName
    private Date mediaCompanyEstablishedDate; // DMAP Comment : Dead Code Detected - The Following Field has no reference mediaCompanyEstablishedDate
    private BigDecimal mediaAmount; // DMAP Comment : Dead Code Detected - The Following Field has no reference mediaAmount

    // Insurance
    private String insuranceCompanyName; // DMAP Comment : Dead Code Detected - The Following Field has no reference insuranceCompanyName
    private LocalDate insuranceCompanyIncorporationDate; // DMAP Comment : Dead Code Detected - The Following Field has no reference insuranceCompanyIncorporationDate
    private BigDecimal insuranceAmount; // DMAP Comment : Dead Code Detected - The Following Field has no reference insuranceAmount

    // Human Resources
    private String hrServiceName; // DMAP Comment : Dead Code Detected - The Following Field has no reference hrServiceName
    private java.sql.Date hrServiceEstablishmentDate; // DMAP Comment : Dead Code Detected - The Following Field has no reference hrServiceEstablishmentDate
    private BigDecimal hrAmount; // DMAP Comment : Dead Code Detected - The Following Field has no reference hrAmount
}
