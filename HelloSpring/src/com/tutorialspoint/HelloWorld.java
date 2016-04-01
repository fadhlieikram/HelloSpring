package com.tutorialspoint;

public class HelloWorld {
	private String message2;
	//private String msg2;

	public void setMessage(String message3) {
		this.message2 = message3;

	}
	
	/*public void setMsg(String msg) {
		this.msg2 = msg;	
	}*/
	
	public void getMessage() {
		System.out.println("Your message : " + message2);
	}
	
	public void init(){
		System.out.println("Bean is going through init.");
	}
	
	public void destroy(){
		System.out.println("Bean will destroy now.");
	}
}
