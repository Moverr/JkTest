package com.kodeinc.demo;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.*;

class TaskTestTest {


    @Autowired
    private TaskTest taskTest;

    @BeforeEach
    void setUp() {
        taskTest = new TaskTest();

    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void calc() {

        int result = taskTest.add(1,2);
        assertEquals(result,3);
    }

    @Test
    void add() {
    }

    @Test
    void mult() {
    }

    @Test
    void minus() {
    }
}