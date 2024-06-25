package it.raffo.code.best_of_the_year;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller

public class WebController {

    @GetMapping("/prova")
    public String getName(@RequestParam(name = "name", required = false) String name,
            Model model) {

        model.addAttribute("name", name);

        return "bestOfTheYear";
    }

}
