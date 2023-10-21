package com.chu.pong.meta.user.service;

import com.chu.pong.meta.user.dao.UserQueryRepository;
import com.chu.pong.meta.user.dao.UserRepository;
import com.chu.pong.meta.user.domain.User;
import com.chu.pong.meta.user.exception.LoginFailedException;
import com.chu.pong.meta.user.exception.UserIdNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class UserService {

    private final UserRepository repository;
    private final UserQueryRepository userQueryRepository;

    @Transactional
    public User join(User user) {
        return repository.save(user);
    }

    public User login(User user) {
        User savedUser = userQueryRepository
                .findByEmailAndDeletedIsFalse(user.getEmail())
                .orElseThrow(LoginFailedException::new);

        if (!user.getPassword().equals(savedUser.getPassword())) {
            throw new LoginFailedException();
        }

        return savedUser;
    }

    @Transactional
    public void remove(Long userId) {
        User user = userQueryRepository
                .findByIdAndDeletedIsFalse(userId)
                .orElseThrow(() -> new UserIdNotFoundException(userId));
        user.delete();
    }

    public User getById(Long userId) {
        return userQueryRepository
                .findByIdAndDeletedIsFalse(userId)
                .orElseThrow(() -> new UserIdNotFoundException(userId));
    }
}
