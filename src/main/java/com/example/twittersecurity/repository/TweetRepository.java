package com.example.twittersecurity.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.twittersecurity.entities.Tweet;

public interface TweetRepository extends JpaRepository<Tweet, Long>{
    
}
