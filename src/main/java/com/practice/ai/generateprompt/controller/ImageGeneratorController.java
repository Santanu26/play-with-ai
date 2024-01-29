package com.practice.ai.generateprompt.controller;

import com.practice.ai.generateprompt.dto.GenerateImageRequest;
import com.practice.ai.generateprompt.dto.GenerateImageResponse;
import com.practice.ai.generateprompt.service.ImageGeneratorService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
@RequiredArgsConstructor
public class ImageGeneratorController {

    private final ImageGeneratorService imageGeneratorService;

    @PostMapping("generate")
    public ResponseEntity<GenerateImageResponse> generateImage(
            @RequestBody final GenerateImageRequest request) {

        return ResponseEntity.ok(imageGeneratorService.generateImage(request));

    }
}
