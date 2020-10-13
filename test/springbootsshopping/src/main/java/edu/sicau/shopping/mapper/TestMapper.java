package edu.sicau.shopping.mapper;


import edu.sicau.shopping.domain.Tbclass;
import org.springframework.stereotype.Repository;

@Repository
public interface TestMapper {
    Tbclass getById(int id);
}
