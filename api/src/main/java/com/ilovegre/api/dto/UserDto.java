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
public class UserDto {

    @JsonProperty("id")
    private Long id;
    @JsonProperty("username")
    private String username;
    @JsonProperty("firstname")
    private String firstname;
    @JsonProperty("lastname")
    private String lastname;
    @JsonProperty("image_profile")
    private String image_profile;
    @JsonProperty("registration")
    private Date registration;
    @JsonProperty("admin")
    private Boolean admin;
    @JsonProperty("fk_comment_author")
    private List<CommentDto> comment_author;
    private List<LikeDto> like_autor;
    @JsonProperty("fk_post_author")
    private List<PostDto> post_author;
}
