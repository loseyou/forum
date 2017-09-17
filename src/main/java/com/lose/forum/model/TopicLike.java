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
@TableName("topic_like")
public class TopicLike implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("topic_id")
	private Integer topicId;
	@TableField("user_id")
	private Integer userId;


}
