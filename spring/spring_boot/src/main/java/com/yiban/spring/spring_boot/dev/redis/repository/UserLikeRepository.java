package com.yiban.spring.spring_boot.dev.redis.repository;

import com.yiban.spring.spring_boot.dev.redis.entity.UserLike;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserLikeRepository extends JpaRepository<UserLike, Integer>{
    Page<UserLike> findByLikedUserIdAndStatus(String likedUserId, Integer status, Pageable pageable);

    Page<UserLike> findByLikedPostIdAndStatus(String likedPostId, Integer status, Pageable pageable);

    UserLike findByLikedUserIdAndLikedPostId(String likedUserId, String likedPostId);
}
