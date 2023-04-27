package com.testproject.service;

import java.util.List;

import com.testproject.domain.BoardVO;

public interface BoardService {

	String hello(String name);

	BoardVO getBoard();

	List<BoardVO> getBoardList();

}
