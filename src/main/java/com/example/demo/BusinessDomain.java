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
    private String financeName;
    private Date financeEstablishmentDate;
    private BigDecimal financeAmount;

    // Healthcare
    private String healthcareServiceName;
    private java.sql.Date healthcareServiceCreationDate;
    private BigDecimal healthcareAmount;

    // E-commerce
    private String ecommercePlatformName;
    private LocalDate ecommercePlatformLaunchDate;
    private BigDecimal ecommerceAmount;

    // Education
    private String educationInstitutionName;
    private java.sql.Date educationInstitutionEstablishedDate;
    private BigDecimal educationAmount;

    // Travel and Hospitality
    private String travelServiceName;
    private Date travelServiceLaunchDate;
    private BigDecimal travelAmount;

    // Real Estate
    private String realEstateProjectName;
    private LocalDate realEstateProjectCompletionDate;
    private BigDecimal realEstateAmount;

    // Manufacturing
    private String manufacturingCompanyName;
    private java.sql.Date manufacturingCompanyFoundedDate;
    private BigDecimal manufacturingAmount;

    // Telecommunications
    private String telecomProviderName;
    private Date telecomProviderEstablishedDate;
    private BigDecimal telecomAmount;

    // Retail
    private String retailStoreName;
    private LocalDate retailStoreOpeningDate;
    private BigDecimal retailAmount;

    // Automotive
    private String automotiveCompanyName;
    private java.sql.Date automotiveCompanyFoundedDate;
    private BigDecimal automotiveAmount;

    // Media and Entertainment
    private String mediaCompanyName;
    private Date mediaCompanyEstablishedDate;
    private BigDecimal mediaAmount;

    // Insurance
    private String insuranceCompanyName;
    private LocalDate insuranceCompanyIncorporationDate;
    private BigDecimal insuranceAmount;

    // Human Resources
    private String hrServiceName;
    private java.sql.Date hrServiceEstablishmentDate;
    private BigDecimal hrAmount;
}
