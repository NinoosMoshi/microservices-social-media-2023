package com.ninos.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity(name = "posts")
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "image_path")
    private String image;

    @Column(name = "text")
    private String text;

    @Column(name = "likes")
    private int like;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

}
