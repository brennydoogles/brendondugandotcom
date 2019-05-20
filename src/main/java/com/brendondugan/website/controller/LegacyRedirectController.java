package com.brendondugan.website.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
public class LegacyRedirectController {

	@GetMapping(value = "/about")
	public void redirectLegacyAboutPage(HttpServletResponse httpResponse) throws IOException {
		httpResponse.sendRedirect("/about/me");
	}
}
