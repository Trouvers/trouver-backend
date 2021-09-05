package com.example.backend.repository;

import org.springframework.stereotype.Repository;

import com.example.backend.entity.PollEntity;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository("pollRepository")
public interface PollRepository extends JpaRepository<PollEntity, Long> {

}
