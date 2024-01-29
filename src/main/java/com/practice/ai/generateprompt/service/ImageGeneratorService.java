package com.practice.ai.generateprompt.service;

import com.practice.ai.generateprompt.dto.GenerateImageRequest;
import com.practice.ai.generateprompt.dto.GenerateImageResponse;

public interface ImageGeneratorService {

    GenerateImageResponse generateImage(GenerateImageRequest generateImageRequest);

}
