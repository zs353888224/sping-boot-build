package com.wscq.domain.repository.mybatis;

import com.wscq.domain.model.mybatis.gen.TUser;
import com.wscq.domain.repository.CrudMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * Created by zs on 16/10/24.
 */
@Mapper
public interface TUserMapper extends CrudMapper<TUser, Integer>{

    @Select("select * from t_user where name=#{name,jdbcType=VARCHAR}")
    TUser getUserByName(@Param("name") String name);
}
