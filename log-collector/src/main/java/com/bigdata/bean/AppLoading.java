package com.bigdata.bean;

public class AppLoading {
    private String action; //动作 开始加载=1 加载成功=2 加载失败=3
    private String loading_time; //加载时长，计算下拉开始到接口返回的时间
    private String loading_way; //加载类型
    private String extend1; //扩展字段
    private String extend2; //扩展字段
    private String type; //加载类型
    private String type1; //加载失败码

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getLoading_time() {
        return loading_time;
    }

    public void setLoading_time(String loading_time) {
        this.loading_time = loading_time;
    }

    public String getLoading_way() {
        return loading_way;
    }

    public void setLoading_way(String loading_way) {
        this.loading_way = loading_way;
    }

    public String getExtend1() {
        return extend1;
    }

    public void setExtend1(String extend1) {
        this.extend1 = extend1;
    }

    public String getExtend2() {
        return extend2;
    }

    public void setExtend2(String extend2) {
        this.extend2 = extend2;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType1() {
        return type1;
    }

    public void setType1(String type1) {
        this.type1 = type1;
    }
}
