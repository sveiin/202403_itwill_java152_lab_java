package com.itwill.class06;

/**
 * 은행 계좌 정보.
 * 속성: 계좌 번호, 잔고.
 * 기능: 입금, 출금, 이체, 정보 출력.
 */
public class Account {
    // field
    int accountNo; // 계좌 번호
    int balance; // 잔고
    
    // constructor: 아규먼트 2개를 갖는 생성자
    
    // method
    /**
     * deposit(입금). 현재 잔고에 입금액을 더하고, 입금 후의 잔고를 리턴.
     * @param amount 입금액(int).
     * @return 입금 후 잔고(balance).
     */
    
    /**
     * withdraw(출금). 현재 잔고에서 출금액을 빼고, 출금 후의 잔고를 리턴.
     * @param amount 출금액(int).
     * @return 출금 후 잔고.
     */
    
    /**
     * transfer(이체). 내 계좌에서의 잔고에서는 이체금액 amount를 빼고, 
     * 이체할 계좌 to의 잔고에서는 이체금액 amount를 더함.
     * @param to 이체할 계좌(Account 타입).
     * @param amount 이체할 금액.
     */
    
    /**
     * 계좌 정보 출력
     */
    public void info() {
        System.out.println("--- 계좌 정보 ---");
        System.out.println("계좌 번호: " + accountNo);
        System.out.println("잔고: " + balance);
        System.out.println("-----------------");
    }
}
