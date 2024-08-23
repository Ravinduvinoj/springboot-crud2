package com.example.crud02.controller;

import com.example.crud02.dto.UserDTO;
import com.example.crud02.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/saveUser")
    public  UserDTO saveUser(@RequestBody UserDTO userDTO){
       return userService.saveUser(userDTO);

    }
    @GetMapping("/getAllUsers")
    public List<UserDTO> getUsers(){
        return userService.getAllUsers();
    }
    @PutMapping("/updateUser")
    public  UserDTO updateUser(@RequestBody UserDTO userDTO){
        return  userService.updateUser(userDTO);
    }
    @DeleteMapping("/deleteUser")
    public boolean deleteUser(@RequestBody UserDTO userDTO){
    return userService.deleteUser(userDTO);
    }

}
