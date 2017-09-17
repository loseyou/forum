package com.lose.forum.model;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

import com.baomidou.mybatisplus.annotations.Version;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 
 * @author lose
 * @since 2017-09-16
 */
@Data
@Accessors(chain = true)
@TableName("tag_like")
public class TagLike implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("tag_id")
	private Integer tagId;
	@TableField("user_id")
	private Integer userId;


}
