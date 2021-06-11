package com.example.workflow;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Component;


    @Component
    public class CalculatorRemainder implements JavaDelegate {

        @Override
        public void execute(DelegateExecution delegateExecution) throws Exception {
            int num1 = (int) delegateExecution.getVariable("num1");
            int num2 = (int) delegateExecution.getVariable("num2");
            int res = num1%num2;
            delegateExecution.setVariable("result", res);

        }
    }

