package pl.radzik.michal.bazynosql.utils;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Service;

@Service
@Aspect
public class Counter {


    @Around(value = "execution(org.springframework.http.ResponseEntity pl.radzik.michal.bazynosql.controller.PersonController.read(..))")
    private void readTime(ProceedingJoinPoint joinPoint) throws Throwable {
        final long start = System.currentTimeMillis();
        joinPoint.proceed();
        final long stop = System.currentTimeMillis();
        final long result = stop - start;

        System.out.println("result of method " + joinPoint.getSignature().getName() + " is  = " + result + " ms");
    }

    @Around(value = "execution(org.springframework.http.ResponseEntity pl.radzik.michal.bazynosql.controller.PersonController.record(..))")
    private void recordTime(ProceedingJoinPoint joinPoint) throws Throwable {
        final long start = System.currentTimeMillis();
        joinPoint.proceed();
        final long stop = System.currentTimeMillis();
        final long result = stop - start;

        System.out.println("result of method " + joinPoint.getSignature().getName() + " is  = " + result + " ms");
    }
}