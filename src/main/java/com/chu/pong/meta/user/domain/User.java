package com.chu.pong.meta.user.domain;

import com.chu.pong.meta.common.domain.BaseEntity;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Objects;

@Getter
@Entity(name = "user")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class User extends BaseEntity {

    @Id
    @Column(name = "user_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false, unique = true)
    private String email;
    @Column(nullable = false)
    private String password;
    private String phone;

    private long point;

    @Builder
    public User(String name, String email, String password, String phone, long point) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.phone = phone;
        this.point = point;
    }

    public static User create(Long userId) {
        User user = new User();
        user.setUserId(userId);
        return user;
    }

    private void setUserId(Long userId) {
        this.id = userId;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setPoint(long point) {
        this.point = point;
    }

    public void update(User other) {
        this.name = Objects.isNull(other.getName()) ? name : other.getName();
        this.email = Objects.isNull(other.getEmail()) ? email : other.getEmail();
        this.password = Objects.isNull(other.getPassword()) ? password : other.getPassword();
        this.phone = Objects.isNull(other.getPhone()) ? phone : other.getPhone();
        this.point = other.getPoint() < 0 ? point : other.getPoint();
    }

    public void delete() {
        this.deleted = true;
    }

    public void changePassword(String newPassword) {
        setPassword(newPassword);
    }

    public boolean isDeleted() {
        return deleted;
    }
}
