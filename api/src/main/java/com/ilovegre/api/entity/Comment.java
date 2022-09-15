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
@Table(name = "t_comment")
public class Comment implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String message;
    private Date publication_comment;

    @ManyToOne
    @JoinColumn(name = "fk_author_comment")
    private User author_comment;

    @OneToMany
    @JoinColumn(name = "fk_like_comment")
    private List<Like> like_comment;

    @ManyToOne
    @JoinColumn(name = "fk_post_origin")
    private Post post_origin;

}
