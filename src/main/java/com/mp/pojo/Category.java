package com.mp.pojo;


import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

import java.util.Date;

@Data
@TableName("category")
public class Category {

    @TableId(value = "id", type = IdType.ID_WORKER)
    private Long id;
    @TableField("categoryName")
    private String categoryName;
    @TableField("categoryPic")
    private String categoryPic;
    @TableField("updateUser")
    private String updateUser;
    @TableField(value = "updateDate",fill = FieldFill.INSERT_UPDATE)
    private Date updateDate;


    //@TableField(exist = false)
    /*
    * 不进行序列化
    * */
    @TableField(exist = false,condition = SqlCondition.LIKE)
    private String text;

    @TableLogic
    @TableField("deleted")
    private Integer deleted;

}
