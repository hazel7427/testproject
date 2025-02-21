package com.sns.project.dto.comment;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CommentListResponseDto {
    private List<CommentResponseDto> comments;

    public CommentListResponseDto(List<CommentResponseDto> comments) {
        this.comments = comments;
    }
}
