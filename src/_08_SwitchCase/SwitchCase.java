package _08_SwitchCase;

public class SwitchCase {
    public static void main(String[] args) {
        // 조건문 - Switch Case
        // 1등 => 전액 장학금
        // 2등 => 반액 장학금
        // 3등 => 소정의 상품
        // 그 이하 => 박수

        int ranking = 3;
//        if (ranking == 1) {
//            System.out.println("전액 장학금!!");
//        } else if (ranking == 2) {
//            System.out.println("반액 장학금!!");
//        } else if (ranking == 3) {
//            System.out.println("소정의 상품!!");
//        } else {
//            System.out.println("짝짝짝짝!!");
//        }
//        System.out.println("수여 끝~");

//        switch (ranking) {
//            case 1:
//                System.out.println("전액 장학금!!");
//                break;
//            case 2:
//                System.out.println("반액 장학금!!");
//                break;
//            case 3:
//                System.out.println("소정의 상품!!");
//                break;
//            default:
//                System.out.println("짝짝짝짝");
//        }
//        System.out.println("수여 끝~");
//        switch (ranking) {
//            case 1:
//                System.out.println("전액 장학금!!");
//                break;
//            case 2:
//            case 3:
//                System.out.println("반액 장학금!!");
//                break;
//            default:
//                System.out.println("짝짝짝짝");
//        }
//        System.out.println("수여 끝~");

        int price = 7000;
        int grade = 2;
        // 1등급이면  10000, 등금이 한단계씩 낮아질수록 -1000

        switch (grade) {
            case 1:
                price += 1000;
            case 2:
                price += 1000;
            case 3:
                price += 1000;
        }
        System.out.println("가격은" + price);

        // 봄 : 3,4,5 => 봄입니다.
        // 여름 : 6,7,8 => 여름 입니다.
        // 가을 : 9,10,11 => 가을 입니다.
        // 겨울 : 12,1,2 => 겨울 입니다.
        int month = 12;

        switch (month) {
            case 3,4,5:
                System.out.println("봄입니다");
                break;
            case 6,7,8:
                System.out.println("여름 입니다");
                break;
            case 9,10,11:
                System.out.println("가을 입니다");
                break;
            case 12,1,2:
                System.out.println("겨울 입니다");
        }


        // 1~7까지 숫자 하나 변수
        // 월화수목금토일
        int day = 3;
        switch (day) {
            case 1:
                System.out.println("월요일 입니다.");
            case 2:
                System.out.println("화요일 입니다.");
            case 3:
                System.out.println("수요일 입니다.");
            case 4:
                System.out.println("목요일 입니다.");
            case 5:
                System.out.println("금요일 입니다.");
            case 6:
                System.out.println("토요일 입니다.");
            case 7:
                System.out.println("일요일 입니다.");
        }
    }
}
