package com.springCore.springExpreLang;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SpringExpDemo {
	// @Value("233")
	@Value("#{45*5}")
	private Integer x;

//	@Value("7852")
	@Value("#{100+56+45+78+7}")
	private Integer y;

	@Value("#{T (java.lang.Math).sqrt(525)}")
	private Integer w;

	@Value("#{8-3>4}")
	private boolean isTrue;

	@Value("Ashwin Ingle")
	private String z;

	public SpringExpDemo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SpringExpDemo(Integer x, Integer y) {
		super();
		this.x = x;
		this.y = y;
	}

	public Integer getX() {
		return x;
	}

	public void setX(Integer x) {
		this.x = x;
	}

	public Integer getY() {
		return y;
	}

	public void setY(Integer y) {
		this.y = y;
	}

	public Integer getW() {
		return w;
	}

	public void setW(Integer w) {
		this.w = w;
	}

	public String getZ() {
		return z;
	}

	public void setZ(String z) {
		this.z = z;
	}

	@Override
	public String toString() {
		return "SpringExpDemo [x=" + x + ", y=" + y + ", w=" + w + ", isTrue=" + isTrue + ", z=" + z + "]";
	}

}
