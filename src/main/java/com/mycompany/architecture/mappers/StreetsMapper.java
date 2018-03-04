package com.mycompany.architecture.mappers;

import com.mycompany.architecture.dao.type.Streets;
import java.util.List;

public interface StreetsMapper {
    public Streets getStreetsById(Long id); 


public void update(Streets street); 


public void deleteIdByStreets(Long id); 


public List<Streets> getAll();
}
