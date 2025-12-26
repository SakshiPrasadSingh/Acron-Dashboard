package acornproject.frontend_assignment;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DashboardController {

    @GetMapping("/dash")
    public String Dashboard(){
        return "Dashboard frontend";
    }
}
