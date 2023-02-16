package com.test.service;

import java.util.List;

import com.test.model.AuthorVO;
import com.test.model.Criteria;

public interface AuthorService {
	
	/* 작가 등록 */
	public void authorEnroll(AuthorVO author) throws Exception;
	
	/* 작가 목록 */
	public List<AuthorVO> authorGetList(Criteria cri) throws Exception;
	
	/* 작가 총 수 */
	public int authorGetTotal(Criteria cri) throws Exception;
	
	/* 작가 상세 페이지 */
	public AuthorVO authorGetDetail(int authorId) throws Exception;
	
}
