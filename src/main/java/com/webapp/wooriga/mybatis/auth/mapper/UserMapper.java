package com.webapp.wooriga.mybatis.auth.mapper;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.webapp.wooriga.mybatis.vo.CodeUser;
import com.webapp.wooriga.mybatis.vo.EmptyDays;
import com.webapp.wooriga.mybatis.vo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserMapper {

	public List<User> selectAll();

	public User selectOne(long uid);

	public void insert(User user);

	public void delete(User user);

	public void update(User user);

	public int checkUser(long uid);

	public String getCode(long uid);

	public void insertCodeUser(CodeUser codeuser);

	User selectUserForCalendar(EmptyDays emptyDays);

	int selectUserToFamilyId(@Param("familyId") String familyId);

	List<User> selectUserId(@Param("userIdList")List<Long> userIdList);

	List<User> selectfamilyId(@Param("familyId") String familyId);
}