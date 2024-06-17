package com.ki.part.p148;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


public class Tests {
    @Test
    @DisplayName("3 => 3")
    void t1(){
        assertThat(new com.ki.part.p148.VariableExam().result(3)).isEqualTo(3);
    }
}
