package com.example.tdd.util;

import cn.hutool.json.JSONUtil;
import com.example.tdd.vo.MaterialExcelVO;
import org.junit.jupiter.api.Test;

import java.util.List;

class ExcelUtilsTest {


    @Test
    void readExcel() {
        List<MaterialExcelVO> materialExcelVOS = ExcelUtils.readExcel("D:\\zzgd\\开关开关柜.xlsx", MaterialExcelVO.class);
        MaterialExcelVO materialExcelVO = materialExcelVOS.get(0);
        System.err.println(JSONUtil.toJsonPrettyStr(materialExcelVO));

    }
}
