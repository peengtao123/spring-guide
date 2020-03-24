package cn.fox;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assumptions.assumeTrue;

public class AssumptionsDemo {
    private Calculator calculator = new Calculator();

    @Test
    void testOnlyOnCIServer(){
        assumeTrue("CI".equals(System.getenv("PATH")));
        System.out.println(System.getenv("Path"));
    }
}
