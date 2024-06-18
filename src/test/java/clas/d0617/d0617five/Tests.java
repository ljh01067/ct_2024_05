package clas.d0617.d0617five;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


public class Tests {
    @Test
    @DisplayName("2, 3 => 5")
    void t1(){
        assertThat(new clas.d0617.d0617five.Math().nToMSum(2,3)).isEqualTo(5);
    }
    @Test
    @DisplayName("5, 10 => 45")
    void t2(){
        assertThat(new clas.d0617.d0617five.Math().nToMSum(5,10)).isEqualTo(45);
    }
}
