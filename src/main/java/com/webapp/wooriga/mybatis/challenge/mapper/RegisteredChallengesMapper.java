package com.webapp.wooriga.mybatis.challenge.mapper;

import com.webapp.wooriga.mybatis.vo.RegisteredChallenges;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface RegisteredChallengesMapper {
    void insertRegisteredChallenge(RegisteredChallenges registeredChallenges);
}
