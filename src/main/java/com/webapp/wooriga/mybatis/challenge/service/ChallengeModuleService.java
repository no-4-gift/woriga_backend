package com.webapp.wooriga.mybatis.challenge.service;

import com.webapp.wooriga.mybatis.challenge.result.ChallengeBarInfo;
import com.webapp.wooriga.mybatis.challenge.result.UserInfo;
import com.webapp.wooriga.mybatis.vo.Certifications;
import com.webapp.wooriga.mybatis.vo.Participants;
import com.webapp.wooriga.mybatis.vo.RegisteredChallenges;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public interface ChallengeModuleService {
    Boolean ifCorrectUserIntheFamily(long chiefId, Participants[] participants,String familyId);
    Boolean validateParticipantsNum(int participantsNum);
    Boolean validateChallengeDateNum(int dateNum);
    Boolean ifCorrectParticipants(Certifications[] certifications, RegisteredChallenges registeredChallenges,
                                  Participants[] participants);
    ArrayList<UserInfo> findUserSetToEmpty(int dateSize, HashMap<String,Object> emptyMap);
}
