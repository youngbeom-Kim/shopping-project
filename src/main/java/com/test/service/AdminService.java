package com.test.service;

import java.util.List;

import com.test.model.BookVO;
import com.test.model.CateVO;
import com.test.model.Criteria;

public interface AdminService {

	/* 상품 등록 */
	public void bookEnroll(BookVO book);
	
	/* 카테고리 리스트 */
	public List<CateVO> cateList();
	
	/* 상품 리스트 */
	public List<BookVO> goodsGetList(Criteria cri);
	
	/* 상품 총 개수 */
	public int goodsGetTotal(Criteria cri);
	
	/* 상품 조회 페이지 */
	public BookVO goodsGetDetail(int bookId);
	
	/* 상품 정보 수정 */
	public int goodsModify(BookVO vo);
	
}
