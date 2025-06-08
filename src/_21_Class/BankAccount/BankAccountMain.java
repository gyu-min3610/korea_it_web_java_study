package _21_Class.BankAccount;

public class BankAccountMain {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();

        bankAccount.deposit(10000);
//        bankAccount.deposit(-4000);
        bankAccount.withdraw(2400);
//        bankAccount.withdraw(15000);
        System.out.println(bankAccount.getBalance());
    }

    // 문제
    // WaterBottle => WaterBottle클래스, WaterBottleMain
    // currentWater 현재 물의 양
    // 메소드
    // 물 채우기(fill) => 최대용량인 1000을 넘을 수 없다.
    // 물 마시기(drink) => 현재 물의 양보다 초과해서 마실 수 없다.
    // getter를 통해 현재 물병의 물의 양에 접근할 수 있다.

}
