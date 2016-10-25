package com.demo.domain.repository.mybatis;

import com.demo.domain.model.mybatis.gen.TUser;
import com.demo.domain.repository.CrudMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * Created by zs on 16/10/24.
 */
@Mapper
public interface TUserMapper extends CrudMapper<TUser, Integer>{

}
