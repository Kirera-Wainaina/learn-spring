package com.learn_spring.app;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

  record Video(String name) { }

  List<Video> videos = List.of(
    new Video("Need help learning Spring Boot"),
    new Video("Learn Spring Boot in 3 days"),
    new Video("Forget everything you know")
  );

  @GetMapping("/")
  public String index(Model model)
  {
    model.addAttribute("videos", videos);
    return "index";
  }
}
