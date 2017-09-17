package com.lose.forum.service;

import com.lose.forum.model.UserDetail;
import java.util.List;


/**
 *
 * @author lose
 * @since 2017-09-17
 */
public interface UserDetailService{
	
	Integer addUserDetail(UserDetail userDetail);
	
	Integer deleteUserDetail(UserDetail userDetail);
	
	Integer updateUserDetail(UserDetail userDetail);
	
	UserDetail selectUserDetailById(UserDetail userDetail);
	
	List<UserDetail> selectUserDetailList();
	
}
