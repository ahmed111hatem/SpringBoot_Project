package com.example.demo.controller;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;




// The routes of the Website is here.
@SpringBootApplication
@Controller
public class DemoController {
  public static void main(String[] args) {
      SpringApplication.run(DemoController.class, args);
  }

	//Home Link
    @GetMapping("/")
    @ResponseBody
    public String helloWorld() {
        return "<h1>Welcome To My Website Root</h1> <ul> <h2>For more info pages visit /home/about Or /home pages.</h2>";
    }
    
    //root Link
    // @CrossOrigin
    @GetMapping("/home")
    @ResponseBody
    public String home() {
//    	This Line is suppose to load the src/main/resources/templates/index.html 
//    	Update it worked Don't ask me how :)
    	return "index"; 
    }
    
    @GetMapping("/home/about")
    @ResponseBody
    public String about_page() {
    	return"Welcome To The About Page";
    }
}


