package kavya.framework.demo.controller;

import kavya.framework.demo.service.ChuckNorrisJokeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokeController
{
    ChuckNorrisJokeService chuckNorrisService;

    JokeController(ChuckNorrisJokeService chuckNorrisService)
    {
        this.chuckNorrisService=chuckNorrisService;
    }

    @RequestMapping({"/",""})
    String getJoke(Model model)
    {
        String joke=chuckNorrisService.getJoke();
        model.addAttribute("joke",joke);
        return "index";
    }
}
