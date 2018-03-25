package com.mycompany.architecture.controller;

import javax.websocket.server.PathParam; 


import com.mycompany.architecture.dao.type.City; 
import com.mycompany.architecture.services.service.CityService;
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.*; 


import java.util.List;


@ RestController 
@ RequestMapping("/City") 


public class CityController {
    @Autowired
    CityService cityService;
    
    @ RequestMapping(value = "/", method = RequestMethod.GET)
    
    public City getCityById(         
        @ RequestParam(value = "id", required = false, defaultValue = "0") Long id){ 
            return getCityById(id); 

        }
    
    
    @ RequestMapping(path = "/insertCity/city",method = RequestMethod.POST)
    
    public City insert(@RequestBody City city){
        return insert(city);
    }

    
    @ RequestMapping(path = "/updateCity/city",method = RequestMethod.PUT)

    public void update(@RequestBody City city){
        update(city);
    }


    @ RequestMapping(path="/deleteCity/deleteId" , method = RequestMethod.DELETE)

    public void deleteIdByCity( @PathVariable("deleteId") Long id ){
        deleteIdByCity(id);
    }


    @ RequestMapping(value="/", method = RequestMethod.GET)

    public List<City> getAll(){
        return getAll(); 
    }
}