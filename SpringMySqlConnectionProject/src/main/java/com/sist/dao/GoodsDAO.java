package com.sist.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sist.mapper.GoodsMapper;
import com.sist.vo.GoodsVO;

@Repository
public class GoodsDAO {

	@Autowired
	private GoodsMapper mapper;
	
	public List<GoodsVO> goodsListData(int start){
		return mapper.goodsListData(start);
	}
	
	public int goodsTotalPage() {
		return mapper.goodsTotalPage();
	}
}
