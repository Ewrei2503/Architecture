package com.mycompany.architecture.mappers;

import com.mycompany.architecture.dao.type.Buildings;
import java.util.List;

public interface BuildingsMapper {

    
public Buildings getBuildingsById(Long id); 


public void update(Buildings build); 


public void deleteIdByBuildings(Long id); 


public List<Buildings> getAll();

}
