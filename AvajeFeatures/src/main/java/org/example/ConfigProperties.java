package org.example;

import io.avaje.config.Config;

public class ConfigProperties {
    public static void main(String[] args){
        System.out.println(Config.get("password"));
    }
}
