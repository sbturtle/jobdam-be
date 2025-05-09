package com.jobdam.jobdam_be.user.dao;

import com.jobdam.jobdam_be.user.mapper.UserMapper;
import com.jobdam.jobdam_be.user.model.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class UserDAO {
    private final UserMapper userMapper;

    // save
    public boolean saveEmail(User user) {
        return userMapper.saveEmail(user) > 0;
    }

    public void saveSocial(User user) {
        userMapper.saveSocial(user);
    }

    // find
    public Optional<User> findById(Long id) {
        return userMapper.findById(id);
    }

    public Optional<User> findByEmail(String email) {
        return userMapper.findByEmail(email);
    }

    public Optional<User> findByProviderId(String providerId) {
        return userMapper.findByProviderId(providerId);
    }

    public Long findIdByEmail(String email) {
        return userMapper.findIdByEmail(email);
    }

    public String findProfileImgUrlById(Long id) {
        return userMapper.findProfileImgUrlById(id);
    }

    // update
    public void updateCreatedAtByEmail(String email) {
        userMapper.updateCreatedAtByEmail(email);
    }

    public void updateSocialByEmail(User user) {
        userMapper.updateSocialByEmail(user);
    }

    public boolean initProfile(User updateUser) {
        return userMapper.initProfile(updateUser) > 0;
    }

    public boolean updateProfile(User updateUser) {
        return userMapper.updateProfile(updateUser) > 0;
    }

    // exists
    public boolean existsByEmail(String email) {
        return userMapper.existsByEmail(email);
    }

    public boolean existsJobById(Long id) {
        return userMapper.existsJobById(id);
    }

}
