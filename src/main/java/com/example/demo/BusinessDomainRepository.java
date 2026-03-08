 /* This application remediation was done for embedded Oracle SQL to make it compatible with PostgreSQL with Newt DMAP Version: v2026.02.0.1_v8.5.2.8 on Date: 08-Mar-2026 */
package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BusinessDomainRepository extends JpaRepository<BusinessDomain, Long> {
    // JPQL query using CURRENT_DATE (portable, nativeQuery = false by default)
/**
DMAP TAG: Query needs manual remediation: Identifier4
DMAP ConvertedQuery - SELECT b FROM BusinessDomain b WHERE b.financeEstablishmentDate = CAST(SYSDATE() AS TIMESTAMP)
**/

@Query("SELECT b FROM BusinessDomain b WHERE b.financeEstablishmentDate = CAST(SYSDATE() AS TIMESTAMP)") /*DMAP Converted Line */
    List<BusinessDomain> findAllEstablishedToday();

    // JPQL query using sysdate (not standard JPQL, for demonstration only)
/**
DMAP TAG: Query needs manual remediation: Identifier3
DMAP ConvertedQuery - SELECT b FROM BusinessDomain b WHERE b.financeEstablishmentDate = CAST(sysdate AS TIMESTAMP)
**/

@Query("SELECT b FROM BusinessDomain b WHERE b.financeEstablishmentDate = CAST(sysdate AS TIMESTAMP)") /*DMAP Converted Line */
    List<BusinessDomain> findAllEstablishedTodaySysdate();

    // JPQL query using SYSDATE() (not standard JPQL, for demonstration only)
/**
DMAP TAG: Query needs manual remediation: Identifier2
DMAP ConvertedQuery - SELECT b FROM BusinessDomain b WHERE b.financeEstablishmentDate = CAST(sysdate() AS TIMESTAMP)
**/

@Query("SELECT b FROM BusinessDomain b WHERE b.financeEstablishmentDate = CAST(sysdate() AS TIMESTAMP)") /*DMAP Converted Line */
    List<BusinessDomain> findAllEstablishedTodaySYSDATEFn();

    // JPQL query using SYSDATE (not standard JPQL, for demonstration only)
/**
DMAP TAG: Query needs manual remediation: Identifier1
DMAP ConvertedQuery - SELECT b FROM BusinessDomain b WHERE b.financeEstablishmentDate = CAST(SYSDATE AS TIMESTAMP)
**/

@Query("SELECT b FROM BusinessDomain b WHERE b.financeEstablishmentDate = CAST(SYSDATE AS TIMESTAMP)") /*DMAP Converted Line */
    List<BusinessDomain> findAllEstablishedTodaySYSDATE();
}
