package com.example.tdd.vo;

import org.jeecgframework.poi.excel.annotation.Excel;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @ClassName MaterialExcelVO
 * @Description 物料ExcelVO
 * @Author 10932
 * @Date 7/22/2021 11:34 AM
 **/
public class MaterialExcelVO {

    @Excel(name = "物料编码")
    private String materialCode;

    @Excel(name = "物料描述")
    private String materialDesc;

    @Excel(name = "物料长描述")
    private String materialLongDesc;

    @Excel(name = "品类编码")
    private String categoryCode;
    @Excel(name = "物资种类编码")
    private String subclassCode;
    @Excel(name = "品类")
    private String categoryName;
    @Excel(name = "物资种类")
    private String subclassName;

    @Excel(name = "大类编码")
    private String majorCode;
    @Excel(name = "大类描述")
    private String majorDesc;
    @Excel(name = "中类编码")
    private String mediumCode;
    @Excel(name = "中类描述")
    private String mediumDesc;
    @Excel(name = "小类编码")
    private String smallCode;
    @Excel(name = "小类描述")
    private String matMinName;
    @Excel(name = "单位")
    private String unit;
    @Excel(name = "特征项1编码")
    private String featureItemCode1;
    @Excel(name = "特征项1描述")
    private String featureItemDesc1;
    @Excel(name = "特征值1编码")
    private String featureValueCode1;
    @Excel(name = "特征值1描述")
    private String featureValueDesc1;

    @Excel(name = "特征项2编码")
    private String featureItemCode2;
    @Excel(name = "特征项2描述")
    private String featureItemDesc2;
    @Excel(name = "特征值2编码")
    private String featureValueCode2;
    @Excel(name = "特征值2描述")
    private String featureValueDesc2;

    @Excel(name = "特征项3编码")
    private String featureItemCode3;
    @Excel(name = "特征项3描述")
    private String featureItemDesc3;
    @Excel(name = "特征值3编码")
    private String featureValueCode3;
    @Excel(name = "特征值3描述")
    private String featureValueDesc3;

    @Excel(name = "特征项4编码")
    private String featureItemCode4;
    @Excel(name = "特征项4描述")
    private String featureItemDesc4;
    @Excel(name = "特征值4编码")
    private String featureValueCode4;
    @Excel(name = "特征值4描述")
    private String featureValueDesc4;

    @Excel(name = "特征项5编码")
    private String featureItemCode5;
    @Excel(name = "特征项5描述")
    private String featureItemDesc5;
    @Excel(name = "特征值5编码")
    private String featureValueCode5;
    @Excel(name = "特征值5描述")
    private String featureValueDesc5;

    @Excel(name = "特征项6编码")
    private String featureItemCode6;
    @Excel(name = "特征项6描述")
    private String featureItemDesc6;
    @Excel(name = "特征值6编码")
    private String featureValueCode6;
    @Excel(name = "特征值6描述")
    private String featureValueDesc6;

    @Excel(name = "特征项7编码")
    private String featureItemCode7;
    @Excel(name = "特征项7描述")
    private String featureItemDesc7;
    @Excel(name = "特征值7编码")
    private String featureValueCode7;
    @Excel(name = "特征值7描述")
    private String featureValueDesc7;

    @Excel(name = "特征项8编码")
    private String featureItemCode8;
    @Excel(name = "特征项8描述")
    private String featureItemDesc8;
    @Excel(name = "特征值8编码")
    private String featureValueCode8;
    @Excel(name = "特征值8描述")
    private String featureValueDesc8;

    @Excel(name = "特征项9编码")
    private String featureItemCode9;
    @Excel(name = "特征项9描述")
    private String featureItemDesc9;
    @Excel(name = "特征值9编码")
    private String featureValueCode9;
    @Excel(name = "特征值9描述")
    private String featureValueDesc9;

    @Excel(name = "特征项10编码")
    private String featureItemCode10;
    @Excel(name = "特征项10描述")
    private String featureItemDesc10;
    @Excel(name = "特征值10编码")
    private String featureValueCode10;
    @Excel(name = "特征值10描述")
    private String featureValueDesc10;

    @Excel(name = "特征项11编码")
    private String featureItemCode11;
    @Excel(name = "特征项11描述")
    private String featureItemDesc11;
    @Excel(name = "特征值11编码")
    private String featureValueCode11;
    @Excel(name = "特征值11描述")
    private String featureValueDesc11;

    @Excel(name = "特征项12编码")
    private String featureItemCode12;
    @Excel(name = "特征项12描述")
    private String featureItemDesc12;
    @Excel(name = "特征值12编码")
    private String featureValueCode12;
    @Excel(name = "特征值12描述")
    private String featureValueDesc12;

    @Excel(name = "状态（0启用1冻结）")
    private String frozenStr;
    private Boolean frozen;
    private String voltageLevel;

    private List<MaterialFeatureVO> materialFeatureVOS = new CopyOnWriteArrayList<>();


