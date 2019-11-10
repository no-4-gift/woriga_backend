package com.webapp.wooriga.mybatis.vo;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.webapp.wooriga.mybatis.calendar.deserializer.EmptyDaysDeserializer;
import lombok.Getter;
import lombok.Setter;

import java.sql.Date;

@Getter
@Setter
@JsonDeserialize(using = EmptyDaysDeserializer.class)
public class EmptyDays {
    private String familyId;
    private long userIdFk;
    private Date emptydate;
    private String profile;

    public EmptyDays(String profile,String familyId, long userIdFk, Date emptydate){
        this.familyId = familyId;
        this.userIdFk = userIdFk;
        this.emptydate = emptydate;
        this.profile = profile;
    }
    public EmptyDays(){

    }
}
