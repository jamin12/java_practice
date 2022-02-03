package com.example.firstproject.common;

import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;

import com.example.firstproject.dto.FileDto;

import org.springframework.stereotype.Component;
import org.springframework.util.ObjectUtils;
import org.springframework.web.multipart.MultipartHttpServletRequest;

@Component
public class FileUtils {
    public List<FileDto> parseFileInfo(Long artivleId, MultipartHttpServletRequest multipartHttpServletRequest){
        if(ObjectUtils.isEmpty(multipartHttpServletRequest)){
            return null;
        }
        List<FileDto> files = new ArrayList<>();
        String path = ""
    }
}
