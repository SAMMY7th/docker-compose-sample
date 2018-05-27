package net.nocono.dockercomposesample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    List<User> show() {
        return userService.findAll();
    }

    @PostMapping
    void create(@ModelAttribute User user) {
        userService.save(user);
    }

    @PostMapping("{id}")
    void update(@PathVariable Long id, @ModelAttribute User user) {
        userService.save(user);
    }

    @PostMapping("{id}/delete")
    void delete(@PathVariable Long id) {
        userService.delete(id);
    }
}
