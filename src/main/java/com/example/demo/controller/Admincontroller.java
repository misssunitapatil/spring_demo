package com.example.demo.controller;

import com.example.demo.entities.Student;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Admincontroller {
    @GetMapping("/studinfo")
    public ResponseEntity<Student> Studinfo(){
        Student st = new Student();
        st.setId(1);
        st.setName("Sonam");
        st.setUsername("sonu");
        st.setPassword("soni");
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(st);
    }
@PostMapping("/post")
    public Student post(@RequestBody Student s){

        Student st=new Student();
        st.setId(s.getId());
        st.setName(s.getName());
        st.setUsername(s.getUsername());
        st.setPassword(s.getPassword());
        return s;
}
}
