package nikiforov.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * todo Document type AppController
 */

@Controller
public class AppController {

    @RequestMapping("/")
    public String showStartPage() {
        return "start";
    }
}