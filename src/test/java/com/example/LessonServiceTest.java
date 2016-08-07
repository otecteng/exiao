package com.example;

import junit.framework.TestCase;
import org.junit.Test;
import org.junit.Assert;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

import static org.hamcrest.Matchers.is;

@RunWith(SpringJUnit4ClassRunner.class)
public class LessonServiceTest extends TestCase {
    @Test
    public void createTest() {
        Assert.assertThat("Help! Integers don't work", 1, is(1));
    }
}