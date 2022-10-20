package com.example.jsoncreator.json.service;


import com.example.jsoncreator.json.payload.request.ClassNameRequestDto;

public interface JsonCreatorService {
    StringBuilder create(ClassNameRequestDto requestDto);
}
