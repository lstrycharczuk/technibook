package org.technischools.technibook.posts.api;
import java.util.Date;
import lombok.Data;
import org.technischools.technibook.posts.Post;

@Data
public class CreatePostRequest {
    private Date createdDate;
    private Date updatedDate;
    private String content;
//    private String authorUuid;
    private PostVisibility visibility;
}
