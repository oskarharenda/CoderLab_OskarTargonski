package pl.coderslab.ckontrolaprzeplywu;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.assertEquals;

public class Main10Test {

    private static final Logger log = LoggerFactory.getLogger(Main10Test.class);
    private static final String EXPECTED_OUTPUT = "*2345\n" +
            "**345\n" +
            "***45\n" +
            "****5\n" +
            "*****\n" +
            "*****\n" +
            "****5\n" +
            "***45\n" +
            "**345\n" +
            "*2345";

    private String output;

    @Rule
    public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();

    @Before
    public void setUp() {
        Main10.main(null);
        output = systemOutRule.getLog();
    }

    @Test
    public void whenRun_thenSystemOut_Stars() {
        assertEquals(EXPECTED_OUTPUT, output.trim());
    }
}