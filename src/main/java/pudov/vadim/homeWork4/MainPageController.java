package pudov.vadim.homeWork4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class MainPageController {
    @Autowired
    private UserService userService;
    @GetMapping("/main")
    public String main() {
        return "forward:/main.html";
    }
    @GetMapping("/controller")
    public String controller() {return "forward:/controller.html";}
    @GetMapping("/mvc")
    public String mvc() {return "forward:/mvc.html";}
    @GetMapping("/ds")
    public String ds() {return "forward:/ds.html";}
    @GetMapping("/css")
    public String css() {return "forward:/css.html";}
    @GetMapping("/thymeleaf")
    public String showUsers(Model model) {
        model.addAttribute("users", userService.getUsers());
        return "thymyleaf";
    }
    @GetMapping("user/{id}")
    public String getUser(@PathVariable Long id, Model model) {
        model.addAttribute("user", userService.getUserByID(id));
        return "userProfile";
    }
}
