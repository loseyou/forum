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
@TableName("artcle_like")
public class ArtcleLike implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 文章主键
     */
    @TableId("article_id")
	private Integer articleId;
    /**
     * 用户主键
     */
	@TableField("user_id")
	private Integer userId;


}
