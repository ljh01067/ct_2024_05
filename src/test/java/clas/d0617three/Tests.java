package clas.d0617three;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


public class Tests {
    @Test
    @DisplayName("10, 20 => 30")
    void t1(){
        assertThat(new clas.d0617three.계산기().합(10,20)).isEqualTo(30);
    }
    @Test
    @DisplayName("30, 20 => 50")
    void t2(){
        assertThat(new clas.d0617three.계산기().합(30,20)).isEqualTo(50);
    }
    @Test
    @DisplayName("30, 70 => 100")
    void t3() {
        assertThat(new clas.d0617three.계산기().합(30,70)).isEqualTo(100);
    }
    @Test
    @DisplayName("30, 70 => -40")
    void t4() {
        assertThat(new clas.d0617three.계산기().차(30,70)).isEqualTo(-40);
    }
    @Test
    @DisplayName("3, 7 => 21")
    void t5() {
        assertThat(new clas.d0617three.계산기().곱(3,7)).isEqualTo(21);
    }
}
