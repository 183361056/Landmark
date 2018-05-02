package com.ga.landmark.mapper;

import com.ga.landmark.model.Housetype;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Mapper

@Component(value="housetypeMapper")

public interface HousetypeMapper {

    int insert(Housetype record);
}