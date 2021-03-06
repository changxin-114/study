package com.kgc.study.studytravelcoach.mapper;

import com.kgc.study.bean.AdvertisementInfo;
import com.kgc.study.bean.AdvertisementInfoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AdvertisementInfoMapper {
    int countByExample(AdvertisementInfoExample example);

    int deleteByExample(AdvertisementInfoExample example);

    int deleteByPrimaryKey(Long adId);

    int insert(AdvertisementInfo record);

    int insertSelective(AdvertisementInfo record);

    List<AdvertisementInfo> selectByExample(AdvertisementInfoExample example);

    AdvertisementInfo selectByPrimaryKey(Long adId);

    int updateByExampleSelective(@Param("record") AdvertisementInfo record, @Param("example") AdvertisementInfoExample example);

    int updateByExample(@Param("record") AdvertisementInfo record, @Param("example") AdvertisementInfoExample example);

    int updateByPrimaryKeySelective(AdvertisementInfo record);

    int updateByPrimaryKey(AdvertisementInfo record);
}