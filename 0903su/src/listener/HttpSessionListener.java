package listener;

import javax.servlet.http.HttpSessionEvent;

public class HttpSessionListener implements javax.servlet.http.HttpSessionListener {
	
	static int cnt;
	
	@Override
	//세션이 생성될 때 호출되는 메소드 - 새로운 사용자가 접속을 했다라는의미이다.
	public void sessionCreated(HttpSessionEvent se) {
		cnt = cnt +1;
		System.out.println(cnt + "명 접속중");

	}

	@Override
	public void sessionDestroyed(HttpSessionEvent se) {
		cnt = cnt - 1;
		System.out.println(cnt + "명 접속중");

	}

}
