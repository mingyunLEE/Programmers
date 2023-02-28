import chekpoint.products.Kiosk;

public class Main {
    public static void main(String[] args) {
        Kiosk kiosk = new Kiosk();

    }
}
    /*
    * Coffee, Tea -> Product (프로덕트에 이름과 가격이라는 공통 정보를 추상화)
    * 상품들의 목록 및 저장소     : ProductRepository
    * 할인 조건                 : CozDiscountCondition
    * 프로그램의 메인 로직        : Kiosk
    *
    * */