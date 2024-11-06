package org.technischools.technibook.posts;

import java.util.List;

public class PostController {
    private final PostService postService;

    public PostController(PostService postService) {
        this.postService = postService;
    }

    public List<Post> getAllPostsByUserUuid(String userUuid) {
        return postService.getAllPostsByUserUuid(userUuid);
    }
}
