package com.mycompany.architecture.services.service;


import com.mycompany.architecture.dao.type.Buildings;
import java.util.List;


public interface BuildingsService {
    public Buildings getBuildingsById(Long id);
    public List<Buildings> getAll();
    public void insert(Buildings build);
    public void update(Buildings build);
    public void deleteIdByBuildings(Long id);
}