import Interface.*;
import abstract_class.Animal;
import abstract_class.Fruit;

public class Main {
    public static void main(String[] args) {
//        Staff staff = new Staff("son", "minhsonle0507","ha noi" , "099999999" ,"giám đốc");
//        student sinhVien = new student("toan", "toan@gmail.com" ,"nam dinh" , "09888888" ," ABC", 9.8 );
//
//        System.out.println(staff.getInfo());
//        System.out.println(sinhVien.getInfo());


//        Animal[] animal = new Animal[2];
//        animal[0] = new chicken();
//        animal[1] = new Tiger();
//        for (Animal dongVat: animal) {
//            System.out.println(dongVat.makeSound());

        Fruit[] hoaQua = new Fruit[2];
        hoaQua[0] = new Apple();
        hoaQua[1] = new Orange();
        for (Fruit traiCay:hoaQua) {
            System.out.println(traiCay.howToEat());
        }


//            if (dongVat instanceof chicken){
//                System.out.println(((chicken) dongVat).howToEat());
            }
        }
