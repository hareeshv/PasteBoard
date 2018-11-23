/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prj.pasteboard.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 *
 * @author hveliget
 */
@RestController
public class MainController {
    
    
    @GetMapping
    String grettings() {
        return "Hello, World!";
    }
    
}
