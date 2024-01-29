package com.practice.ai.generateprompt.client;

import com.practice.ai.generateprompt.config.ImageGeneratorConfig;
import com.practice.ai.generateprompt.dto.GenerateImageRequest;
import com.practice.ai.generateprompt.dto.GenerateImageResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "imageGenerator", url = "${spring.ai.openai.image-generator.url}", configuration = ImageGeneratorConfig.class)
public interface ImageGeneratorClient {

    @PostMapping(value = "/api/v1/images/generation")
    GenerateImageResponse generateImage(@RequestBody final GenerateImageRequest request);

}
