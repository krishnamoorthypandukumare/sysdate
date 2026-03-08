 /* This application remediation was done for embedded Oracle SQL to make it compatible with PostgreSQL with Newt DMAP Version: v9.2.0.0_v8.5.0.1 on Date: 08-Mar-2026 */
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
DMAP ConvertedQuery - SELECT b FROM BusinessDomain b WHERE b.financeEstablishmentDate = SYSDATE()
**/

@Query("SELECT b FROM BusinessDomain b WHERE b.financeEstablishmentDate = SYSDATE()") /*DMAP Converted Line */
    List<BusinessDomain> findAllEstablishedToday();

    // JPQL query using sysdate (not standard JPQL, for demonstration only)
/**
DMAP TAG: Query needs manual remediation: Identifier3
DMAP ConvertedQuery - SELECT b FROM BusinessDomain b WHERE b.financeEstablishmentDate = sysdate
**/

@Query("SELECT b FROM BusinessDomain b WHERE b.financeEstablishmentDate = sysdate") /*DMAP Converted Line */
    List<BusinessDomain> findAllEstablishedTodaySysdate();

    // JPQL query using SYSDATE() (not standard JPQL, for demonstration only)
/**
DMAP TAG: Query needs manual remediation: Identifier2
DMAP ConvertedQuery - SELECT b FROM BusinessDomain b WHERE b.financeEstablishmentDate = sysdate()
**/

@Query("SELECT b FROM BusinessDomain b WHERE b.financeEstablishmentDate = sysdate()") /*DMAP Converted Line */
    List<BusinessDomain> findAllEstablishedTodaySYSDATEFn();

    // JPQL query using SYSDATE (not standard JPQL, for demonstration only)
/**
DMAP TAG: Query needs manual remediation: Identifier1
DMAP ConvertedQuery - SELECT b FROM BusinessDomain b WHERE b.financeEstablishmentDate = SYSDATE
**/

@Query("SELECT b FROM BusinessDomain b WHERE b.financeEstablishmentDate = SYSDATE") /*DMAP Converted Line */
    List<BusinessDomain> findAllEstablishedTodaySYSDATE();
}
