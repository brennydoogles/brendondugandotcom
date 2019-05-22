package com.brendondugan.website.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller()
@RequestMapping("/")
public class StaticPageController {

	@GetMapping
	public String showHomePage(){
		return "home";
	}

	@GetMapping(value = "/about/me")
	public String showAboutMePage(){
		return "about-me";
	}

	@GetMapping(value = "/music")
	public String showMusicPage(){
		return "music";
	}
	@GetMapping(value = "/about/site")
	public String showAboutSitePage(){
		return "about-site";
	}
	@GetMapping(value="/cv")
	public String showLegacyCVPage(){
		return "legacy-cv";
	}
}
