package bomstudy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bomstudy.dao.BoardDao;
import bomstudy.domain.Board;

@Service
public class BoardService {
	
	@Autowired BoardDao boardDao;
	
	public List<Board> list() {
		return boardDao.selectList();
	}

	public void add(Board board) {
		boardDao.insert(board);
	}

	public Board get(String no) {
		return boardDao.selectOne(no);
	}

	public int delete(String no) {
		return boardDao.delete(no);
	}

	public int update(Board board) {
		return boardDao.update(board);
		
	}
	
	
}
