package com.example.tdd;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

class MapToolTest {
    public static final Logger logger = LoggerFactory.getLogger(MapToolTest.class);

    @Test
    void name() {
        int capacity = MapTool.capacity(7);
        logger.info("capacity:{}",capacity);

    }
}
