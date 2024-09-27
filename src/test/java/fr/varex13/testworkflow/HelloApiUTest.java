package fr.varex13.testworkflow;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.notNullValue;

class HelloApiUTest {

    @Test
    void hello() {

        final String hello = new HelloApi().hello();

        assertThat(hello, is(notNullValue()));
        assertThat(hello, is("Hello"));
    }

}