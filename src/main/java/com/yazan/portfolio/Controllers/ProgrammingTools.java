package com.yazan.portfolio.Controllers;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProgrammingTools {

    @GetMapping("/yazan/languagesAndTools")
    public ResponseEntity<String> getProjects()  {

        JSONArray tools = new JSONArray();
        JSONObject obj = new JSONObject();


        JSONObject java=new JSONObject();
        java.put("name","Java");
        java.put("imageSource","hh");
        tools.add(java);

        JSONObject javaScript=new JSONObject();
        javaScript.put("name","JavaScript");
        javaScript.put("imageSource","hh");
        tools.add(javaScript);

        JSONObject html=new JSONObject();
        html.put("name","Html");
        html.put("imageSource","hh");
        tools.add(html);


        JSONObject css=new JSONObject();
        css.put("name","CSS");
        css.put("imageSource","hh");
        tools.add(css);

        JSONObject jquery=new JSONObject();
        jquery.put("name","Jquery");
        jquery.put("imageSource","hh");
        tools.add(jquery);

        JSONObject git =new JSONObject();
        git.put("name","Git");
        git.put("imageSource","hh");
        tools.add(git);


        JSONObject bash=new JSONObject();
        bash.put("name","Bash");
        bash.put("imageSource","hh");
        tools.add(bash);

        JSONObject mongodb=new JSONObject();
        mongodb.put("name","MongoDB");
        mongodb.put("imageSource","hh");
        tools.add(mongodb);

        JSONObject postgress=new JSONObject();
        postgress.put("name","PostGress");
        postgress.put("imageSource","hh");
        tools.add(postgress);

        JSONObject dynmoDb=new JSONObject();
        dynmoDb.put("name","DynmoDB");
        dynmoDb.put("imageSource","hh");
        tools.add(dynmoDb);

        JSONObject reactjs=new JSONObject();
        reactjs.put("name","ReactJs");
        reactjs.put("imageSource","hh");
        tools.add(reactjs);

        JSONObject nodejs=new JSONObject();
        nodejs.put("name","NodeJs");
        nodejs.put("imageSource","hh");
        tools.add(nodejs);

        JSONObject springboot=new JSONObject();
        springboot.put("name","SpringBoot");
        springboot.put("imageSource","hh");
        tools.add(springboot);

        JSONObject android=new JSONObject();
        android.put("name","Android");
        android.put("imageSource","hh");
        tools.add(android);

        JSONObject python=new JSONObject();
        python.put("name","Python");
        python.put("imageSource","hh");
        tools.add(python);

        JSONObject bootStrab=new JSONObject();
        bootStrab.put("name","BootStrab");
        bootStrab.put("imageSource","hh");
        tools.add(bootStrab);

        JSONObject graphQl=new JSONObject();
        graphQl.put("name","GraphQl");
        graphQl.put("imageSource","hh");
        tools.add(graphQl);

        JSONObject googleCloud=new JSONObject();
        googleCloud.put("name","GoogleCloud");
        googleCloud.put("imageSource","hh");
        tools.add(googleCloud);

        JSONObject amazonWebServices=new JSONObject();
        amazonWebServices.put("name","AmazonWebServices");
        amazonWebServices.put("imageSource","hh");
        tools.add(amazonWebServices);

        return new ResponseEntity<>( tools.toString(), HttpStatus.OK);
    }
}
