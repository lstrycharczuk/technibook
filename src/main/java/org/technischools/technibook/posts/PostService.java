package org.technischools.technibook.posts;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.technischools.technibook.posts.api.CreatePostRequest;
import org.technischools.technibook.posts.api.GetPostResponse;
import org.technischools.technibook.posts.mapper.PostMapper;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PostService {
    private final PostRepository postRepository;
    private final PostMapper postMapper;

    public Post createPost(CreatePostRequest createPostRequest) {
        Post newPost = postMapper.mapToPost(createPostRequest);
        return postRepository.save(newPost);
    }

    public GetPostResponse getPost(String uuid) {
        Post post = postRepository.findByUuid(uuid);
        return postMapper.mapToGetPostResponse(post);
    }
}
