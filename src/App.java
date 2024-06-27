public class App {
    public static void main(String[] args) throws Exception {

        Datum d = new Datum(1, 2, 2021);
        System.out.println(d.getTag());
        System.out.println(d.getMonat());
        System.out.println(d.getJahr());
    }
}
