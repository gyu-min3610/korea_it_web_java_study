package _31_Generic;

import java.util.Date;

public class DataController {
    public static void main(String[] args) {
//        ResponseData responseData = new ResponseData("데이터:","권규민",29,3.14);
//        System.out.println(responseData.toStringStr());
//        System.out.println(responseData.toStringInt());
//        System.out.println(responseData.toStringDouble());

        ResponseData<String> responseData1 = new ResponseData<>("이름 : ","권규민");
        System.out.println(responseData1);
        ResponseData<Integer> responseData2 = new ResponseData<>("나이 : ",29);
        System.out.println(responseData2);
        ResponseData<Double> responseData3 = new ResponseData<>("원주율 : ",3.14);
        System.out.println(responseData3);

        Date now = new Date();
        ResponseData<Date> nowData = new ResponseData<>("현재 날짜 : ",now);
        System.out.println(nowData);

        // Product패키지
        // ProductController.java, Product.java
        // 상품 정보, => 상품명(productName), 상품정보(productInfo)
        // Product(productName=Laptop, productInfo= Intel i7, 16GB RAM, 512GB SSD) String
        // Product(productName=Smartphone, productInfo=799.99) Double
        // Product(productName=Available, productInf=true)     Boolean
    }
}