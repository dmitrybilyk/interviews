package com.learn.SecurityRandom;

import org.apache.commons.codec.binary.StringUtils;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Base64;

/**
 * Created by dmitry on 03.05.18.
 */
public class Main {

    public static void main(String[] args) throws NoSuchAlgorithmException {
        String value = "yngCjO0l8mKADhEmMEbSDg%3D%3D";
        String value2 = "yngCjO0l8mKADhEmMEbSDg==";
        System.out.println(Arrays.equals(value.getBytes(), value2.getBytes()));
//        SecureRandom random=new SecureRandom();
//        byte[] value = new byte[16];
//        random.nextBytes(value);
//        String token=new String(Base64.getUrlDecoder().decode("yngCjO0l8mKADhEmMEbSDg%3D%3D".getBytes()));
//        System.out.println(token);

//        String token = "yngCjO0l8mKADhEmMEbSDg%3D%3D";
//        byte[] value = token.getBytes(StandardCharsets.UTF_8);
////        SecureRandom random=new SecureRandom();
////        byte[] value = new byte[16];
////        random.nextBytes(value);
//        String decodedValue =new String(value);
//        byte[] s = Base64.getUrlDecoder().decode(decodedValue);
//        System.out.println(s);
    }

    private  static String generateAuthenticationToken() {
        SecureRandom random=new SecureRandom();
        byte[] value = new byte[16];
        random.nextBytes(value);
        return new String(Base64.getUrlEncoder().encode(value));
    }

    public static String decode(String s) {
        return Base64.getUrlDecoder().decode(s).toString();
    }
//    public String encode(String s) {
//        return Base64.encodeBase64String(StringUtils.getBytesUtf8(s));
//    }
}
