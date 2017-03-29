/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hmack101.jwtutils;

import com.auth0.jwt.algorithms.Algorithm;
//import com.auth0.jwt.algorithms.RSAAlgorithm;
import java.security.interfaces.RSAKey;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;



/**
 *
 * @author HMack101
 */
public class AlgorithmUtils {
    
    Algorithm algorithm = null;
    
    Algorithm getAlgorithm() {
        return this.algorithm;
    }
    
    RSAKey createRSAKey (RSAPublicKey publicKey, RSAPrivateKey privateKey) {
        
        
        
    }
    
    Algorithm createRSA256Algorithm(RSAKey key) { 
        this.algorithm = Algorithm.RSA256(key);
        return this.algorithm;
    }
    
    Algorithm createRSA384Algorithm(RSAKey key) { 
        this.algorithm = Algorithm.RSA384(key);
        return this.algorithm;
    }
    
    Algorithm createRSA512Algorithm(RSAKey key) { 
        this.algorithm = Algorithm.RSA512(key);
        return this.algorithm;
    }
    
}
