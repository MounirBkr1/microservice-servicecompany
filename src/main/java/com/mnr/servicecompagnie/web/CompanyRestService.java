package com.mnr.servicecompagnie.web;



import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

//@RefreshScope: raffraichir les params une fois ils sont changés
@RefreshScope
@RestController
public class CompanyRestService {

    //pour recuperer variable
    @Value("${xParam}")
    private int xParam;

    @Value("${yParam}")
    private int yParam;

    @Value("${me}")
    private String me;

    @GetMapping("/myConfig")
    public Map<String,Object> myConfig(){
        Map<String,Object> params= new HashMap<>();
        params.put("xParam", xParam);
        params.put("yParam", yParam);
        params.put("me", me);
        params.put("threadName", Thread.currentThread().getName());
        return params;
    }
}
