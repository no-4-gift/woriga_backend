package com.webapp.wooriga.mybatis.auth.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.webapp.wooriga.mybatis.vo.CodeUser;
import com.webapp.wooriga.mybatis.vo.EmptyDays;
import com.webapp.wooriga.mybatis.vo.User;
import org.apache.ibatis.annotations.Param;

public interface UserDAO {
	public List<User> selectAll();
	public User selectOne(long uid);
	public void insert(User user);
	public void delete(User user);
	public void update(User user);
	public int checkUser(long uid);
	public String getCode(long uid);
	public void insertCodeUser(CodeUser codeuser);
	User selectUserForCalendar(EmptyDays emptyDays);
	int selectUserToFamilyId(@Param("familyId")String familyId);
	List<User> selectUserId(HashMap<String,Object> userMap);
	List<User> selectfamilyId(@Param("familyId")String familyId);
}
