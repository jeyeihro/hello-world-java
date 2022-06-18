package com.github.jeyeihro.helloworldjava;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class HelloWorldTest {

    @Test
    void greetingTest(){
        String expected = "Hello, World!";
        assertEquals(expected, HelloWorld.greeting());
    }
}