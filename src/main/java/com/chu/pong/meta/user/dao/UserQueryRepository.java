package com.chu.pong.meta.user.dao;

import com.chu.pong.meta.user.domain.User;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.Optional;

import static com.chu.pong.meta.user.domain.QUser.user;

@Repository
@RequiredArgsConstructor
public class UserQueryRepository {

    private final JPAQueryFactory queryFactory;

    public Optional<User> findByIdAndDeletedIsFalse(long userId) {
        return Optional.ofNullable(
                queryFactory.selectFrom(user)
                        .where(user.id.eq(userId)
                                .and(user.deleted.isFalse()))
                        .fetchOne());
    }

    public Optional<User> findByEmailAndDeletedIsFalse(String email) {
        return Optional.ofNullable(
                queryFactory.selectFrom(user)
                        .where(user.email.eq(email)
                                .and(user.deleted.isFalse()))
                        .fetchOne());
    }
}