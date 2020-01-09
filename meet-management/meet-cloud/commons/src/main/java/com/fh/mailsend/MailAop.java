package com.fh.mailsend;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Order(5)
@Component
public class MailAop extends MailUtil {

    @Pointcut("execution(* com.fh.controller.*.*(..))")
    public void pointCut() {
    }

    @Around("pointCut()&&@annotation(mailAnnotation)")
    public Object afterMail(ProceedingJoinPoint joinPoint, MailAnnotation mailAnnotation) {


        Object obj = null;
        try {
            obj = joinPoint.proceed();
        } catch (Throwable throwable) {
            String receiver = mailAnnotation.mailNum();//邮箱地址
            if(null != receiver && !"".equals(receiver) ){
                String methodName = joinPoint.getSignature().getDeclaringTypeName();
                String name1 = joinPoint.getSignature().getName();
                String path = methodName + "类下的" + name1 + "方法报错信息如下：";

                throwable.printStackTrace();//异常信息

                if (receiver.contains("@")) {
                    receiver = receiver.substring(0, receiver.indexOf("@"));
                }

                StringBuilder sb = new StringBuilder();
                sb.append("<html><head></head>");
                sb.append("<body><h1>" + path + "</h1>");
                sb.append("" + throwable.toString() + "</body>");
                sb.append("</html>");
                if (null != receiver && !"".equals(receiver)) {
                    try {
                        super.sendHtmlMail(receiver, sb);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        return obj;
    }
    public static void main(String[] args) {
        String mail = "1757663259@qq.com";
        mail = mail.substring(0, mail.indexOf("@"));
        System.out.println(mail);
    }
}
