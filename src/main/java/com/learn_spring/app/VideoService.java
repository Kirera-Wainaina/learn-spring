package com.learn_spring.app;

import java.util.List;

import org.springframework.stereotype.Service;

/**
 * VideoService
 */
@Service
public class VideoService {

  private List<Video> videos = List.of(
    new Video("Need help learning Spring Boot"),
    new Video("Learn Spring Boot in 3 days"),
    new Video("Forget everything you know")
  );
  
  public List<Video> getVideos() {
    return videos;
  }
}