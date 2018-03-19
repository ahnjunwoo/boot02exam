package com.ahn.bangsong;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/bangsong")
public class BangsongController {

    @GetMapping("/{id}")
    public Bangsong getBangsong(@PathVariable("id") Bangsong bangsong){
        if(bangsong.getId() == 100){
            throw new BangsongException();
        }
        /*Bangsong bangsong = new Bangsong();
        bangsong.setId(id.getId());*/
        return bangsong;
    }

   /* @ExceptionHandler(BangsongException.class)
    public ResponseEntity<String> handleException(BangsongException e){
        return new ResponseEntity<>(HttpStatus.BAD_GATEWAY);
    }*/
}