package com.fh.mailsend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.util.StringUtils;

import javax.mail.internet.MimeMessage;

public class MailUtil {

    @Autowired
    private JavaMailSenderImpl mailSender;

    /**
     * 邮件发送 html 版本
     * @param mailNum 邮箱地址
     * @param sb
     * @throws Exception
     */
    public void sendHtmlMail(String mailNum, StringBuilder sb) throws Exception {
        if(!StringUtils.isEmpty(mailNum)){
            MimeMessage mimeMessage = mailSender.createMimeMessage();
            MimeMessageHelper mimeMessageHelper = new MimeMessageHelper(mimeMessage);
            String receiver=mailNum+"@qq.com";
            String postCount="1757663259@qq.com";//发送者账户
            mimeMessageHelper.setTo(receiver);
            mimeMessageHelper.setFrom(postCount);
            mimeMessageHelper.setSubject("meet项目 bug 提示");
            mimeMessageHelper.setText(sb.toString(), true);
            mailSender.send(mimeMessage);
            System.out.println("邮件已发送");
        }
        System.out.println("没有邮箱地址");
    }

}
