package com.ga.landmark.service;

import com.ga.landmark.mapper.HousetypeMapper;
import com.ga.landmark.model.Housetype;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "housetypeService")
public class HousetypeService {

    @Autowired
    private HousetypeMapper housetypeMapper;


    public void  insert(Housetype housetype)
    {
        housetypeMapper.insert(housetype);
    }


}
