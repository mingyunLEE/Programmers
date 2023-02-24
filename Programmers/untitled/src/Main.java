public class Main {
    public static void main(String[] args) {
        coz coz = new coz();
        coz.averageAge = 29;
        System.out.println(coz.averageAge);
        next(coz.averageAge);
        System.out.println(coz.averageAge);

    }
    static void next(int averageAge){
        averageAge = 30;
        System.out.println(averageAge+"살입니다");
    }
}class coz {
    int averageAge;
}