    private MaterialFeatureVO materialFeatureVO1 = new MaterialFeatureVO();
    private MaterialFeatureVO materialFeatureVO2 = new MaterialFeatureVO();
    private MaterialFeatureVO materialFeatureVO3 = new MaterialFeatureVO();
    private MaterialFeatureVO materialFeatureVO4 = new MaterialFeatureVO();
    private MaterialFeatureVO materialFeatureVO5 = new MaterialFeatureVO();
    private MaterialFeatureVO materialFeatureVO6 = new MaterialFeatureVO();
    private MaterialFeatureVO materialFeatureVO7 = new MaterialFeatureVO();
    private MaterialFeatureVO materialFeatureVO8 = new MaterialFeatureVO();
    private MaterialFeatureVO materialFeatureVO9 = new MaterialFeatureVO();
    private MaterialFeatureVO materialFeatureVO10 = new MaterialFeatureVO();
    private MaterialFeatureVO materialFeatureVO11 = new MaterialFeatureVO();
    private MaterialFeatureVO materialFeatureVO12 = new MaterialFeatureVO();
    private static final String DEFAULT_VALUE = null;


    public List<MaterialFeatureVO> getMaterialFeatureVOS() {

        return materialFeatureVOS;
    }

    public Boolean getFrozen() {
        return frozen;
    }

    public String getVoltageLevel() {
        return voltageLevel;
    }

    public String getMaterialCode() {
        return materialCode;
    }

    public void setMaterialCode(String materialCode) {
        this.materialCode = materialCode;
    }

    public String getMaterialDesc() {
        return materialDesc;
    }

    public void setMaterialDesc(String materialDesc) {
        this.materialDesc = materialDesc;
    }

    public String getMaterialLongDesc() {
        return materialLongDesc;
    }

    public void setMaterialLongDesc(String materialLongDesc) {
        this.materialLongDesc = materialLongDesc;
    }

    public String getCategoryCode() {
        return categoryCode;
    }

    public void setCategoryCode(String categoryCode) {
        this.categoryCode = categoryCode;
    }

    public String getSubclassCode() {
        return subclassCode;
    }

