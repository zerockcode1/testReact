package org.zerock.testreact.service;

import org.zerock.testreact.dto.PerformanceDTO;
import org.zerock.testreact.dto.PicturesDTO;
import org.zerock.testreact.entity.Performance;
import org.zerock.testreact.entity.Pictures;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public interface PerformanceService {

    Long register(PerformanceDTO performanceDTO);


    default Performance dtoToEntity(PerformanceDTO dto){


        Performance entity = Performance.builder()
                .pno(dto.getPno())
                .title(dto.getTitle())
                .content(dto.getContent())
                .build();

        return entity;
    }

    default Pictures dtoToEntityPictures(PicturesDTO dto){

        Pictures picture = Pictures.builder()
                .pnum(dto.getPnum())
                .fname(dto.getFname())
                .uuid(dto.getUuid())
                .first(dto.isFirst())
                .build();
        return picture;
    }

}
