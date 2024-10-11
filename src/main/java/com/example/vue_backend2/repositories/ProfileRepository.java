package com.example.vue_backend2.repositories;

import com.example.vue_backend2.model.Profile;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProfileRepository extends MongoRepository<Profile,Integer> {
}
