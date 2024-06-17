package clas.d0617eight;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


public class Tests {
    @Test
    @DisplayName("1 => false")
    void t1(){
        assertThat(new clas.d0617eight.Math().isPrimeNumber(1)).isEqualTo(false);
    }
    @Test
    @DisplayName("2 => true")
    void t2(){
        assertThat(new clas.d0617eight.Math().isPrimeNumber(2)).isEqualTo(true);
    }
    @Test
    @DisplayName("4 => false")
    void t3(){
        assertThat(new clas.d0617eight.Math().isPrimeNumber(4)).isEqualTo(false);
    }
    @Test
    @DisplayName("7 => true")
    void t4(){
        assertThat(new clas.d0617eight.Math().isPrimeNumber(7)).isEqualTo(true);
    }
}
