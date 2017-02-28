/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.it355.aspect;

import java.lang.reflect.Method;
import java.util.Arrays;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.aop.MethodBeforeAdvice;

/**
 *
 * @author Ivan
 */
@Aspect
public class InterceptorLog implements MethodBeforeAdvice{

    @Override
    public void before(Method method, Object[] os, Object o) throws Throwable {
        System.out.println("<<logBefore() metoda je pozvana>>");
        System.out.println("Presretanje: "+method.getName());
        System.out.println("------------");
    }
    
    @After("execution(* com.it355.dao.SobaServiceImpl.addSoba()))")
    public void logAfter(JoinPoint jp){
        System.out.println("<<logAfter() metoda je pozvana>>");
        System.out.println("Presretanje: "+jp.getSignature().getName());
        System.out.println("------------");
    }
    
    @AfterThrowing(
    pointcut = "execution(* com.it355.dao.SobaServiceImpl.addSobaSaIzuzetkom())",
    throwing = "error")
    public void logAfterThrowing(JoinPoint jp, Throwable error){
        System.out.println("<<logAfterThrowing() metoda je pozvana>>");
        System.out.println("Presretanje: "+jp.getSignature().getName());
        System.out.println("Izuzetak: "+error);
        System.out.println("------------");
    }
    
    @Around("execution(* com.it355.dao.SobaServiceImpl.addSobaAround(..))")
    public void logAround(ProceedingJoinPoint pjp) throws Throwable{
        System.out.println("<<logAround() metoda je pozvana>>");
        System.out.println("Presretanje metode: "+pjp.getSignature().getName());
        System.out.println("Presretanje: "+Arrays.toString(pjp.getArgs()));
        
        System.out.println("<<aroundBefore() metoda je pozvana>>");
        pjp.proceed();
        System.out.println("<<around() metoda je pozvana>>");
        System.out.println("------------");
        
    }
}
