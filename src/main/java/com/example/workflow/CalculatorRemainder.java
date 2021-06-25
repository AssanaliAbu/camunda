package com.example.workflow;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.camunda.bpm.engine.rest.dto.identity.UserDto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.stereotype.Component;

import java.util.LinkedHashMap;
import java.util.List;


@Component
    @EnableFeignClients
    public class CalculatorRemainder implements JavaDelegate {




        @Override
        public void execute(DelegateExecution delegateExecution) throws Exception {
//            String name = (String) delegateExecution.getVariable("name");
//            List<LinkedHashMap> res = feignInterface.findbyname(name);
//            delegateExecution.setVariable("age", res.get(0).get("age"));
////            UserDto kek = null;
////            int userage = kek.getAge("Nane");



        }



}

