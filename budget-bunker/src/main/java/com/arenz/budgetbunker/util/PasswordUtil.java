package com.arenz.budgetbunker.util;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PasswordUtil {
    private static final PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();


    public String hashPasword(String password){
        return passwordEncoder.encode(password);
    }

    public static boolean matchPassword(String password, String hashedPassword){
        return passwordEncoder.matches(password, hashedPassword);
    }
}
