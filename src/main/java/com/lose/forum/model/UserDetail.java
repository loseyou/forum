package com.lose.forum.model;

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
@TableName("user_detail")
public class UserDetail implements Serializable {

    private static final long serialVersionUID = 1L;

	private Integer id;
	private String name;
	private String password;
	private String phone;
	private String address;
	private String email;
	private String image;


}
