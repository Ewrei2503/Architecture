package com.mycompany.architecture.services.impl;


import com.mycompany.architecture.dao.type.Buildings;
import com.mycompany.architecture.mappers.BuildingsMapper;
import com.mycompany.architecture.services.service.BuildingsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;


@Service
@Transactional
public class BuildingsServiceImpl implements BuildingsService{

    @Autowired
    BuildingsMapper BuildingsMapper;
    
    @Override
    public Buildings getBuildingsById(Long id) {
        return BuildingsMapper.getBuildingsById(id);
    }
    
    @Override 
    public void insert(Buildings build) { 
    } 

    @Override 
    public void update(Buildings build) { 
        try{ 
            BuildingsMapper.update(build); 
        } 
        catch(Exception exception){ 
        System.out.println("error : " + exception); 
        } 
    } 

    @Override 
    public void deleteIdByBuildings(Long id) { 
    try{ 
        BuildingsMapper.deleteIdByBuildings(id); 
    } 
    catch(Exception exception){ 
        System.out.println("error : " + exception); 
    } 
} 

    @Override 
    public List<Buildings> getAll() { 
        return BuildingsMapper.getAll(); 
    } 

}