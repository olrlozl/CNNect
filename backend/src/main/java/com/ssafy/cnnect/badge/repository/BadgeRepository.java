package com.ssafy.cnnect.badge.repository;

import com.ssafy.cnnect.badge.entity.Badge;
import com.ssafy.cnnect.badge.entity.BadgeCondition;
import com.ssafy.cnnect.user.entity.User;
import com.ssafy.cnnect.video.entity.Category;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BadgeRepository extends CrudRepository<Badge, Long> {
    List<Badge> findAllByCategory(Category category);
    List<Badge> findAllByBadgeCondition(BadgeCondition badgeCondition);

}
