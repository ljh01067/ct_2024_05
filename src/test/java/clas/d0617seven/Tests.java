package clas.d0617seven;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


public class Tests {
    @Test
    @DisplayName("2 => true")
    void t1(){
        assertThat(new clas.d0617seven.Math().isEvenNumber(2)).isEqualTo(true);
    }
    @Test
    @DisplayName("3 => false")
    void t2(){
        assertThat(new clas.d0617seven.Math().isEvenNumber(3)).isEqualTo(false);
    }
}
