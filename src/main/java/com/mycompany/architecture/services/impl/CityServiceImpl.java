package com.mycompany.architecture.services.impl;

import com.mycompany.architecture.dao.type.City;
import com.mycompany.architecture.mappers.CityMapper;
import com.mycompany.architecture.services.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;


@Service
@Transactional
public class CityServiceImpl implements CityService{

    @Autowired
    CityMapper CityMapper;
    
    @Override
    public City getCityById(Long id) {
        return CityMapper.getCityById(id);
    }
    
    @Override 
    public void insert(City city) {  
    } 

    @Override 
    public void update(City city) { 
        try{ 
            CityMapper.update(city); 
        } 
        catch(Exception exception){ 
            System.out.println("error : " + exception); 
        } 
    } 

    @Override 
    public void deleteIdByCity(Long id) { 
        try{ 
            CityMapper.deleteIdByCity(id); 
        } 
        catch(Exception exception){ 
            System.out.println("error : " + exception); 
        } 
    } 

    @Override 
    public List<City> getAll() { 
        return CityMapper.getAll(); 
    } 

}
