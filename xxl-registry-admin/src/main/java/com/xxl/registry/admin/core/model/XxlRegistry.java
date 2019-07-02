package com.xxl.registry.admin.core.model;

import java.util.List;

/**
 * @author xuxueli 2018-11-23
 */
public class XxlRegistry {

    private int id;
    private String biz;         // 业务标识
    private String env;         // 环境标识
    private String key;         // 注册Key
    private String data;        // 注册Value有效数据，是XxlRegistryData的data数据的整合。即一个XxlRegistry对应多个XxlRegistryData
    private int status;         // 状态：0-正常、1-锁定、2-禁用

    // plugin
    private List<String> dataList;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBiz() {
        return biz;
    }

    public void setBiz(String biz) {
        this.biz = biz;
    }

    public String getEnv() {
        return env;
    }

    public void setEnv(String env) {
        this.env = env;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public List<String> getDataList() {
        return dataList;
    }

    public void setDataList(List<String> dataList) {
        this.dataList = dataList;
    }
}
