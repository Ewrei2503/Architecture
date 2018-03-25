package com.mycompany.architecture.services.service;


import com.mycompany.architecture.dao.type.City;
import java.util.List;


public interface CityService {
    public City getCityById(Long id);
    public void insert(City city);
    public void update(City city);
    public void deleteIdByCity(Long id);
    public List<City> getAll();
}
