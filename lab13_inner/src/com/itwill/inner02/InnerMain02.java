package com.itwill.inner02;

public class InnerMain02 {

    public static void main(String[] args) {
        // Book 타입 객체 생성
        Book book1 = new Book("철도원 삼대", "황석영", "창비");
        System.out.println(book1);
        
        Book book2 = new Book("일론 머스크", "월터 아이작슨", "21세기북스");
        System.out.println(book2);
        
        Book book3 = new Book("월터 아이작슨", "일론 머스크", "21세기북스");
        System.out.println(book3);

    }

}
