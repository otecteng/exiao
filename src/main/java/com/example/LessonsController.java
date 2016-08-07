package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@EnableAutoConfiguration
@RequestMapping("/lessons")
public class LessonsController {
    @Autowired
    LessonService lessonService;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity index() {
        return new ResponseEntity(lessonService.list(), HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity add(@RequestBody Lesson lesson) {
        return new ResponseEntity(lessonService.create(lesson), HttpStatus.OK);
    }


    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public ResponseEntity updateById(@PathVariable("id") Long id, @RequestBody Lesson lesson) {
        return new ResponseEntity(lessonService.update(lesson), HttpStatus.OK);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public ResponseEntity delete() {
        return new ResponseEntity(lessonService.list(), HttpStatus.OK);

    }
}
