package com.volkswagen;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;


@Aspect
@Component
public class Security {

    @Pointcut("execution(* com.volkswagen.Bank.makePayment(..))")
    public void makePayment(){}

    @Before("makePayment()")
    public void checkUser(){
        System.out.println("User is Valid..");
    }

    @After("makePayment()")
    public void checkBalance(){
        System.out.println("remaining balance is:12000");
    }

    @AfterReturning("makePayment()")
    public void checkStatus(){
        System.out.println("Transaction Successfull...");
    }

    @AfterThrowing("makePayment()")
    public void checkTrx(){
        System.out.println("Transaction Failed...");
    }

  //  @Around("execution(* com.volkswagen.Bank.makePayment(..))")
    @Around("makePayment()")
    public void checkPayment(ProceedingJoinPoint jp){
        try {
            System.out.println("User verified");
            jp.proceed();
            System.out.println("Payment SuccessFull...");
            System.out.println("remaining balance is:12000");
        }catch (Throwable e){
            System.out.println("Payment Failed...");
        }

    }
}
