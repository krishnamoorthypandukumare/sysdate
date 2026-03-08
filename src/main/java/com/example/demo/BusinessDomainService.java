package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class BusinessDomainService {
    @Autowired
    private BusinessDomainRepository repository;

    public List<BusinessDomain> getEstablishedToday() {
        return repository.findAllEstablishedToday();
    }

    public List<BusinessDomain> getEstablishedTodaySysdate() {
        return repository.findAllEstablishedTodaySysdate();
    }

    public List<BusinessDomain> getEstablishedTodaySYSDATEFn() {
        return repository.findAllEstablishedTodaySYSDATEFn();
    }

    public List<BusinessDomain> getEstablishedTodaySYSDATE() {
        return repository.findAllEstablishedTodaySYSDATE();
    }
}
