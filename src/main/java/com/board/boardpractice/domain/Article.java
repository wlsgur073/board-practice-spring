package com.board.boardpractice.domain;

import java.time.LocalDateTime;

public class Article {

    private Long id;
    private String title;
    private String content;
    private String hashtag;


    // common
    private LocalDateTime createAt;
    private String createBy;
    private LocalDateTime modifiedAt;
    private String modifiedBy;


}
