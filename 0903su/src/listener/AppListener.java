package listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class AppListener implements ServletContextListener {

	@Override
	//웹 애플리케이션이 종료될 때 호출되는 메소드
	// 사용한 외부 자원에 대한 연결 해제 작업을 주로 작성합니다.
	public void contextDestroyed(ServletContextEvent arg0) {
		System.out.println("시스템 아웃 준비완료");

	}

	@Override
	// 웹 애플리케이션이 시작될 때 호출되는 메소드
	// 서버에서 필요한 자원을 생성하는 작업을 주로 합니다.
	public void contextInitialized(ServletContextEvent sce) {
		System.out.println("웹어플리케이션 시작");

	}

}
