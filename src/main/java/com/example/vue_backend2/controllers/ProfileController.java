package com.example.vue_backend2.controllers;

import com.example.vue_backend2.model.Profile;
import org.springframework.web.bind.annotation.*;
import com.example.vue_backend2.repositories.ProfileRepository;

import java.util.List;

@RestController
@RequestMapping(value = "/index/")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class ProfileController {
    private final ProfileRepository profileRepository;

    public ProfileController(ProfileRepository profileRepository) {
        super();
        this.profileRepository = profileRepository;
    }

    @GetMapping("/hello")
    public String hello() {
        return "Hello World";
    }

    @GetMapping(value = "/all")
    public List<Profile> getAll() {
        return profileRepository.findAll();
    }

    @PostMapping("/profiles")
    Profile newProfile(@RequestBody Profile profile) {
        return profileRepository.save(profile);
    }

}
