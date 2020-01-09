package com.yshop.user.service;

import com.yshop.bean.UmsMember;
import com.yshop.service.UmsMemberService;
import com.yshop.user.mapper.UmsMemberMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 会员impl
 *
 * @author jiyf
 * @create 2020-01-08 21:49
 **/
@Service
public class UmsMemberServiceImpl implements UmsMemberService {

    @Autowired
    private UmsMemberMapper umsMemberMapper;

    @Override
    public List<UmsMember> getAllUser() {
        return umsMemberMapper.selectAll();
    }
}
