package org.forest.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;

import java.util.Arrays;

@Aspect
public class LogAspects {

    @Pointcut("execution(public int org.forest.aop.MathCalculator.*(..))")
    public void pointCut() {}
    @Before("pointCut()")
    public void logStart(JoinPoint joinPoint) {
        Object[] args = joinPoint.getArgs();
        System.out.println("" + joinPoint.getSignature().getName() + " starts ...the parameter list is: {" + Arrays.asList(args)  + "}");
    }

    @After(value = "pointCut()")
    public void logEnd(JoinPoint joinPoint) {
        System.out.println("" + joinPoint.getSignature().getName() + " ends ... ");
    }

    //@AfterReturning("public int org.forest.aop.MathCalculator.*(..)")
    @AfterReturning(value = "org.forest.aop.LogAspects.pointCut()", returning = "result")
    public void logReturn(JoinPoint joinPoint, Object result) {
        System.out.println("" + joinPoint.getSignature().getName() + " returns... The results: {" + result +"}");
    }

    @AfterThrowing(value = "pointCut()", throwing = "e")
    public void logException(JoinPoint joinPoint, Exception e) {
        System.out.println("" + joinPoint.getSignature().getName() + " exception... The message: {" +  e.getMessage() +"}");
    }
}
