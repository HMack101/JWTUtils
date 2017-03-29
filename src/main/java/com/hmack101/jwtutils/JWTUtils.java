/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hmack101.jwtutils;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.DecodedJWT;
import java.io.UnsupportedEncodingException;

/**
 *
 * @author HMack101
 */
public class JWTUtils {
    
    private String secretkey = "";
    private String issuer = "";
    
    public void CreateJWTToken() throws IllegalArgumentException, UnsupportedEncodingException {
        Algorithm algorithm = Algorithm.HMAC256(secretkey);
        String token = JWT.create().withIssuer(issuer).sign(algorithm);        
    }
    
    public void CreateJWTToken (Algorithm algorithm) {
        String token = JWT.create().withIssuer(issuer).sign(algorithm);
    }
    
    public void verifyJWTToken (String token, Algorithm algorithm, String issuer) {
        JWTVerifier verifier = JWT.require(algorithm).withIssuer(issuer).build();
        DecodedJWT jwt = verifier.verify(token);
    }
    
    
}
