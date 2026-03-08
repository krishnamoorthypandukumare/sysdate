package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BusinessDomainRepository extends JpaRepository<BusinessDomain, Long> {
    // JPQL query using CURRENT_DATE (portable, nativeQuery = false by default)
    @Query("SELECT b FROM BusinessDomain b WHERE b.financeEstablishmentDate = SYSDATE()")
    List<BusinessDomain> findAllEstablishedToday();

    // JPQL query using sysdate (not standard JPQL, for demonstration only)
    @Query("SELECT b FROM BusinessDomain b WHERE b.financeEstablishmentDate = sysdate")
    List<BusinessDomain> findAllEstablishedTodaySysdate();

    // JPQL query using SYSDATE() (not standard JPQL, for demonstration only)
    @Query("SELECT b FROM BusinessDomain b WHERE b.financeEstablishmentDate = sysdate()")
    List<BusinessDomain> findAllEstablishedTodaySYSDATEFn();

    // JPQL query using SYSDATE (not standard JPQL, for demonstration only)
    @Query("SELECT b FROM BusinessDomain b WHERE b.financeEstablishmentDate = SYSDATE")
    List<BusinessDomain> findAllEstablishedTodaySYSDATE();
}
