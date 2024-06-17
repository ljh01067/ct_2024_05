package clas.d0617nine;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


public class Tests {
    @Test
    @DisplayName("10 => 17")
    void t1(){
        assertThat(new clas.d0617nine.Math().one_to_n_prime_numbers_sum(10)).isEqualTo(17);
    }
    @Test
    @DisplayName("13 => 41")
    void t2(){
        assertThat(new clas.d0617nine.Math().one_to_n_prime_numbers_sum(13)).isEqualTo(41);
    }
}
