package com.mp.enums;

import com.baomidou.mybatisplus.core.enums.IEnum;

public enum  status   {
    PRIMARY(1, "小学"),
    SECONDORY(2, "中学"),
    HIGH(3, "高中");
    private int code;
    private String descp;
    status(int code, String descp) {
        this.code = code;
        this.descp = descp;
    }

}
