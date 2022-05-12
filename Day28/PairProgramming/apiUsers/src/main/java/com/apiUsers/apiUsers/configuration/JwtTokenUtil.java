package com.apiUsers.apiUsers.configuration;


import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;


import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.Date;
import java.util.Map;

@Component
public class JwtTokenUtil implements Serializable {

    private final String secret = "uqiauto";

   /* @Value(${atributo})
    private String valor
*/
    private String generateToken(Map<String, Object> claims){
        Date expirationDate = new Date(System.currentTimeMillis()+ 604800L * 1000);
        return Jwts.builder().setClaims(claims).setExpiration(expirationDate).signWith(SignatureAlgorithm.HS512,secret).compact();
    }
}
