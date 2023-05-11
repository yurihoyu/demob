package com.example.demob.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demob.data.entity.Users;

public interface UsersRepository extends JpaRepository<Users, String> {

}
