package com.practice.ai.generateprompt.controller;

import org.springframework.ai.client.AiClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "api/v1", produces = {MediaType.TEXT_HTML_VALUE})
public class WebsiteController {

    private final AiClient aiClient;

    public WebsiteController(AiClient aiClient) {
        this.aiClient = aiClient;
    }

    @GetMapping("/website/{topic}")
    public String getWebsite(@PathVariable String topic) {
        return aiClient.generate("""
                Generate valid HTML5 for a %s single-page colorful website with multiple TAB.
                Make the page visually look appealing by using different colors and fonts.
                Add CSS if necessary.
                Also, provide valid copy for the individual sections.
                """.formatted(topic));
    }
}
