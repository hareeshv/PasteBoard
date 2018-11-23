/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prj.pasteboard.repository;

import com.prj.pasteboard.Model.Message;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author hveliget
 */
public interface PasteBoardRepository extends JpaRepository<Message, Long>{
    
}
