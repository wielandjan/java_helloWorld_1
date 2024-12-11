package exercises.Programmieren1.Plaetzchendose;

import java.util.ArrayList;
import java.util.List;

public class CookieJar {

	private final List<Cookie> cookies;

	public CookieJar() {
		cookies = new ArrayList<>();
	}

	public void addCookie(Cookie cookie) {
		this.cookies.add(cookie);
	}

	public StuffedCookie getStuffedCookie() {
		for (Cookie cookie : cookies) {
			if (cookie instanceof StuffedCookie) {
				return (StuffedCookie) cookie;
			}
		}
		return null;
	}

	public Cookie getCookieByName(String name) {
		for (Cookie cookie : cookies) {
			if (cookie.getName().equals(name)) {
				return cookie;
			}
		}
		return null;
	}
}