    public void setSubclassCode(String subclassCode) {
        this.subclassCode = subclassCode;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getSubclassName() {
        return subclassName;
    }

    public void setSubclassName(String subclassName) {
        this.subclassName = subclassName;
    }

    public String getMajorCode() {
        return majorCode;
    }

    public void setMajorCode(String majorCode) {
        this.majorCode = majorCode;
    }

    public String getMajorDesc() {
        return majorDesc;
    }

    public void setMajorDesc(String majorDesc) {
        this.majorDesc = majorDesc;
    }

    public String getMediumCode() {
        return mediumCode;
    }

    public void setMediumCode(String mediumCode) {
        this.mediumCode = mediumCode;
    }

    public String getMediumDesc() {
        return mediumDesc;
    }

    public void setMediumDesc(String mediumDesc) {
        this.mediumDesc = mediumDesc;
    }

    public String getSmallCode() {
        return smallCode;
    }

    public void setSmallCode(String smallCode) {
        this.smallCode = smallCode;
    }

    public String getMatMinName() {
        return matMinName;
    }

    public void setMatMinName(String matMinName) {
        this.matMinName = matMinName;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getFeatureItemCode1() {
        return featureItemCode1;
    }

    public void setFeatureItemCode1(String featureItemCode1) {
        if (isEmpty(featureItemCode1)) {
            this.featureItemCode1 = DEFAULT_VALUE;
        }
        if (isNotEmpty(featureItemCode1)) {
            this.featureItemCode1 = featureItemCode1;
            setFeatureItemCode(featureItemCode1, 1);
        }
    }

    public String getFeatureItemDesc1() {
        return featureItemDesc1;
    }

    public void setFeatureItemDesc1(String featureItemDesc1) {
        if (isEmpty(featureItemDesc1)) {
            this.featureItemDesc1 = DEFAULT_VALUE;
        }
        if (isNotEmpty(featureItemDesc1)) {
            this.featureItemDesc1 = featureItemDesc1;
            setFeatureItemDesc(featureItemDesc1, 1);
        }
    }

    public String getFeatureValueCode1() {
        return featureValueCode1;
    }

    public void setFeatureValueCode1(String featureValueCode1) {
        if (isEmpty(featureValueCode1)) {
            this.featureValueCode1 = DEFAULT_VALUE;
        }
        if (isNotEmpty(featureValueCode1)) {
            this.featureValueCode1 = featureValueCode1;
            setFeatureValueCode(featureValueCode1, 1);
        }
    }

    public String getFeatureValueDesc1() {
        return featureValueDesc1;
    }

    public void setFeatureValueDesc1(String featureValueDesc1) {
        if (isEmpty(featureValueDesc1)) {
            this.featureValueDesc1 = DEFAULT_VALUE;
        }
        if (isNotEmpty(featureValueDesc1)) {
            this.featureValueDesc1 = featureValueDesc1;
            String voltageLevelStr = "";
            if (featureValueDesc1.toLowerCase().contains("kv")) {
                voltageLevelStr = featureValueDesc1.substring(2);
            }
            this.voltageLevel = voltageLevelStr;
            setFeatureValueDesc(featureValueDesc1, 1);
        }

    }

    private void setFeatureItemCode(String featureItemCode, int i) {
        switch (i) {
            case 1:
                materialFeatureVO1.setFeatureItemCode(featureItemCode);
                materialFeatureVOS.add(materialFeatureVO1);
                break;
            case 2:
                materialFeatureVO2.setFeatureItemCode(featureItemCode);
                materialFeatureVOS.add(materialFeatureVO2);
                break;
            case 3:
                materialFeatureVO3.setFeatureItemCode(featureItemCode);
                materialFeatureVOS.add(materialFeatureVO3);
                break;
            case 4:
                materialFeatureVO4.setFeatureItemCode(featureItemCode);
                materialFeatureVOS.add(materialFeatureVO4);
                break;
            case 5:
                materialFeatureVO5.setFeatureItemCode(featureItemCode);
                materialFeatureVOS.add(materialFeatureVO5);
                break;
            case 6:
                materialFeatureVO6.setFeatureItemCode(featureItemCode);
                materialFeatureVOS.add(materialFeatureVO6);
                break;
            case 7:
                materialFeatureVO7.setFeatureItemCode(featureItemCode);
                materialFeatureVOS.add(materialFeatureVO7);
                break;
            case 8:
                materialFeatureVO8.setFeatureItemCode(featureItemCode);
                materialFeatureVOS.add(materialFeatureVO8);
                break;
            case 9:
                materialFeatureVO9.setFeatureItemCode(featureItemCode);
                materialFeatureVOS.add(materialFeatureVO9);
                break;
            case 10:
                materialFeatureVO10.setFeatureItemCode(featureItemCode);
                materialFeatureVOS.add(materialFeatureVO10);
                break;
            case 11:
                materialFeatureVO11.setFeatureItemCode(featureItemCode);
                materialFeatureVOS.add(materialFeatureVO11);
                break;
            case 12:
                materialFeatureVO12.setFeatureItemCode(featureItemCode);
                materialFeatureVOS.add(materialFeatureVO12);
                break;
            default:
                break;
        }
    }

    private void setFeatureItemDesc(String featureItemDesc, int i) {
        switch (i) {
            case 1:
                materialFeatureVO1.setFeatureItemDesc(featureItemDesc);
                break;
            case 2:
                materialFeatureVO2.setFeatureItemDesc(featureItemDesc);
                break;
            case 3:
                materialFeatureVO3.setFeatureItemDesc(featureItemDesc);
                break;
            case 4:
                materialFeatureVO4.setFeatureItemDesc(featureItemDesc);
                break;
            case 5:
                materialFeatureVO5.setFeatureItemDesc(featureItemDesc);
                break;
            case 6:
                materialFeatureVO6.setFeatureItemDesc(featureItemDesc);
                break;
            case 7:
                materialFeatureVO7.setFeatureItemDesc(featureItemDesc);
                break;
            case 8:
                materialFeatureVO8.setFeatureItemDesc(featureItemDesc);
                break;
            case 9:
                materialFeatureVO9.setFeatureItemDesc(featureItemDesc);
                break;
            case 10:
                materialFeatureVO10.setFeatureItemDesc(featureItemDesc);
                break;
            case 11:
                materialFeatureVO11.setFeatureItemDesc(featureItemDesc);
                break;
            case 12:
                materialFeatureVO12.setFeatureItemDesc(featureItemDesc);
                break;
            default:
                break;
        }

    }

    private void setFeatureValueCode(String featureValueCode, int i) {
        switch (i) {
            case 1:
                materialFeatureVO1.setFeatureValueCode(featureValueCode);
                break;
            case 2:
                materialFeatureVO2.setFeatureValueCode(featureValueCode);
                break;
            case 3:
                materialFeatureVO3.setFeatureValueCode(featureValueCode);
                break;
            case 4:
                materialFeatureVO4.setFeatureValueCode(featureValueCode);
                break;
            case 5:
                materialFeatureVO5.setFeatureValueCode(featureValueCode);
                break;
            case 6:
                materialFeatureVO6.setFeatureValueCode(featureValueCode);
                break;
            case 7:
                materialFeatureVO7.setFeatureValueCode(featureValueCode);
                break;
            case 8:
                materialFeatureVO8.setFeatureValueCode(featureValueCode);
                break;
            case 9:
                materialFeatureVO9.setFeatureValueCode(featureValueCode);
                break;
            case 10:
                materialFeatureVO10.setFeatureValueCode(featureValueCode);
                break;
            case 11:
                materialFeatureVO11.setFeatureValueCode(featureValueCode);
                break;
            case 12:
                materialFeatureVO12.setFeatureValueCode(featureValueCode);
                break;
            default:
                break;
        }
    }

    private void setFeatureValueDesc(String featureValueDesc, int i) {
        switch (i) {
            case 1:
                materialFeatureVO1.setFeatureValueDesc(featureValueDesc);

                break;
            case 2:
                materialFeatureVO2.setFeatureValueDesc(featureValueDesc);

                break;
            case 3:
                materialFeatureVO3.setFeatureValueDesc(featureValueDesc);

                break;
            case 4:
                materialFeatureVO4.setFeatureValueDesc(featureValueDesc);

                break;
            case 5:
                materialFeatureVO5.setFeatureValueDesc(featureValueDesc);

                break;
            case 6:
                materialFeatureVO6.setFeatureValueDesc(featureValueDesc);

                break;
            case 7:
                materialFeatureVO7.setFeatureValueDesc(featureValueDesc);

                break;
            case 8:
                materialFeatureVO8.setFeatureValueDesc(featureValueDesc);

                break;
            case 9:
                materialFeatureVO9.setFeatureValueDesc(featureValueDesc);

                break;
            case 10:
                materialFeatureVO10.setFeatureValueDesc(featureValueDesc);

                break;
            case 11:
                materialFeatureVO11.setFeatureValueDesc(featureValueDesc);

                break;
            case 12:
                materialFeatureVO12.setFeatureValueDesc(featureValueDesc);

                break;
            default:
                break;
        }

    }

    private boolean isEmpty(String param) {
        return null == param || param.trim().length() == 0;
    }

    private boolean isNotEmpty(String param) {
        return null != param && param.trim().length() > 0;
    }


    public String getFeatureItemCode2() {
        return featureItemCode2;
    }

    public void setFeatureItemCode2(String featureItemCode2) {
        if (isEmpty(featureItemCode2)) {
            this.featureItemCode2 = DEFAULT_VALUE;
        }
        if (isNotEmpty(featureItemCode2)) {
            this.featureItemCode2 = featureItemCode2;
            setFeatureItemCode(featureItemCode2, 2);
        }
    }

    public String getFeatureItemDesc2() {
        return featureItemDesc2;
    }

    public void setFeatureItemDesc2(String featureItemDesc2) {
        if (isEmpty(featureItemDesc2)) {
            this.featureItemDesc2 = DEFAULT_VALUE;
        }
        if (isNotEmpty(featureItemDesc2)) {
            this.featureItemDesc2 = featureItemDesc2;
            setFeatureItemDesc(featureItemDesc2, 2);
        }
    }

    public String getFeatureValueCode2() {
        return featureValueCode2;
    }

    public void setFeatureValueCode2(String featureValueCode2) {
        if (isEmpty(featureValueCode2)) {
            this.featureValueCode2 = DEFAULT_VALUE;
        }
        if (isNotEmpty(featureValueCode2)) {
            this.featureValueCode2 = featureValueCode2;
            setFeatureValueCode(featureValueCode2, 2);
        }
    }

    public String getFeatureValueDesc2() {
        return featureValueDesc2;
    }

    public void setFeatureValueDesc2(String featureValueDesc2) {
        if (isEmpty(featureValueDesc2)) {
            this.featureValueDesc2 = DEFAULT_VALUE;
        }
        if (isNotEmpty(featureValueDesc2)) {
            this.featureValueDesc2 = featureValueDesc2;
            setFeatureValueDesc(featureValueDesc2, 2);
        }

    }

    public String getFeatureItemCode3() {
        return featureItemCode3;
    }

    public void setFeatureItemCode3(String featureItemCode3) {
        if (isEmpty(featureItemCode3)) {
            this.featureItemCode3 = DEFAULT_VALUE;
        }
        if (isNotEmpty(featureItemCode3)) {
            this.featureItemCode3 = featureItemCode3;
            setFeatureItemCode(featureItemCode3, 3);
        }
    }

    public String getFeatureItemDesc3() {
        return featureItemDesc3;
    }

    public void setFeatureItemDesc3(String featureItemDesc3) {
        if (isEmpty(featureItemDesc3)) {
            this.featureItemDesc3 = DEFAULT_VALUE;
        }
        if (isNotEmpty(featureItemDesc3)) {
            this.featureItemDesc3 = featureItemDesc3;
            setFeatureItemDesc(featureItemDesc3, 3);
        }
    }

    public String getFeatureValueCode3() {
        return featureValueCode3;
    }

    public void setFeatureValueCode3(String featureValueCode3) {
        if (isEmpty(featureValueCode3)) {
            this.featureValueCode3 = DEFAULT_VALUE;
        }
        if (isNotEmpty(featureValueCode3)) {
            this.featureValueCode3 = featureValueCode3;
            setFeatureValueCode(featureValueCode3, 3);
        }
    }

    public String getFeatureValueDesc3() {
        return featureValueDesc3;
    }

    public void setFeatureValueDesc3(String featureValueDesc3) {
        if (isEmpty(featureValueDesc3)) {
            this.featureValueDesc3 = DEFAULT_VALUE;
        }
        if (isNotEmpty(featureValueDesc3)) {
            this.featureValueDesc3 = featureValueDesc3;
            setFeatureValueDesc(featureValueDesc3, 3);
        }
    }

    public String getFeatureItemCode4() {
        return featureItemCode4;
    }

    public void setFeatureItemCode4(String featureItemCode4) {
        if (isEmpty(featureItemCode4)) {
            this.featureItemCode4 = DEFAULT_VALUE;
        }
        if (isNotEmpty(featureItemCode4)) {
            this.featureItemCode4 = featureItemCode4;
            setFeatureItemCode(featureItemCode4, 4);
        }
    }

    public String getFeatureItemDesc4() {
        return featureItemDesc4;
    }

    public void setFeatureItemDesc4(String featureItemDesc4) {
        if (isEmpty(featureItemDesc4)) {
            this.featureItemDesc4 = DEFAULT_VALUE;
        }
        if (isNotEmpty(featureItemDesc4)) {
            this.featureItemDesc4 = featureItemDesc4;
            setFeatureItemDesc(featureItemDesc4, 4);
        }
    }

    public String getFeatureValueCode4() {
        return featureValueCode4;
    }

    public void setFeatureValueCode4(String featureValueCode4) {
        if (isEmpty(featureValueCode4)) {
            this.featureValueCode4 = DEFAULT_VALUE;
        }
        if (isNotEmpty(featureValueCode4)) {
            this.featureValueCode4 = featureValueCode4;
            setFeatureValueCode(featureValueCode4, 4);
        }
    }

    public String getFeatureValueDesc4() {
        return featureValueDesc4;
    }

    public void setFeatureValueDesc4(String featureValueDesc4) {
        if (isEmpty(featureValueDesc4)) {
            this.featureValueDesc4 = DEFAULT_VALUE;
        }
        if (isNotEmpty(featureValueDesc4)) {
            this.featureValueDesc4 = featureValueDesc4;
            setFeatureValueDesc(featureValueDesc4, 4);
        }
    }

    public String getFeatureItemCode5() {
        return featureItemCode5;
    }

    public void setFeatureItemCode5(String featureItemCode5) {
        if (isEmpty(featureItemCode5)) {
            this.featureItemCode5 = DEFAULT_VALUE;
        }
        if (isNotEmpty(featureItemCode5)) {
            this.featureItemCode5 = featureItemCode5;
            setFeatureItemCode(featureItemCode5, 5);
        }
    }

    public String getFeatureItemDesc5() {
        return featureItemDesc5;
    }

    public void setFeatureItemDesc5(String featureItemDesc5) {
        if (isEmpty(featureItemDesc5)) {
            this.featureItemDesc5 = DEFAULT_VALUE;
        }
        if (isNotEmpty(featureItemDesc5)) {
            this.featureItemDesc5 = featureItemDesc5;
            setFeatureItemDesc(featureItemDesc5, 5);
        }
    }

    public String getFeatureValueCode5() {
        return featureValueCode5;
    }

    public void setFeatureValueCode5(String featureValueCode5) {
        if (isEmpty(featureValueCode5)) {
            this.featureValueCode5 = DEFAULT_VALUE;
        }
        if (isNotEmpty(featureValueCode5)) {
            this.featureValueCode5 = featureValueCode5;
            setFeatureValueCode(featureValueCode5, 5);
        }
    }

    public String getFeatureValueDesc5() {
        return featureValueDesc5;
    }

    public void setFeatureValueDesc5(String featureValueDesc5) {
        if (isEmpty(featureValueDesc5)) {
            this.featureValueDesc5 = DEFAULT_VALUE;
        }
        if (isNotEmpty(featureValueDesc5)) {
            this.featureValueDesc5 = featureValueDesc5;
            setFeatureValueDesc(featureValueDesc5, 5);
        }
    }

    public String getFeatureItemCode6() {
        return featureItemCode6;
    }

    public void setFeatureItemCode6(String featureItemCode6) {
        if (isEmpty(featureItemCode6)) {
            this.featureItemCode6 = DEFAULT_VALUE;
        }
        if (isNotEmpty(featureItemCode6)) {
            this.featureItemCode6 = featureItemCode6;
            setFeatureItemCode(featureItemCode6, 6);
        }
    }

    public String getFeatureItemDesc6() {
        return featureItemDesc6;
    }

    public void setFeatureItemDesc6(String featureItemDesc6) {
        if (isEmpty(featureItemDesc6)) {
            this.featureItemDesc6 = DEFAULT_VALUE;
        }
        if (isNotEmpty(featureItemDesc6)) {
            this.featureItemDesc6 = featureItemDesc6;
            setFeatureItemDesc(featureItemDesc6, 6);
        }
    }

    public String getFeatureValueCode6() {
        return featureValueCode6;
    }

    public void setFeatureValueCode6(String featureValueCode6) {
        if (isEmpty(featureValueCode6)) {
            this.featureValueCode6 = DEFAULT_VALUE;
        }
        if (isNotEmpty(featureValueCode6)) {
            this.featureValueCode6 = featureValueCode6;
            setFeatureValueCode(featureValueCode6, 6);
        }
    }

    public String getFeatureValueDesc6() {
        return featureValueDesc6;
    }

    public void setFeatureValueDesc6(String featureValueDesc6) {
        if (isEmpty(featureValueDesc6)) {
            this.featureValueDesc6 = DEFAULT_VALUE;
        }
        if (isNotEmpty(featureValueDesc6)) {
            this.featureValueDesc6 = featureValueDesc6;
            setFeatureValueDesc(featureValueDesc6, 6);
        }
    }

    public String getFeatureItemCode7() {
        return featureItemCode7;
    }

    public void setFeatureItemCode7(String featureItemCode7) {
        if (isEmpty(featureItemCode7)) {
            this.featureItemCode7 = DEFAULT_VALUE;
        }
        if (isNotEmpty(featureItemCode7)) {
            this.featureItemCode7 = featureItemCode7;
            setFeatureItemCode(featureItemCode7, 7);
        }
    }

    public String getFeatureItemDesc7() {
        return featureItemDesc7;
    }

    public void setFeatureItemDesc7(String featureItemDesc7) {
        if (isEmpty(featureItemDesc7)) {
            this.featureItemDesc7 = DEFAULT_VALUE;
        }
        if (isNotEmpty(featureItemDesc7)) {
            this.featureItemDesc7 = featureItemDesc7;
            setFeatureItemDesc(featureItemDesc7, 7);
        }
    }

    public String getFeatureValueCode7() {
        return featureValueCode7;
    }

    public void setFeatureValueCode7(String featureValueCode7) {
        if (isEmpty(featureValueCode7)) {
            this.featureValueCode7 = DEFAULT_VALUE;
        }
        if (isNotEmpty(featureValueCode7)) {
            this.featureValueCode7 = featureValueCode7;
            setFeatureValueCode(featureValueCode7, 7);
        }
    }

    public String getFeatureValueDesc7() {
        return featureValueDesc7;
    }

    public void setFeatureValueDesc7(String featureValueDesc7) {
        if (isEmpty(featureValueDesc7)) {
            this.featureValueDesc7 = DEFAULT_VALUE;
        }
        if (isNotEmpty(featureValueDesc7)) {
            this.featureValueDesc7 = featureValueDesc7;
            setFeatureValueDesc(featureValueDesc7, 7);
        }
    }

    public String getFeatureItemCode8() {
        return featureItemCode8;
    }

    public void setFeatureItemCode8(String featureItemCode8) {
        if (isEmpty(featureItemCode8)) {
            this.featureItemCode8 = DEFAULT_VALUE;
        }
        if (isNotEmpty(featureItemCode8)) {
            this.featureItemCode8 = featureItemCode8;
            setFeatureItemCode(featureItemCode8, 8);
        }
    }

    public String getFeatureItemDesc8() {
        return featureItemDesc8;
    }

    public void setFeatureItemDesc8(String featureItemDesc8) {
        if (isEmpty(featureItemDesc8)) {
            this.featureItemDesc8 = DEFAULT_VALUE;
        }
        if (isNotEmpty(featureItemDesc8)) {
            this.featureItemDesc8 = featureItemDesc8;
            setFeatureItemDesc(featureItemDesc8, 8);
        }
    }

    public String getFeatureValueCode8() {
        return featureValueCode8;
    }

    public void setFeatureValueCode8(String featureValueCode8) {
        if (isEmpty(featureValueCode8)) {
            this.featureValueCode8 = DEFAULT_VALUE;
        }
        if (isNotEmpty(featureValueCode8)) {
            this.featureValueCode8 = featureValueCode8;
            setFeatureValueCode(featureValueCode8, 8);
        }
    }

    public String getFeatureValueDesc8() {
        return featureValueDesc8;
    }

    public void setFeatureValueDesc8(String featureValueDesc8) {
        if (isEmpty(featureValueDesc8)) {
            this.featureValueDesc8 = DEFAULT_VALUE;
        }
        if (isNotEmpty(featureValueDesc8)) {
            this.featureValueDesc8 = featureValueDesc8;
            setFeatureValueDesc(featureValueDesc8, 8);
        }
    }

    public String getFeatureItemCode9() {
        return featureItemCode9;
    }

    public void setFeatureItemCode9(String featureItemCode9) {
        if (isEmpty(featureItemCode9)) {
            this.featureItemCode9 = DEFAULT_VALUE;
        }
        if (isNotEmpty(featureItemCode9)) {
            this.featureItemCode9 = featureItemCode9;
            setFeatureItemCode(featureItemCode9, 9);
        }
    }

    public String getFeatureItemDesc9() {
        return featureItemDesc9;
    }

    public void setFeatureItemDesc9(String featureItemDesc9) {
        if (isEmpty(featureItemDesc9)) {
            this.featureItemDesc9 = DEFAULT_VALUE;
        }
        if (isNotEmpty(featureItemDesc9)) {
            this.featureItemDesc9 = featureItemDesc9;
            setFeatureItemDesc(featureItemDesc9, 9);
        }
    }

    public String getFeatureValueCode9() {
        return featureValueCode9;
    }

    public void setFeatureValueCode9(String featureValueCode9) {
        if (isEmpty(featureValueCode9)) {
            this.featureValueCode9 = DEFAULT_VALUE;
        }
        if (isNotEmpty(featureValueCode9)) {
            this.featureValueCode9 = featureValueCode9;
            setFeatureValueCode(featureValueCode9, 9);
        }
    }

    public String getFeatureValueDesc9() {
        return featureValueDesc9;
    }

    public void setFeatureValueDesc9(String featureValueDesc9) {
        if (isEmpty(featureValueDesc9)) {
            this.featureValueDesc9 = DEFAULT_VALUE;
        }
        if (isNotEmpty(featureValueDesc9)) {
            this.featureValueDesc9 = featureValueDesc9;
            setFeatureValueDesc(featureValueDesc9, 9);
        }
    }

    public String getFeatureItemCode10() {
        return featureItemCode10;
    }

    public void setFeatureItemCode10(String featureItemCode10) {
        if (isEmpty(featureItemCode10)) {
            this.featureItemCode10 = DEFAULT_VALUE;
        }
        if (isNotEmpty(featureItemCode10)) {
            this.featureItemCode10 = featureItemCode10;
            setFeatureItemCode(featureItemCode10, 10);
        }
    }

    public String getFeatureItemDesc10() {
        return featureItemDesc10;
    }

    public void setFeatureItemDesc10(String featureItemDesc10) {
        if (isEmpty(featureItemDesc10)) {
            this.featureItemDesc10 = DEFAULT_VALUE;
        }
        if (isNotEmpty(featureItemDesc10)) {
            this.featureItemDesc10 = featureItemDesc10;
            setFeatureItemDesc(featureItemDesc10, 10);
        }
    }

    public String getFeatureValueCode10() {
        return featureValueCode10;
    }

    public void setFeatureValueCode10(String featureValueCode10) {
        if (isEmpty(featureValueCode10)) {
            this.featureValueCode10 = DEFAULT_VALUE;
        }
        if (isNotEmpty(featureValueCode10)) {
            this.featureValueCode10 = featureValueCode10;
            setFeatureValueCode(featureValueCode10, 10);
        }
    }

    public String getFeatureValueDesc10() {
        return featureValueDesc10;
    }

    public void setFeatureValueDesc10(String featureValueDesc10) {
        if (isEmpty(featureValueDesc10)) {
            this.featureValueDesc10 = DEFAULT_VALUE;
        }
        if (isNotEmpty(featureValueDesc10)) {
            this.featureValueDesc10 = featureValueDesc10;
            setFeatureValueDesc(featureValueDesc10, 10);
        }
    }

    public String getFeatureItemCode11() {
        return featureItemCode11;
    }

    public void setFeatureItemCode11(String featureItemCode11) {
        if (isEmpty(featureItemCode11)) {
            this.featureItemCode11 = DEFAULT_VALUE;
        }
        if (isNotEmpty(featureItemCode11)) {
            this.featureItemCode11 = featureItemCode11;
            setFeatureItemCode(featureItemCode11, 11);
        }
    }

    public String getFeatureItemDesc11() {
        return featureItemDesc11;
    }

    public void setFeatureItemDesc11(String featureItemDesc11) {
        if (isEmpty(featureItemDesc11)) {
            this.featureItemDesc11 = DEFAULT_VALUE;
        }
        if (isNotEmpty(featureItemDesc11)) {
            this.featureItemDesc11 = featureItemDesc11;
            setFeatureItemDesc(featureItemDesc11, 11);
        }
    }

    public String getFeatureValueCode11() {
        return featureValueCode11;
    }

    public void setFeatureValueCode11(String featureValueCode11) {
        if (isEmpty(featureValueCode11)) {
            this.featureValueCode11 = DEFAULT_VALUE;
        }
        if (isNotEmpty(featureValueCode11)) {
            this.featureValueCode11 = featureValueCode11;
            setFeatureValueCode(featureValueCode11, 11);
        }
    }

    public String getFeatureValueDesc11() {
        return featureValueDesc11;
    }

    public void setFeatureValueDesc11(String featureValueDesc11) {
        if (isEmpty(featureValueDesc11)) {
            this.featureValueDesc11 = DEFAULT_VALUE;
        }
        if (isNotEmpty(featureValueDesc11)) {
            this.featureValueDesc11 = featureValueDesc11;
            setFeatureValueDesc(featureValueDesc11, 11);
        }
    }

    public String getFeatureItemCode12() {
        return featureItemCode12;
    }

    public void setFeatureItemCode12(String featureItemCode12) {
        if (isEmpty(featureItemCode12)) {
            this.featureItemCode12 = DEFAULT_VALUE;
        }
        if (isNotEmpty(featureItemCode12)) {
            this.featureItemCode12 = featureItemCode12;
            setFeatureItemCode(featureItemCode12, 12);
        }
    }

    public String getFeatureItemDesc12() {
        return featureItemDesc12;
    }

    public void setFeatureItemDesc12(String featureItemDesc12) {
        if (isEmpty(featureItemDesc12)) {
            this.featureItemDesc12 = DEFAULT_VALUE;
        }
        if (isNotEmpty(featureItemDesc12)) {
            this.featureItemDesc12 = featureItemDesc12;
            setFeatureItemDesc(featureItemDesc12, 12);
        }
    }

    public String getFeatureValueCode12() {
        return featureValueCode12;
    }

    public void setFeatureValueCode12(String featureValueCode12) {
        if (isEmpty(featureValueCode12)) {
            this.featureValueCode12 = DEFAULT_VALUE;
        }
        if (isNotEmpty(featureValueCode12)) {
            this.featureValueCode12 = featureValueCode12;
            setFeatureValueCode(featureValueCode12, 12);
        }
    }

    public String getFeatureValueDesc12() {
        return featureValueDesc12;
    }

    public void setFeatureValueDesc12(String featureValueDesc12) {
        if (isEmpty(featureValueDesc12)) {
            this.featureValueDesc12 = DEFAULT_VALUE;
        }
        if (isNotEmpty(featureValueDesc12)) {
            this.featureValueDesc12 = featureValueDesc12;
            setFeatureValueDesc(featureValueDesc12, 12);
        }
    }

    public String getFrozenStr() {
        return frozenStr;
    }

    public void setFrozenStr(String frozenStr) {
        this.frozenStr = frozenStr;
        setFrozen(frozenStr);
    }

    private void setFrozen(String frozenStr) {
        Boolean frozen = null;
        if ("启用".equals(frozenStr)) {
            frozen = true;
        }
        if ("冻结".equals(frozenStr)) {
            frozen = false;
        }
        this.frozen = frozen;
    }

    public MaterialExcelVO() {
    }

    @Override
    public String toString() {
        return "MaterialExcelVO{" +
                "materialCode='" + materialCode + '\'' +
                ", materialDesc='" + materialDesc + '\'' +
                ", materialLongDesc='" + materialLongDesc + '\'' +
                ", categoryCode='" + categoryCode + '\'' +
                ", subclassCode='" + subclassCode + '\'' +
                ", categoryName='" + categoryName + '\'' +
                ", subclassName='" + subclassName + '\'' +
                ", majorCode='" + majorCode + '\'' +
                ", majorDesc='" + majorDesc + '\'' +
                ", mediumCode='" + mediumCode + '\'' +
                ", mediumDesc='" + mediumDesc + '\'' +
                ", smallCode='" + smallCode + '\'' +
                ", matMinName='" + matMinName + '\'' +
                ", unit='" + unit + '\'' +
                ", featureItemCode1='" + featureItemCode1 + '\'' +
                ", featureItemDesc1='" + featureItemDesc1 + '\'' +
                ", featureValueCode1='" + featureValueCode1 + '\'' +
                ", featureValueDesc1='" + featureValueDesc1 + '\'' +
                ", featureItemCode2='" + featureItemCode2 + '\'' +
                ", featureItemDesc2='" + featureItemDesc2 + '\'' +
                ", featureValueCode2='" + featureValueCode2 + '\'' +
                ", featureValueDesc2='" + featureValueDesc2 + '\'' +
                ", featureItemCode3='" + featureItemCode3 + '\'' +
                ", featureItemDesc3='" + featureItemDesc3 + '\'' +
                ", featureValueCode3='" + featureValueCode3 + '\'' +
                ", featureValueDesc3='" + featureValueDesc3 + '\'' +
                ", featureItemCode4='" + featureItemCode4 + '\'' +
                ", featureItemDesc4='" + featureItemDesc4 + '\'' +
                ", featureValueCode4='" + featureValueCode4 + '\'' +
                ", featureValueDesc4='" + featureValueDesc4 + '\'' +
                ", featureItemCode5='" + featureItemCode5 + '\'' +
                ", featureItemDesc5='" + featureItemDesc5 + '\'' +
                ", featureValueCode5='" + featureValueCode5 + '\'' +
                ", featureValueDesc5='" + featureValueDesc5 + '\'' +
                ", featureItemCode6='" + featureItemCode6 + '\'' +
                ", featureItemDesc6='" + featureItemDesc6 + '\'' +
                ", featureValueCode6='" + featureValueCode6 + '\'' +
                ", featureValueDesc6='" + featureValueDesc6 + '\'' +
                ", featureItemCode7='" + featureItemCode7 + '\'' +
                ", featureItemDesc7='" + featureItemDesc7 + '\'' +
                ", featureValueCode7='" + featureValueCode7 + '\'' +
                ", featureValueDesc7='" + featureValueDesc7 + '\'' +
                ", featureItemCode8='" + featureItemCode8 + '\'' +
                ", featureItemDesc8='" + featureItemDesc8 + '\'' +
                ", featureValueCode8='" + featureValueCode8 + '\'' +
                ", featureValueDesc8='" + featureValueDesc8 + '\'' +
                ", featureItemCode9='" + featureItemCode9 + '\'' +
                ", featureItemDesc9='" + featureItemDesc9 + '\'' +
                ", featureValueCode9='" + featureValueCode9 + '\'' +
                ", featureValueDesc9='" + featureValueDesc9 + '\'' +
                ", featureItemCode10='" + featureItemCode10 + '\'' +
                ", featureItemDesc10='" + featureItemDesc10 + '\'' +
                ", featureValueCode10='" + featureValueCode10 + '\'' +
                ", featureValueDesc10='" + featureValueDesc10 + '\'' +
                ", featureItemCode11='" + featureItemCode11 + '\'' +
                ", featureItemDesc11='" + featureItemDesc11 + '\'' +
                ", featureValueCode11='" + featureValueCode11 + '\'' +
                ", featureValueDesc11='" + featureValueDesc11 + '\'' +
                ", featureItemCode12='" + featureItemCode12 + '\'' +
                ", featureItemDesc12='" + featureItemDesc12 + '\'' +
                ", featureValueCode12='" + featureValueCode12 + '\'' +
                ", featureValueDesc12='" + featureValueDesc12 + '\'' +
                ", frozenStr='" + frozenStr + '\'' +
                ", frozen=" + frozen +
                ", voltageLevel='" + voltageLevel + '\'' +
                ", materialFeatureVOS=" + materialFeatureVOS +
                ", materialFeatureVO1=" + materialFeatureVO1 +
                ", materialFeatureVO2=" + materialFeatureVO2 +
                ", materialFeatureVO3=" + materialFeatureVO3 +
                ", materialFeatureVO4=" + materialFeatureVO4 +
                ", materialFeatureVO5=" + materialFeatureVO5 +
                ", materialFeatureVO6=" + materialFeatureVO6 +
                ", materialFeatureVO7=" + materialFeatureVO7 +
                ", materialFeatureVO8=" + materialFeatureVO8 +
                ", materialFeatureVO9=" + materialFeatureVO9 +
                ", materialFeatureVO10=" + materialFeatureVO10 +
                ", materialFeatureVO11=" + materialFeatureVO11 +
                ", materialFeatureVO12=" + materialFeatureVO12 +
                '}';
    }
}
