package org.technischools.technibook.posts;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.technischools.technibook.posts.api.CreatePostRequest;
import org.technischools.technibook.posts.api.GetPostResponse;

import java.util.List;
@RequiredArgsConstructor
@RestController
@RequestMapping("/api/posts")
public class PostController {
    private final PostService postService;

    @PostMapping("")
    public Post createPost(@RequestBody CreatePostRequest createPostRequest){
        return postService.createPost(createPostRequest);
    }

    @GetMapping("/{uuid}")
    public GetPostResponse getPost(@PathVariable("uuid") String uuid){ return postService.getPost(uuid); }
}
