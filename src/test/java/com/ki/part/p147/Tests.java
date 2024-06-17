package com.ki.part.p147;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


public class Tests {
    @Test
    @DisplayName("HelloWorld")
    void t1(){
        assertThat(new com.ki.part.p147.HelloWorld().result("HelloWorld")).isEqualTo("HelloWorld");
    }
}
