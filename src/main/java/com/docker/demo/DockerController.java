package com.docker.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/docker")
public class DockerController {

    @Autowired
    private DockerRepo dockerRepo;

    @GetMapping("/add")
    public SampleModel addDB(@RequestBody SampleModel sampleModel)
    {
        return dockerRepo.save(sampleModel);
    }
    @GetMapping("/all")
    public List<SampleModel> getAl()
    {
        return dockerRepo.findAll();
    }
}
