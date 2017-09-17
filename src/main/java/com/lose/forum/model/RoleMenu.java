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
 * @since 2017-09-17
 */
@Data
@Accessors(chain = true)
@TableName("role_menu")
public class RoleMenu implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("role_id")
	private Integer roleId;
	@TableField("menu_id")
	private Integer menuId;


}
