package com.board.boardpractice.dto.request;

import com.board.boardpractice.dto.ArticleDto;
import com.board.boardpractice.dto.UserAccountDto;

public record ArticleRequest(
        String title,
        String content,
        String hashtag
)  {
    public static ArticleRequest of(String title, String content, String hashtag) {
        return new ArticleRequest(title, content, hashtag);
    }

    public ArticleDto toDto(UserAccountDto userAccountDto) {
        return ArticleDto.of(
                userAccountDto,
                title,
                content,
                hashtag
        );
    }
}
