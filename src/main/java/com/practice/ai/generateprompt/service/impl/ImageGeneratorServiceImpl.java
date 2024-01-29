package com.practice.ai.generateprompt.service.impl;

import com.practice.ai.generateprompt.client.ImageGeneratorClient;
import com.practice.ai.generateprompt.dto.GenerateImageRequest;
import com.practice.ai.generateprompt.dto.GenerateImageResponse;
import com.practice.ai.generateprompt.service.ImageGeneratorService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ImageGeneratorServiceImpl implements ImageGeneratorService {

    private final ImageGeneratorClient imageGeneratorClient;

    public GenerateImageResponse generateImage(final GenerateImageRequest request) {
        final GenerateImageResponse response = imageGeneratorClient.generateImage(request);
        // if necessary, the response can be further processed here

        return response;
    }

}
