package clas.d0617.d0617two;

import clas.d0617.d0617two.계산기;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


public class Tests {
    @Test
    @DisplayName("10, 20 => 30")
    void t1(){
        assertThat(new 계산기().더한결과를_화면에_출력(10,20)).isEqualTo(30);
    }
    @Test
    @DisplayName("50, 20 => 70")
    void t2(){
        assertThat(new 계산기().더한결과를_화면에_출력(50,20)).isEqualTo(70);
    }
    @Test
    @DisplayName("50, 20 => 30")
    void t3() {
        assertThat(new 계산기().뺀결과를_화면에_출력(50,20)).isEqualTo(30);
    }
    @Test
    @DisplayName("5, 2 => 3")
    void t4() {
        assertThat(new 계산기().뺀결과를_화면에_출력(5,2)).isEqualTo(3);
    }
    @Test
    @DisplayName("5, 2 => 10")
    void t5() {
        assertThat(new 계산기().곱한결과를_화면에_출력(5,2)).isEqualTo(10);
    }
}
