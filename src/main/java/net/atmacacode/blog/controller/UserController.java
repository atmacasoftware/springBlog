package net.atmacacode.blog.controller;

import net.atmacacode.blog.core.RequestMessage;
import net.atmacacode.blog.dto.UserDTO;
import net.atmacacode.blog.dto.UserUpdate;
import net.atmacacode.blog.entities.User;
import net.atmacacode.blog.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping()
    RequestMessage createUser(@RequestBody UserDTO user) {
        userService.save(user.toUser());
        return new RequestMessage("Kullanıcı oluşturuldu");
    }

    @GetMapping()
    List<User> getUsers() {
        return userService.findAll();
    }

    @GetMapping("/{id}")
    User getUser(@PathVariable long id) {
        return userService.findById(id);
    }

    @PutMapping("/{id}")
    RequestMessage updateUser(@PathVariable long id, @RequestBody UserUpdate user) {
        userService.update(id, user);
        return new RequestMessage("Kullanıcı Güncellendi");
    }


}
