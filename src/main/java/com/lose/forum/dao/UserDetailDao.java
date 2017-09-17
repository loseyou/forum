package com.lose.forum.dao;

import com.lose.forum.model.UserDetail;
import java.util.List;


/**
 *
 * @author lose
 * @since 2017-09-17
 */
public interface UserDetailDao {
	
	Integer addUserDetail(UserDetail userDetail);
	
	Integer deleteUserDetail(UserDetail userDetail);
	
	Integer updateUserDetail(UserDetail userDetail);
	
	UserDetail selectUserDetailById(UserDetail userDetail);
	
	List<UserDetail> selectUserDetailList();
	
}