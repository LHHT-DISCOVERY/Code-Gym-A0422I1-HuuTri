package com.example.borrow_book.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Aspect
@Component
public class BookServiceAspect {
    private Logger logger = Logger.getLogger(BookServiceAspect.class.getName());

    @Pointcut("execution(* com.example.borrow_book.service.imp.BookService.*(..))")
    public void bookService() {
    }

    ;

    @Before("bookService()")
    public void getLog(JoinPoint joinPoint) throws Throwable {
        String methodName = joinPoint.getSignature().getName();
        logger.info("Before Call : " + methodName);
    }
}
