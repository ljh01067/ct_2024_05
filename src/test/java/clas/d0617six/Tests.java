package clas.d0617six;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


public class Tests {
    @Test
    @DisplayName("10 => 4")
    void t1(){
        assertThat(new clas.d0617six.Math().one_to_n_prime_numbers_count(10)).isEqualTo(4);
    }
    @Test
    @DisplayName("13 => 6")
    void t2(){
        assertThat(new clas.d0617six.Math().one_to_n_prime_numbers_count(13)).isEqualTo(6);
    }
}
