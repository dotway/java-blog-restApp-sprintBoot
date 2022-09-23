package com.example.restblog.Service;


import com.example.restblog.DTO.*;
import com.example.restblog.Model.Post;
import com.example.restblog.Response.*;

public interface UserService {

    RegisterResponse register(UserDto userDto);

    LoginResponse login(LoginDto loginDto);

    CreatePostResponse createPost(PostDto postDto);

    CommentResponse comment(int user_id , int post_id , CommentDto commentDto);

    LikeResponse like(int user_id , int post_id , LikeDto likeDto);

    SearchCommentResponse searchComment(String keyword);


    SearchPostResponse searchPost(String keyword);

    Post findPostById(int id);

}
