package com.ilovegre.api.entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
@Entity
@Table(name = "t_user")

public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String username;
    private String firstname;
    private String lastname;
    private String image_profile;
    private Date registration;
    private Boolean admin;

    @OneToMany
    @JoinColumn(name = "fk_comment_author")
    private List<Comment> comment_author;

    @OneToMany
    @JoinColumn(name = "fk_like_author")
    private List<Like> like_autor;

    @OneToMany
    @JoinColumn(name = "fk_post_author")
    private List<Post> post_author;
}
