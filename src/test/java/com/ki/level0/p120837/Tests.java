package com.ki.level0.p120837;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


public class Tests {
    @Test
    @DisplayName("23 => 5")
    void t12(){
        assertThat(new com.ki.level0.p120837.Solution().solution(23)).isEqualTo(5);
    }
    @Test
    @DisplayName("24 => 6")
    void t22() {
        assertThat(new com.ki.level0.p120837.Solution().solution(24)).isEqualTo(6);
    }
}
