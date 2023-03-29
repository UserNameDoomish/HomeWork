import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Account account = new Account(0.0,"name");
        Car BMW = new Car(10000,"Cars");
        Car Opel = new Car(1000,"Cars");
        Phone Iphone = new Phone(500,"Gadget");
        Phone Samsung = new Phone(400,"Gadget");
        Plane Mig = new Plane(100000,"Jet");
        Plane Su = new Plane(250000,"Jet");
        DownshifterKit Nike = new DownshifterKit(100,"Boots");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите колличевство Денег: ");
        account.curentAmount = scanner.nextInt();
        System.out.println("Введите ваш класс(Cars,Gadgets,Jet,Boots): ");
        account.cotegory = scanner.next();

        if(account.curentAmount >= BMW.price && account.cotegory.equals(BMW.category)){
            System.out.println("Вы купите Bmw! ");
        }
        if(account.curentAmount >= Opel.price && account.cotegory == Opel.category) {
            System.out.println("Вы купите Opel! ");
        }
        if(account.curentAmount >= Iphone.price && account.cotegory == Iphone.category){
            System.out.println("Вы купите Iphone! ");
        }
        if(account.curentAmount >= Samsung.price && account.cotegory == Samsung.category){
            System.out.println("Вы купите Samsung! ");
        }
        if(account.curentAmount >= Mig.price && account.cotegory == Mig.category){
            System.out.println("Вы купите Mig! ");
        }
        if(account.curentAmount >= Su.price && account.cotegory == Su.category){
            System.out.println("Вы купите Su! ");
        }
        if(account.curentAmount >= Nike.price && account.cotegory == Nike.category){
            System.out.println("Вы купите Nike! ");
        }
        else{
            System.out.println("Надо РАБОТАТЬ,вот этими маленькими ручками РАБОТАТЬ!!!");
        }







    }
}