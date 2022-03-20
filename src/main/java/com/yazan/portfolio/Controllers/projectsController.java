package com.yazan.portfolio.Controllers;






import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class projectsController {

    @GetMapping("/yazan/projects")
    public ResponseEntity<String> getProjects()  {

        JSONArray jsonArray = new JSONArray();
        JSONObject obj = new JSONObject();


        JSONObject petServiceCenter=new JSONObject();
        petServiceCenter.put("name","Pet-service-center");
        petServiceCenter.put("liveUrl","https://pet-service-center.github.io/pets-care-center/");
        petServiceCenter.put("description","It’s a project about helping the pets that live around us.");
        petServiceCenter.put("imageSource","hh");
        jsonArray.add(petServiceCenter);

        JSONObject cookieStand=new JSONObject();
        cookieStand.put("name","Cookie-Stand");
        cookieStand.put("liveUrl","https://yazanabdulhafez.github.io/cookie-stand/");
        cookieStand.put("description","This project is type of branding of new Cookie stands.");
        cookieStand.put("imageSource","hh");
        jsonArray.add(cookieStand);

        JSONObject busMall=new JSONObject();
        busMall.put("name","Bus-Mall");
        busMall.put("liveUrl","https://yazanabdulhafez.github.io/bus-mall/");
        busMall.put("description","Its online catalog wants to feature only the items in its catalog that are the most likely to sell.");
        busMall.put("imageSource","hh");
        jsonArray.add(busMall);


        JSONObject cityExplorer=new JSONObject();
        cityExplorer.put("name","City-Explorer");
        cityExplorer.put("liveUrl","https://suspicious-brahmagupta-dd99c3.netlify.app /");
        cityExplorer.put("description","This project is aimed to discover cities and know the different locations in it.");
        cityExplorer.put("imageSource","hh");
        jsonArray.add(cityExplorer);

        JSONObject hornedBeasts=new JSONObject();
        hornedBeasts.put("name","Horned-Beasts");
        hornedBeasts.put("liveUrl","https://blissful-allen-bd06f2.netlify.app/");
        hornedBeasts.put("description"," This project is aimed to show the beast pictures and vote for them.");
        hornedBeasts.put("imageSource","hh");
        jsonArray.add(hornedBeasts);

        JSONObject canOfBooks =new JSONObject();
        canOfBooks.put("name","Can-Of-Books ");
        canOfBooks.put("liveUrl","https://trusting-colden-84ef43.netlify.app/");
        canOfBooks.put("description","It’s a project about a personal library where you manage your favorite books.");
        canOfBooks.put("imageSource","hh");
        jsonArray.add(canOfBooks);


        JSONObject NutriTec=new JSONObject();
        NutriTec.put("name","NutriTec");
        NutriTec.put("liveUrl","https://nutrirec.netlify.app/");
        NutriTec.put("description"," This is the project of 301 level it’s a food blog site.");
        NutriTec.put("imageSource","hh");
        jsonArray.add(NutriTec);

        JSONObject donationEqualLife=new JSONObject();
        donationEqualLife.put("name","Donation=Life");
        donationEqualLife.put("liveUrl","https://donationequallife.herokuapp.com/#whatwedo2/");
        donationEqualLife.put("description"," This is the project of 401 level It is a web application to match between the donors and the charity institutions to help the poor people.");
        donationEqualLife.put("imageSource","hh");
        jsonArray.add(donationEqualLife);




        return new ResponseEntity<>( jsonArray.toString(), HttpStatus.OK);
    }
}
