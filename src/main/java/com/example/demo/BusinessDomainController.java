package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/business-domain")
public class BusinessDomainController {
    @Autowired
    private BusinessDomainService service;

    @GetMapping("/established-today")
    public List<BusinessDomain> getEstablishedToday() {
        return service.getEstablishedToday();
    }

    @GetMapping("/established-today-sysdate")
    public List<BusinessDomain> getEstablishedTodaySysdate() {
        return service.getEstablishedTodaySysdate();
    }

    @GetMapping("/established-today-sysdate-fn")
    public List<BusinessDomain> getEstablishedTodaySYSDATEFn() {
        return service.getEstablishedTodaySYSDATEFn();
    }

    @GetMapping("/established-today-sysdate-upper")
    public List<BusinessDomain> getEstablishedTodaySYSDATE() {
        return service.getEstablishedTodaySYSDATE();
    }
}
