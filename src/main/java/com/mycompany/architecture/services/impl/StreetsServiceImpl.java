package com.mycompany.architecture.services.impl;

import com.mycompany.architecture.dao.type.Streets;
import com.mycompany.architecture.mappers.StreetsMapper;
import com.mycompany.architecture.services.service.StreetsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;


@Service
@Transactional
public class StreetsServiceImpl implements StreetsService
{

    @Autowired
    StreetsMapper StreetsMapper;
    
    @Override
    public Streets getStreetsById(Long id) {
        return StreetsMapper.getStreetsById(id);
    }

    @Override 
    public void insert(Streets street) {  
    } 

    @Override 
    public void update(Streets street) { 
        try{ 
            StreetsMapper.update(street); 
        } 
        catch(Exception exception){ 
            System.out.println("error : " + exception); 
        } 
    } 

    @Override 
    public void deleteIdByStreets(Long id) { 
        try{ 
            StreetsMapper.deleteIdByStreets(id); 
        } 
        catch(Exception exception){ 
            System.out.println("error : " + exception); 
        } 
    } 

    @Override 
    public List<Streets> getAll() { 
        return StreetsMapper.getAll(); 
    } 
    
}