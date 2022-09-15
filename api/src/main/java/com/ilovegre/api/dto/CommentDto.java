package com.ilovegre.api.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.ilovegre.api.entity.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class CommentDto {

    @JsonProperty("id")
    private Long id;
    @JsonProperty("message")
    private String message;
    @JsonProperty("publication_comment")
    private Date publication_comment;
    @JsonProperty("fk_author_comment")
    private User author_comment;
    @JsonProperty("fk_like_comment")
    private List<LikeDto> like_comment;
    @JsonProperty("fk_post_origin")
    private PostDto post_origin;
}
