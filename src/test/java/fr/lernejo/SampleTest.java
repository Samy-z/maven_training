package fr.lernejo;

import org.junit.jupiter.api.Test;
import org.assertj.core.api.Assertions;
class SampleTest {
    private final Sample sample = new Sample();

    @Test
    void addition_of_2_and_3_should_be_5(){
        int res = sample.op(Sample.Operation.ADD, 2,3);
        Assertions.assertThat(res).isEqualTo(5);
    }
    void factoriel_de_3_should_be_6(){
        int res2= sample.fact(3);
        Assertions.assertThat(res2).isEqualTo(6);
    }
}
