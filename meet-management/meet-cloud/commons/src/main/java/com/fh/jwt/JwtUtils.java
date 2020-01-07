package com.fh.jwt;

import com.alibaba.fastjson.JSON;
import com.fh.enumbean.ResponseEnum;
import com.fh.enumbean.ResponseServer;
import io.jsonwebtoken.*;
import sun.misc.BASE64Encoder;

import java.util.HashMap;
import java.util.Map;

public class JwtUtils {
    public static  String createToken(Map<String,Object> map){
        //jwt如何生成字符串
        //声明头部信息
        Map<String,Object> headerMap=new HashMap<String,Object>();
        headerMap.put("alg","HS256");
        headerMap.put("typ","JWT");
        //设置负载:不要放着涉密的东西比如:银行账号密码，余额，身份证号
        Map<String,Object> payload=new HashMap<String,Object>();
        payload.putAll(map);
        Long iat=System.currentTimeMillis();
        //设置jwt的失效时间
        payload.put("exp",iat+300000);
        payload.put("iat",iat);

        //签名值就是我们的安全密钥
        String token=Jwts.builder()
                .setHeader(headerMap)
                .setPayload(JSON.toJSONString(payload))
                .signWith(SignatureAlgorithm.HS256,getSecretKey("bank"))
                .compact();
        return token;
    }

    public static ResponseServer resolverToken(String token){
        Claims claims = null;
        try {
            claims = Jwts.parser()
                    .setSigningKey(getSecretKey("bank"))
                    .parseClaimsJws(token)
                    .getBody();

        }catch (ExpiredJwtException exp){
            System.out.println("token超时，token失效了");
            return ResponseServer.error(ResponseEnum.LOGIN_TOKEN_INVALID);
        }catch (SignatureException sing){
            System.out.println("token解析失败");
            return ResponseServer.error(ResponseEnum.LOGIN_TOKEN_INVALID);
        }
        return ResponseServer.success(claims);
    }
    private  static String getSecretKey(String key){
        return new BASE64Encoder().encode(key.getBytes());
    }

}
