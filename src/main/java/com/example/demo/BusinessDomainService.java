package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class BusinessDomainService {
    @Autowired
    private BusinessDomainRepository repository;

    public List<BusinessDomain> getEstablishedToday() { // DMAP Comment : Dead Code Detected - The Following Method has no reference getEstablishedToday
        return repository.findAllEstablishedToday();
    }

    public List<BusinessDomain> getEstablishedTodaySysdate() { // DMAP Comment : Dead Code Detected - The Following Method has no reference getEstablishedTodaySysdate
        return repository.findAllEstablishedTodaySysdate();
    }

    public List<BusinessDomain> getEstablishedTodaySYSDATEFn() { // DMAP Comment : Dead Code Detected - The Following Method has no reference getEstablishedTodaySYSDATEFn
        return repository.findAllEstablishedTodaySYSDATEFn();
    }

    public List<BusinessDomain> getEstablishedTodaySYSDATE() { // DMAP Comment : Dead Code Detected - The Following Method has no reference getEstablishedTodaySYSDATE
        return repository.findAllEstablishedTodaySYSDATE();
    }
}
