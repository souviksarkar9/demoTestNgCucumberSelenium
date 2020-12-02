package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
class Controller {
	
	@Autowired
	private Adder adder;


  @GetMapping("/")
  public String all() {
    return "welcome";
  }

  @PostMapping("/add")
  public Long add(@RequestBody List<Long> nos) {
    return adder.add((Long [])nos.toArray());
  }
  
  @GetMapping("/add")
  public Long all(@RequestParam ("no1") Long no1 , @RequestParam ("no2") Long no2) {
    return adder.add(no1,no2);
  }

}