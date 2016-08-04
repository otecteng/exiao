package com.example;

import junit.framework.TestCase;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
public class LessonTest extends TestCase {
    @Test
    public void hello() {
        System.out.println("this is a lesson test !");
        Assert.assertEquals(1, 1);
    }
}