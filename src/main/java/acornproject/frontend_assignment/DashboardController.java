package acornproject.frontend_assignment;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DashboardController {

    @GetMapping("/dash")
    public String index(){
        return "index";
    }
}
