package ex03;

public class MainTest {
    public static void main(String[] args) {
        ViewTable vt = new ViewTable();
        vt.init(35);

        if (vt.getItems().size() > 0) {
            System.out.println("Test tablytsi: ok");
        } else {
            System.out.println("Test tablytsi: pomylka");
        }
    }
}
