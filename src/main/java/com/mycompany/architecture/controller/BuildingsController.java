package com.mycompany.architecture.controller;


import javax.websocket.server.PathParam; 


import com.mycompany.architecture.dao.type.Buildings; 
import com.mycompany.architecture.services.service.BuildingsService;
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.*; 


import java.util.List; 

@ RestController 
@ RequestMapping("/Buildings") 


public class BuildingsController {
    
    @Autowired
    BuildingsService buildingsService;
    
    @ RequestMapping(value = "/", method = RequestMethod.GET)
    
    public Buildings getBuildingsById(        
        @ RequestParam(value = "id", required = false,defaultValue = "0") Long id){ 
            return getBuildingsById(id); 
            
        }
    
    
    @ RequestMapping(path = "/insertBuildings/build",method = RequestMethod.POST)
    
    public Buildings insert(@RequestBody Buildings build){
        return insert(build);
    }

    
    @ RequestMapping(path = "/updateBuildings/build",method = RequestMethod.PUT)

    public void update(@RequestBody Buildings build){
        update(build);
    }


    @ RequestMapping(path="/deleteBuildings/deleteId" , method = RequestMethod.DELETE)

    public void deleteIdByBuildings( @PathVariable("deleteId") Long id ){
        deleteIdByBuildings(id);
    }


    @ RequestMapping(value="/", method = RequestMethod.GET)

    public List<Buildings> getAll(){
        return getAll(); 
    }

}