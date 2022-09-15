package com.ilovegre.api.dto;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class LikeDto {

    @JsonProperty("id")
    private Long id;
    @JsonProperty("publication_like")
    private Date publication_like;
    @JsonProperty("fk_author_comment")
    private UserDto author_comment;
    @JsonProperty("fk_like_comment")
    private CommentDto like_comment;
    @JsonProperty("fk_post_like")
    private PostDto post_like;
}
