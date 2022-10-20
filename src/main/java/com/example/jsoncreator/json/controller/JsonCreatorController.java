package com.example.jsoncreator.json.controller;

import com.example.jsoncreator.json.payload.request.ClassNameRequestDto;
import com.example.jsoncreator.json.service.JsonCreatorService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/json-create")
public class JsonCreatorController {
    private final JsonCreatorService service;

    public JsonCreatorController(JsonCreatorService service) {
        this.service = service;
    }

    @PostMapping
    public String createJson(@Valid @RequestBody ClassNameRequestDto requestDto) {
        StringBuilder stringBuilder = service.create(requestDto);
        return stringBuilder.toString();
    }
}
