package com.example.restblog.Response;

import com.example.restblog.Model.Post;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
@AllArgsConstructor
public class SearchPostResponse {

    private String message;
    private LocalDateTime timeStamp;
    private List<Post> posts;
}
