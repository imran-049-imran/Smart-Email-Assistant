package com.email.write.controller;

import com.email.write.model.Email;
import com.email.write.service.EmailGeneratorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/email")
@CrossOrigin(origins = "*")
public class EmailGeneratorController {

    @Autowired
    private EmailGeneratorService emailGeneratorService;

    @PostMapping("/generate")
    public ResponseEntity<String>generateEmail(@RequestBody Email email){
        String response = emailGeneratorService.generateEmailReplay(email);
        return ResponseEntity.ok(response);

    }
}
