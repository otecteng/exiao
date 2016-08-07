package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class LessonService {
    @Autowired
    LessonRepository lessonRepository;

    public Iterable<Lesson> list(){
        return lessonRepository.findAll();
    }

    public Lesson create(Lesson lesson){
        return lessonRepository.save(lesson);
    }

    public Lesson update(Lesson lesson){
        return lessonRepository.save(lesson);
    }
    public Lesson delete(Lesson lesson){
        return lessonRepository.save(lesson);
    }

}
