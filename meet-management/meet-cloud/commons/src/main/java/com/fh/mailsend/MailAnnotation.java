package com.fh.mailsend;

import java.lang.annotation.*;

@Documented
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface MailAnnotation {
    /**
     * 收件人邮箱地址
     * @return
     */
    String mailNum() default "";

}
