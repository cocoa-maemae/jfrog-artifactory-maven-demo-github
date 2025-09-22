package com.example;

import org.apache.commons.lang3.StringUtils;
//import com.fasterxml.jackson.core.JsonProcessingException;
//import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.Map;

public class HelloService {

    public String greet(String name) {

        if (StringUtils.isBlank(name)) {
            return "Hello";
        }

        String message = "Hello, " + name + "!";
        return message;
    }
}



