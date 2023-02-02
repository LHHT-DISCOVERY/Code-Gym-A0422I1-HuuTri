package com.example.demo.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;
//Class này viết theo AOP(Aspect Oriented Programming) lập trình hướng khía cạnh.
// class này dùng để thêm các xử lí phụ vào các xử lí chính như ghi log....
/*Trước(sau) khi thực hiện 1 function thì máy sẽ tự động chèn các xử lí phụ có trong class này vào
trước(sau) các function đó và chạy chương trình bình thường.*/
@Aspect
@Component
public class LoggingAspect {
    private Logger logger = Logger.getLogger(LoggingAspect.class.getName());
    // JoinPoint như 1 cái menu đồ ăn
    // Pointcut là những đồ ăn mà bạn muốn dọn lên bàn
    @Pointcut("execution(* com.example.demo.service.impl.QuestionService.*(..))")
    public void questionService(){};
    // Thêm vào trước khi gọi đến phương thức
    @Before("questionService()")
    public void getLog(JoinPoint joinPoint){
        String methodName=joinPoint.getSignature().getName();
        logger.info("Before: Call" + methodName);
    }

    // advice là phương thức getLogAfter, loại advice là After Advice
    // join point là phương thức getList() trong class BookServiceImpl
    // point cut là phương thức getList() trong class BookServiceImpl
    @After("execution(* com.example.demo.service.impl.QuestionService.count())")
    public void getLogAfter(JoinPoint joinPoint) throws Throwable {
        String methodName = joinPoint.getSignature().getName();
        logger.info("After: End call " + methodName);
    } //weave

    // advice chính là phương thức getLogAround(), loại advice là Around Advice
    // point cut refer method bookservice => "execution(* codegym.vn.demo.service.BookService.*(..))"
    // từ cái execution trên => join point là các phương thức trong class BookServiceImpl => có 7 join point
    // point cut cách để xác định 7 join point
    //Thêm xử lí phụ vào trước và sau phương thức
    @Around("questionService()")
    public Object getLogAround(ProceedingJoinPoint joinPoint) throws Throwable {
        String methodName = joinPoint.getSignature().getName();
        logger.info("Around: Begin call " + methodName);
        Object result = joinPoint.proceed(); //getList()
        logger.info("Around: End call " + methodName);
        return result;
    }

    @AfterReturning("execution(* com.example.demo.service.impl.QuestionService.fi*(..))")
    public void getLogAfterRunning(JoinPoint joinPoint) throws Throwable {
        String methodName = joinPoint.getSignature().getName();
        logger.info("After returning: End call " + methodName);
    }
}
