package codegym.vn.springboot.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ControllerAdvice;

import java.util.logging.Logger;

@Aspect
@Component
public class LoggingAspect {
    private Logger logger = Logger.getLogger(LoggingAspect.class.getName());

    // cách 1: định nghĩa method point cut sau đó khai báo advice với method đó
    // định nghĩa một cái method pointcut sau đó dùng advice để khai báo advice với method đó
    // bỏ ở service (Hoặc repository cx đc ) . có .. nghĩa là tất cả những cái method
    // trong StudentServiceImpl sew theo phương thức này
    @Pointcut("execution(* codegym.vn.springboot.service.StudentServiceImpl.fi*(..))")
    public void allStudentService(){}

    // khai báo before nghĩa là trc khi chạy cái đó thì nó sẽ làm
    // sẽ gọi method trên là allStudentService()
    @Before("allStudentService()")
    // tạo method mới và để Join point vào
    // lấy metode chuẩn bị gọi nó ra thông qua joint point bằng string
    // sẽ trả về đúng method mà joint sẽ gọi
    public void writeLogStudentService(JoinPoint point) throws Throwable {
        String methodName = point.getSignature().getName();
        // ghi log ra
        // gọi method name ở trên
        logger.info("Before: call " + methodName + " |writeLogStudentService");
    }
}
