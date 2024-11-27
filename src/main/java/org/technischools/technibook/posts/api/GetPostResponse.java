package org.technischools.technibook.posts.api;

import java.util.Date;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class GetPostResponse {
    private String uuid;
    private Date createdDate;
    private Date updatedDate;
    private String content;
//    private String authorUuid;
    private PostVisibility visibility;
}
