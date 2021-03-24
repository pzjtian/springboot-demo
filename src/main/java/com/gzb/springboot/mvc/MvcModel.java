package com.gzb.springboot.mvc;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class MvcModel {

    private String modelName;
    private Integer modelType;

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public Integer getModelType() {
        return modelType;
    }

    public void setModelType(Integer modelType) {
        this.modelType = modelType;
    }
}
