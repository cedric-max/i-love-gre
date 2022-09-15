package com.ilovegre.api.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
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
public class PostDto {

    @JsonProperty("id")
    private Long id;
    @JsonProperty("image")
    private String image;
    @JsonProperty("title")
    private String title;
    @JsonProperty("publication_post")
    private Date publication_post;
    @JsonProperty("fk_author_post")
    private UserDto author_post;
    @JsonProperty("fk_comment_post")
    private List<LikeDto> comment_post;
    @JsonProperty("fk_post_origin_comment")
    private List<CommentDto> post_origin_comment;
}
