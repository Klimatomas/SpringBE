package com.klima.tomas;

import com.google.gson.Gson;
import net.minidev.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {

    private final EmployeeRepository repository;

    public HomeController(EmployeeRepository repository) {
        this.repository = repository;
    }

    @RequestMapping(method = RequestMethod.POST, value = "/newemployee")
    public String addEmployee(@RequestBody String request){

        JSONObject jsonObject = new Gson().fromJson(request, JSONObject.class);
        this.repository.save(new Employee(jsonObject.get("firstName").toString(),
            jsonObject.get("surname").toString(),
            jsonObject.get("description").toString()));

        return ("index");
    }

}