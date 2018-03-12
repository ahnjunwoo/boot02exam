package com.ahn.profilesExam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/profilesExam")
public class ProfilesController {
    @Autowired
    ProfilesService profilesService;
    @Autowired
    MyBean myBean;
    @GetMapping
    public String profileExam(){
        System.out.println("mybean:"+myBean.getMessage());

        return profilesService.getMsg();
    }
}
