package _22_Inheritance;

// Animal 상속
// 부모 생성자 호출해서 객체 생성과 동시에 속성값 넣을 수 있도록 생성자 만들고
// getter setter
// getAnimalName => 제 이름은 ___ 입니다.
// getAnimalAge => 올해 제 나이는 __이고, 내년에는 __입니다.
// move => 사람이 두발로 걷습니다.
// read(String bookname) => ___이 책이름을 읽습니다.

// Main에서 객체 생성하시고 다 써보세요
public class Human extends Animal {

    public Human(String animalName, int animalAge) {
        super(animalName, animalAge);
    }

    @Override
    public String getAnimalName() {
        return super.getAnimalName();
    }

    @Override
    public int getAnimalAge() {
        return super.getAnimalAge();
    }

    @Override
    public void move() {
        super.move();
    }

    public void read(String bookName) {
        System.out.println(super.getAnimalName() + "이 " + bookName +"을 읽습니다.");
    }
}
