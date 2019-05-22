package com.brendondugan.website.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller()
@RequestMapping("/")
public class StaticPageController {

	@GetMapping
	public String showHomePage(Model model){
		setPageTitle(model, "Home");
		return "home";
	}

	@GetMapping(value = "/about/me")
	public String showAboutMePage(Model model){
		setPageTitle(model, "About Me");
		return "about-me";
	}

	@GetMapping(value = "/music")
	public String showMusicPage(Model model){
		setPageTitle(model, "Music");
		return "music";
	}
	@GetMapping(value = "/about/site")
	public String showAboutSitePage(Model model){
		setPageTitle(model, "About This Site");
		return "about-site";
	}
	@GetMapping(value="/cv")
	public String showLegacyCVPage(Model model){
		setPageTitle(model, "CV");
		return "legacy-cv";
	}

	private void setPageTitle(Model model, String title){
		model.addAttribute("pageTitle", title);
	}
}
