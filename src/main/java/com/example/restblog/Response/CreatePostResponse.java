package com.example.restblog.Response;

import com.example.restblog.Model.Post;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
public class CreatePostResponse {

    private String message;
    private LocalDateTime timeStamp;
    private Post post;
}
