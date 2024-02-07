package com.docker.demo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface DockerRepo extends JpaRepository<SampleModel, Integer> {
}