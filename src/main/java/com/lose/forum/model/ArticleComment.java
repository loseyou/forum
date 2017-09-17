package com.lose.forum.model;

import com.baomidou.mybatisplus.enums.IdType;
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
@TableName("article_comment")
public class ArticleComment implements Serializable {

    private static final long serialVersionUID = 1L;

	@TableId(value="id", type= IdType.AUTO)
	private Integer id;
	@TableField("article_id")
	private Integer articleId;
	@TableField("user_id")
	private Integer userId;
	private String name;
	@TableField("comment_id")
	private Integer commentId;


}
