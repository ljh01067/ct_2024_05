package com.ki.level1.p12921;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


public class Tests {
    @Test
    @DisplayName("10 => 4")
    void t12(){
        assertThat(new com.ki.level1.p12921.Solution().solution(10)).isEqualTo(4);
    }
    @Test
    @DisplayName("5 => 3")
    void t22() {
        assertThat(new com.ki.level1.p12921.Solution().solution(5)).isEqualTo(3);
    }
}
