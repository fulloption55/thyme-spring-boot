package com.example.thymespringboot.controller.web;

import com.example.thymespringboot.client.MovieApiClient;
import com.example.thymespringboot.model.SfCinemaCity;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Log4j2
@Controller
public class SimpleController {

    @Value("${spring.application.name}")
    String appName;

    @Autowired
    private MovieApiClient movieApiClient;

    @GetMapping("/")
    public String homePage(Model model) {
        model.addAttribute("appName", appName);
        model.addAttribute( "command", new FormCommand());
        return "home";
    }



    @PostMapping("/fooform")
    public String foobarPost(@ModelAttribute("command") FormCommand command,
                             BindingResult bindingResult,
                             Model model,
                             RedirectAttributes ra) {

        System.out.println("Yeee");
//        redisTemplate.

        try {
            SfCinemaCity x = movieApiClient.getNowMovie("en").getBody();

            log.info(x.getMovies().get(0).getTitle());
        } catch (Exception e){
            log.error(e);
        }

//        log.debug("form submission.");
//
//        if (bindingResult.hasErrors()) {
//            return "fooForm";
//        }

//        ra.addFlashAttribute("command", command);
//        log.info("dsfsdfjlkjllsdlfkds {}" ,multiLanguageService.getMultiLanguageCache("OK", "th"));

        return "redirect:/";
    }
}
