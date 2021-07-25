package com.example.tdd;

import com.example.tdd.vo.MaterialExcelVO;
import org.slf4j.Logger;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class OptionalExperiment {
    public OptionalExperiment() {
    }

    boolean testOptional(List<MaterialExcelVO> materialExcelVOS, Logger logger) {
        logger.info("result:{}", Optional.of(Optional.ofNullable(materialExcelVOS).orElse(new ArrayList<>()))
                .filter(a -> !CollectionUtils.isEmpty(a))
                .orElse(new ArrayList<>())
                .stream()
                .map(a1 -> Optional.ofNullable(Optional.ofNullable(a1)
                        .orElse(new MaterialExcelVO())
                        .getFeatureValueCode1()
                ).orElse("xx"))
                .collect(Collectors.toList()));
        logger.info("orElse===不存在返回给定值:{}", Optional.ofNullable(materialExcelVOS).orElse(new ArrayList<>()));
        logger.error("orElseThrow===抛出异常,不处理程序中断{}", Optional.ofNullable(materialExcelVOS)
                .orElseThrow(() -> new RuntimeException("xx")));
        return false;
    }
}
