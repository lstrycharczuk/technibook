package org.technischools.technibook.posts.mapper;

import org.technischools.technibook.posts.Post;
import org.technischools.technibook.posts.api.CreatePostRequest;
import org.technischools.technibook.posts.api.GetPostResponse;

public class PostMapper {
    public Post mapToPost(CreatePostRequest createPostRequest) {
        return Post.builder()
                .createdDate(createPostRequest.getCreatedDate())
                .updatedDate(createPostRequest.getUpdatedDate())
                .content(createPostRequest.getContent())
//                .authorUuid(createPostRequest.getAuthorUuid())
                .visibility(createPostRequest.getVisibility())
                .build();
    }

    public GetPostResponse mapToGetPostResponse(Post post) {
        return GetPostResponse.builder()
                .uuid(post.getUuid())
                .createdDate(post.getCreatedDate())
                .updatedDate(post.getUpdatedDate())
                .content(post.getContent())
//                .authorUuid(post.getAuthorUuid())
                .visibility(post.getVisibility())
                .build();
    }
}
