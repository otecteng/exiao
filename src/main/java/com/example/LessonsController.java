package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@EnableAutoConfiguration
public class LessonsController {
    LessonRepository lessonRepository;
    @Autowired
    public LessonsController(LessonRepository lessonRepository) {
        this.lessonRepository = lessonRepository;
    }
    @RequestMapping(method = RequestMethod.GET)
    public Iterable<Lesson> index() {
        return lessonRepository.findAll();
    }
    @RequestMapping(method = RequestMethod.POST)
    public Lesson add(@RequestBody Lesson lesson) {
        return lessonRepository.save(lesson);
    }
//
//    @RequestMapping(method = RequestMethod.PUT)
//    public void update(@RequestBody Lesson lesson) {
//        lessonRepository.save(lesson);
//    }
//
//    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
//    public void updateById(@PathVariable("id") Long id, @RequestBody Lesson lesson) {
//
//    }
//
//    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
//    public void delete() {
//
//    }
}
