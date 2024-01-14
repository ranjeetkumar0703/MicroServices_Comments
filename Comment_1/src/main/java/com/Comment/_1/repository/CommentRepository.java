package com.Comment._1.repository;


import com.Comment._1.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CommentRepository extends JpaRepository<Comment,String> {
    List<Comment> findByPostId(String postId);
}
