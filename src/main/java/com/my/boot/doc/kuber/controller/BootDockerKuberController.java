package com.my.boot.doc.kuber.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BootDockerKuberController {
	
	@GetMapping("/boot-dock-kuber")
	public String getBootOnDockerAndKubernetes() {
		return "Boot is working well on Docker Kubernetes....!";
	}

}
