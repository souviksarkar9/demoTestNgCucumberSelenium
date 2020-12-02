package com.example.demo;

import java.util.Arrays;

import org.springframework.stereotype.Service;

@Service
class Adder{
	public long add(long l1 , long l2) {
		return l1 + l2;
	}
	public long add(Long []l1) {
		return Arrays.asList(l1).stream().mapToLong(Long :: valueOf).sum();
	}
	
}