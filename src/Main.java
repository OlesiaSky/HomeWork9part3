public class Main {
    public static void main(String[] args) {
        Address WhiteHouse = new Address();
        WhiteHouse.setIndex(20500);
        WhiteHouse.setCountry("USA");
        WhiteHouse.setStreet("Pennsylvania Avenue");
        WhiteHouse.setHouse(1600);
        WhiteHouse.setApartment(1);
        System.out.println(WhiteHouse.getIndex() + "\n" + WhiteHouse.getCountry() + "\n" + WhiteHouse.getStreet() + "\n" + WhiteHouse.getHouse() + "\n" + WhiteHouse.getApartment());
    }
}