package clas.d0617.d0617four;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


public class Tests {
    @Test
    @DisplayName("3 => 6")
    void t1(){
        assertThat(new clas.d0617.d0617four.Math().oneToSum(3)).isEqualTo(6);
    }
    @Test
    @DisplayName("10 => 55")
    void t2(){
        assertThat(new clas.d0617.d0617four.Math().oneToSum(10)).isEqualTo(55);
    }
}
