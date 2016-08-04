package com.example;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Lesson {
    public long getId() {
        return id;
    }

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    private String name;

    protected Lesson() {}

    public Lesson(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return String.format(
                "Lesson[id=%d, name='%s']",
                id, name);
    }
}
