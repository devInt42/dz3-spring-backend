package com.example.backend.service;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.backend.dto.User2Dto;
import com.example.backend.mapper.User2Mapper;

@Component
public class User2ServiceImpl implements User2Service {

	@Autowired
	private SqlSessionTemplate sqlSession;
	
	@Override
	public List<User2Dto> getUser2List() {
		
		return sqlSession.getMapper(User2Mapper.class).getList();
	}

	@Override
	public void insertUser2(User2Dto dto) {
		sqlSession.getMapper(User2Mapper.class).insertUser2(dto);
	}

	@Override
	public int deleteUser2(User2Dto dto) {

		return sqlSession.getMapper(User2Mapper.class).deleteUser2(dto);
	}

	@Override
	public int updateUser2(User2Dto dto) {
		
		return sqlSession.getMapper(User2Mapper.class).updateUser2(dto);
	}

	@Override
	public List<User2Dto> getSearchUser2(int id) {
		
		return sqlSession.getMapper(User2Mapper.class).getSearchUser2(id);
	}

}
