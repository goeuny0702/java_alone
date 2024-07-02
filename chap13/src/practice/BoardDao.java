package practice;

import java.util.*;

public class BoardDao {
	public List<Board> getBoardList() {
		List<Board> boardList = new ArrayList<>();
		Board board1 = new Board("제목1", "내용1");
		boardList.add(board1);
		
		
		return boardList;
	}

}
