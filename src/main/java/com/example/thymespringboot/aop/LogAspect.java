package com.example.thymespringboot.aop;

import java.util.UUID;

import org.apache.logging.log4j.ThreadContext;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import lombok.extern.log4j.Log4j2;

@Log4j2
@Aspect
@Component
public class LogAspect {

    @Around(value = "@annotation(com.example.thymespringboot.annotation.LogExecutionTime)")
    public Object logExecutionTime(ProceedingJoinPoint joinPoint) throws Throwable {
        final long start = System.currentTimeMillis();
        final Object proceed = joinPoint.proceed();
        final long executionTime = System.currentTimeMillis() - start;
        log.info("{}.{} executed in {} ms", joinPoint.getTarget().getClass().getSimpleName()
                , joinPoint.getSignature().getName()
                , executionTime);
        return proceed;
    }

    @Before(value = "@annotation(com.example.thymespringboot.annotation.GenerateTransaction)")
    public void generateTransaction(JoinPoint joinPoint) throws Throwable {
        String transactionId = UUID.randomUUID().toString();
        ThreadContext.put("transactionId", transactionId);
    }
    
    @After(value = "@annotation(com.example.thymespringboot.annotation.GenerateTransaction)")
    public void clearTransaction(JoinPoint joinPoint) throws Throwable {
        ThreadContext.clearAll();
    }

}
