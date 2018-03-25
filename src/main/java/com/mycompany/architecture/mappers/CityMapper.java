package com.mycompany.architecture.mappers;

import com.mycompany.architecture.dao.type.City;
import java.util.List;


public interface CityMapper {

    
public City getCityById(Long id); 


public void update(City city);


public void insert(City city);


public void deleteIdByCity(Long id); 


public List<City> getAll();

}
