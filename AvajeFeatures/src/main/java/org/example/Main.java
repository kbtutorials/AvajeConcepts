package org.example;

import io.avaje.config.Config;

import java.util.List;

public class Main {
    public static void main(String[] args) {
          String userName =  Config.get("username");
          String password = Config.get("password","123");
          Boolean role = Config.getBool("role");
          Integer timeOff = Config.getInt("timeoff");
         String path = Config.get("path");
         List<String> myLists = Config.list().of("myList");

        System.out.println(userName+"***"+password+"***"
                +role+"***"+timeOff+"***"+myLists+"***"+path);


         Config.setProperty("username","user34");
        userName =  Config.get("username");
        Config.eventBuilder("updatingValues")
                        .put("password","password").put("timeoff","2000").publish();

        timeOff = Config.getInt("timeoff");
        password = Config.get("password");
        System.out.println(userName+"****"+password+"***"+timeOff);
    }
}