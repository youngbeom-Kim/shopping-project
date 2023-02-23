package com.test.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.mapper.AdminMapper;
import com.test.model.BookVO;
import com.test.model.CateVO;
import com.test.model.Criteria;

import lombok.extern.log4j.Log4j;

@Service
@Log4j
public class AdminServiceImpl implements AdminService {
	
	@Autowired
	private AdminMapper adminMapper;

	/* 상품 등록 */
	@Override
	public void bookEnroll(BookVO book) {
		
		log.info("(service)bookEnroll.....");
		
		adminMapper.bookEnroll(book);
		
	}

	/* 카테고리 리스트 */
	@Override
	public List<CateVO> cateList() {
		
		log.info("(service)cateList......");
		
		return adminMapper.cateList();
	}

	/* 상품 리스트 */
	@Override
	public List<BookVO> goodsGetList(Criteria cri) {
		
		log.info("goodsGetList()...........");
		
		return adminMapper.goodsGetList(cri);
		
	}

	/* 상품 총 개수 */
	@Override
	public int goodsGetTotal(Criteria cri) {
		
		log.info("goodsGetTotal()...........");
		
		return adminMapper.goodsGetTotal(cri);
		
	}

	/* 상품 조회 페이지 */
	@Override
	public BookVO goodsGetDetail(int bookId) {

		log.info("goodsGetDetail()..........." + bookId);

		return adminMapper.goodsGetDetail(bookId);
	}

}
