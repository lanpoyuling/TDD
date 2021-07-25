package com.example.tdd.vo;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;

/**
 * @ClassName MaterialFeatureVO
 * @Description 物资特征VO
 * @Author 10932
 * @Date 7/21/2021 5:22 PM
 **/
public class MaterialFeatureVO {
    private Long id;

    /**
     * 特征项编码
     */
    private String featureItemCode;

    /**
     * 特征项描述
     */
    private String featureItemDesc;

    /**
     * 特征值编码
     */
    private String featureValueCode;

    /**
     * 特征值描述
     */
    private String featureValueDesc;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFeatureItemCode() {
        return featureItemCode;
    }

    public void setFeatureItemCode(String featureItemCode) {
        this.featureItemCode = featureItemCode;
    }

    public String getFeatureItemDesc() {
        return featureItemDesc;
    }

    public void setFeatureItemDesc(String featureItemDesc) {
        this.featureItemDesc = featureItemDesc;
    }

    public String getFeatureValueCode() {
        return featureValueCode;
    }

    public void setFeatureValueCode(String featureValueCode) {
        this.featureValueCode = featureValueCode;
    }

    public String getFeatureValueDesc() {
        return featureValueDesc;
    }

    public void setFeatureValueDesc(String featureValueDesc) {
        this.featureValueDesc = featureValueDesc;
    }

    @Override
    public String toString() {
        return "MaterialFeatureVO{" +
                "id=" + id +
                ", featureItemCode='" + featureItemCode + '\'' +
                ", featureItemDesc='" + featureItemDesc + '\'' +
                ", featureValueCode='" + featureValueCode + '\'' +
                ", featureValueDesc='" + featureValueDesc + '\'' +
                '}';
    }
}
