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
@Table(name = "t_post")

public class Post implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String image;
    private String title;
    private Date publication_post;

    @ManyToOne
    @JoinColumn(name = "fk_author_post")
    private User author_post;

    @OneToMany
    @JoinColumn(name = "fk_like_post")
    private List<Like> comment_post;

    @OneToMany
    @JoinColumn(name = "fk_origin_post")
    private List<Comment> post_origin_comment;

}
