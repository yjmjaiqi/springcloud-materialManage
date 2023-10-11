package com.example.commons.entity;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;

import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @TableName image
 */
@TableName(value ="image")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(value="图片对象模型")
public class Image implements Serializable {
    /**
     *
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 图片地址
     */
    private String imgUrl;

    /**
     * 图片大小
     */
    private long imgSize;

    /**
     * 图片类型
     */
    private String imgType;


    /**
     * 逻辑删除(0-未删除，1-删除)
     */
    private Integer isDel;

    /**
     * 创建时间
     */
    private Date createTime;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}