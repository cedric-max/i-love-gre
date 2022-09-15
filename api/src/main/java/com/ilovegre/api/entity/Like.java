package com.ilovegre.api.entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
@Entity
@Table(name = "t_like")
public class Like implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Date publication_like;

    @ManyToOne
    @JoinColumn(name = "fk_author_like")
    private User author_comment;

    @ManyToOne
    @JoinColumn(name = "fk_like_comment")
    private Comment like_comment;

    @ManyToOne
    @JoinColumn(name = "fk_post_like")
    private Post post_like;
}
