package com.practice.ai.generateprompt.dto;

import lombok.Data;

import java.util.List;

@Data
public class GenerateImageResponse {

    private List<GeneratedImage> data;

}
