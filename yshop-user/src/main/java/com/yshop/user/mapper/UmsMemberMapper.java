package com.yshop.user.mapper;

import com.yshop.bean.UmsMember;
import org.springframework.stereotype.Component;
import tk.mybatis.mapper.common.Mapper;

/**
 * 会员Mapper
 *
 * @author jiyf
 * @create 2020-01-08 21:50
 **/
@Component(value = "UmsMemberMapper")
public interface UmsMemberMapper extends Mapper<UmsMember> {
}
