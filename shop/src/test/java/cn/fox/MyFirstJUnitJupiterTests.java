package cn.fox;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("登录控制器测试")
public class MyFirstJUnitJupiterTests {

    private final Calculator calculator = new Calculator();

    @Test
    @DisplayName("退出")
    void addition() {
        assertEquals(2, calculator.add(1, 1));
    }

}