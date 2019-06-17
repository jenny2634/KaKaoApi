package com.ggoreb.kakao_api;

public class Vision {
	public static void main(String[] args) {
		//open api - application programming interface
		VisionUtil vu = new VisionUtil("0316f41ce9a704497d7a6c1ae471a6db");
		String result = vu.sendFile("c:/dev/image.jpg");
		System.out.println(result);
		
		TranslateUtil tu = new TranslateUtil("0316f41ce9a704497d7a6c1ae471a6db");
		String result2 = tu.sendText("kr","cn","안녕하세요. 저는 개발자 입니다.");
		System.out.println(result2);
	}
}
