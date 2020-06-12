package com.gabriel.springmongo.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.gabriel.springmongo.domain.Post;

@Repository
public interface PostRepository extends MongoRepository<Post, String>{
	
	public List<Post> findByTitleContainingIgnoreCase(String text);
	
}
