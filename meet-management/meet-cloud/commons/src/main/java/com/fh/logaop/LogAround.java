package com.fh.logaop;

import com.fh.beans.LogBean;
import com.fh.utils.UtilsTools;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;

@Aspect
@Component
@Order(8)
public class LogAround {

    //获取参数为解决
    @Around(value = "execution(* com.fh.controller.*.*(..))&&@annotation(logAnnotation)")
    public Object aroundMethod(ProceedingJoinPoint joinPoint, LogAnnotation logAnnotation) {

        LogBean logBean =LogBean.gerLogBean();

        //获取方法描述
        String describe = logAnnotation.Describe();
        logBean.setInfo(describe);

        //获取类的全路径
        String className = joinPoint.getTarget().getClass().getName();
        String name = joinPoint.getSignature().getName();
        System.out.println(name);
        logBean.setMethodName(className + "-" +name );

        HttpServletRequest request = UtilsTools.getRequest();
        String ip = request.getRemoteAddr();//返回发出请求的IP地址
        logBean.setTheIp(ip);

        //logBean.setParameter(args.toString());

        Object obj = null;
        try {
            logBean.setLogintime(new Date());
            long start = System.currentTimeMillis();
            obj = joinPoint.proceed();
            long end = System.currentTimeMillis();
            logBean.setTime((int) (end - start));
        } catch (Throwable throwable) {
            throwable.printStackTrace();
            logBean.setStatus(2);
        }
        logBean.setStatus(1);

        return obj;
    }
}
