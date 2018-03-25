package com.mycompany.architecture.services.service;
import com.mycompany.architecture.dao.type.Streets;
import java.util.List;


public interface StreetsService {
    public Streets getStreetsById(Long id);
    public void insert(Streets street);
    public void update(Streets street);
    public void deleteIdByStreets(Long id);
    public List<Streets> getAll();
}