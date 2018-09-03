package service;

import dao.BoardDao;
import dao.BoardDaoImpl;

public class BoardServiceImpl implements BoardService {
	//서비스에서는 저장소를 사용
	private BoardDao boardDao;
	
	
	//싱글톤 패턴적용 - 인스턴스를 하나만 만들수있는 클래스
	
	private BoardServiceImpl() {
		//Dao 객체 생성 // 생성자에서 객체를 생성한다.
		boardDao = BoardDaoImpl.getInstance();
	}
	
	private static BoardService boardService; // 스태틱 변수는 한개밖에 안만들어진다.
	
	public static BoardService getInstance() {
		if(boardService == null) {  // 한개만들어지면 여기는 if 구문이 수행이 안된다.
			boardService = new BoardServiceImpl();
		}
		return boardService;
	}
}
