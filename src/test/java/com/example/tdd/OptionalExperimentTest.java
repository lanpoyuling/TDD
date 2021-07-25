package com.example.tdd;

import com.example.tdd.vo.MaterialExcelVO;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class OptionalExperimentTest {
    private static Logger logger = LoggerFactory.getLogger(OptionalExperimentTest.class);

    @Test
    void test_optional_assert_throws() {
        Throwable exception = assertThrows(RuntimeException.class,
                getExecutable(null, logger));
        assertEquals("xx", exception.getMessage());
    }

    private Executable getExecutable(List<MaterialExcelVO> materialExcelVOS, Logger logger) {
        return () -> new OptionalExperiment().testOptional(materialExcelVOS, logger);
    }

    @Test
    void test_optional_assert_dose_not_throw() {
        assertDoesNotThrow(getExecutable(new ArrayList<>(), logger));
    }
}
