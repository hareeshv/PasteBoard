/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prj.pasteboard.Controller;

import com.prj.pasteboard.Model.Message;
import com.prj.pasteboard.repository.PasteBoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import org.springframework.web.bind.annotation.ResponseBody;
/**
 *
 * @author hveliget
 */
@RestController
public class MainController {
    
    @Autowired
    PasteBoardRepository pasteBoardRepository;
    
    @GetMapping
    String grettings() {
        return "Hello, World!";
    }

    @PostMapping
    ResponseEntity<HttpStatus> saveMessage(@RequestBody String message){
        pasteBoardRepository.save(new Message(message));
        return ResponseEntity.ok(HttpStatus.OK);
    }
    
    @GetMapping(value = "getAllMessages")
    @ResponseBody
    List<Message> getAllMessages() {
        return pasteBoardRepository.findAll();
    }
    
}
