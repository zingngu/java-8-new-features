package com.zingsrepo.learning;

import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;

public class Base64Demo {
    public static void main(String[] args) {
        String str = "Hello, World!";
        Encoder encoder = Base64.getEncoder();
        Decoder decoder = Base64.getDecoder();
        String encodedStr = encoder.encodeToString(str.getBytes(StandardCharsets.UTF_8));
        System.out.println(encodedStr);
        System.out.print(new String(decoder.decode(encodedStr), StandardCharsets.UTF_8));
    }
}
