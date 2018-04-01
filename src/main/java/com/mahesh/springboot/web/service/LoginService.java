package com.mahesh.springboot.web.service;


import org.springframework.stereotype.Component;

@Component
public class LoginService {

    public boolean validateUser(String userid, String password) {
        // in28minutes, dummy
        return userid.equalsIgnoreCase("mahesh")
                && password.equalsIgnoreCase("dummy");
    }

}
