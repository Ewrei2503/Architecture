package com.mycompany.architecture.controller;


import javax.websocket.server.PathParam; 


import com.mycompany.architecture.dao.type.Streets; 
import com.mycompany.architecture.services.service.StreetsService;
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.*; 


import java.util.List; 


@ RestController 
@ RequestMapping("/Streets")


public class StreetsController {
    @Autowired
    StreetsService StreetsService;
    @ RequestMapping(value = "/", method = RequestMethod.GET)
    
    public Streets getStreetsById( 
        
        @ RequestParam(value = "id", required = false,defaultValue = "0") Long id){ 

            return getStreetsById(id); 

        }
    
    
    @ RequestMapping(path = "/insertStreet/street",method = RequestMethod.POST)
    
    public Streets insert(@RequestBody Streets street){
        return insert(street);
    }

    
    @ RequestMapping(path = "/updateStreets/street",method = RequestMethod.PUT)

    public void update(@RequestBody Streets street){
        update(street);
    }


    @ RequestMapping(path="/deleteStreets/deleteId" , method = RequestMethod.DELETE)

    public void deleteIdByStreets( @PathVariable("deleteId") Long id ){
        deleteIdByStreets(id);
    }


    @ RequestMapping(value="/", method = RequestMethod.GET)

    public List<Streets> getAll(){
        return getAll(); 
    }

    }