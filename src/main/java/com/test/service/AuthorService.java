package com.test.service;

import com.test.model.AuthorVO;

public interface AuthorService {
	
	/* 작가 등록 */
	public void authorEnroll(AuthorVO author) throws Exception;
	
}
