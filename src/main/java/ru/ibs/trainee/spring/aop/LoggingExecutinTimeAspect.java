package ru.ibs.trainee.spring.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@EnableAspectJAutoProxy
@Aspect
@Component
public class LoggingExecutinTimeAspect {

    @Pointcut("execution(public * ru.ibs.trainee.spring.aop.BusinessLogic+.*())")
    public void callAtBusinessMethods() {}

    @Pointcut("@annotation(ru.ibs.trainee.spring.aop.LogExecutionTime)")
    public void callAtAnnotatedMethods() {}

//    @Around("callAtBusinessMethods()")
    @Around("callAtAnnotatedMethods()")
    public Object measureTime(ProceedingJoinPoint pjp) throws Throwable {
        long start = System.currentTimeMillis();
        try {
            return pjp.proceed();
        } finally {
            long end = System.currentTimeMillis();
            System.out.println("took time " + (end -start) + " ms");
        }
    }

}
