package com.ki.level0.p120813;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


public class Tests {
    @Test
    @DisplayName("23 => 5")
    void t12(){
        assertThat(new com.ki.level0.p120813.Solution().solution(10)).isEqualTo(new int[]{1,3,5,7,9});
    }
    @Test
    @DisplayName("24 => 6")
    void t22() {
        assertThat(new com.ki.level0.p120813.Solution().solution(15)).isEqualTo(new int[]{1,3,5,7,9,11,13,15});
    }
}
