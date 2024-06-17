package com.ki.level0.p120811;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


public class Tests {
    @Test
    @DisplayName("1, 2, 3, 4, 5 => 3")
    void t12(){
        assertThat(new com.ki.level0.p120811.Solution().solution(new int[]{1,2,3,4,5})).isEqualTo(3);
    }
    @Test
    @DisplayName("2, 1, 1, 1, 1 => 1")
    void t22() {
        assertThat(new com.ki.level0.p120811.Solution().solution(new int[]{2, 1, 1, 1, 1})).isEqualTo(1);
    }
}
