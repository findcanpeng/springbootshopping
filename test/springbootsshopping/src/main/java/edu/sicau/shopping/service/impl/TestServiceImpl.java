package edu.sicau.shopping.service.impl;

import edu.sicau.shopping.domain.Tbclass;
import edu.sicau.shopping.mapper.TestMapper;
import edu.sicau.shopping.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class TestServiceImpl implements TestService {

    @Autowired
    private TestMapper testMapper;


    @Override
    public Tbclass getById(int id) {
        return testMapper.getById(id);
    }
}
