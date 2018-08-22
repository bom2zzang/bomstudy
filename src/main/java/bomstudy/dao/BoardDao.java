package bomstudy.dao;

import java.util.List;

import bomstudy.domain.Board;

public interface BoardDao {
	
	List<Board> selectList();

	int insert(Board board);

	Board selectOne(String no);

	int delete(String no);

	int update(Board board);

	

}
