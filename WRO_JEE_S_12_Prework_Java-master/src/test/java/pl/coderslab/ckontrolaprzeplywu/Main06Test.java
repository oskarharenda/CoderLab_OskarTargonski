package pl.coderslab.ckontrolaprzeplywu;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pl.coderslab.bzmienneioperatory.Main05;

import static org.junit.Assert.assertEquals;

public class Main06Test {

    private static final String EXPECTED_OUTPUT = "0 - parzysta\n" +
            "1 - nieparzysta\n" +
            "2 - parzysta\n" +
            "3 - nieparzysta\n" +
            "4 - parzysta\n" +
            "5 - nieparzysta\n" +
            "6 - parzysta\n" +
            "0 - parzysta\n" +
            "1 - nieparzysta\n" +
            "2 - parzysta\n" +
            "3 - nieparzysta\n" +
            "4 - parzysta\n" +
            "5 - nieparzysta\n" +
            "6 - parzysta";

    private String output;

    @Rule
    public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();

    @Before
    public void setUp() {
        Main06.main(null);
        output = systemOutRule.getLog();
    }

    @Test
    public void whenRun_thenSystemOut_OddEvenMessage() {
        assertEquals(EXPECTED_OUTPUT, output.trim());
    }
}