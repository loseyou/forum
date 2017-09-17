package com.lose.forum.model;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
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
public class Attention implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("user_id")
	private Integer userId;
	@TableField("attention_user_id")
	private Integer attentionUserId;


}
