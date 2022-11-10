import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // ������ �����
        Cat[] cats = {
                new Cat("Barsik", 5),
                new Cat("Ringo", 4),
                new Cat("Fast", 6)};
        Plate plate = new Plate(14);
// � ����� ������ ���� ����� �������� � ��������� �������
        for (int i = 0; i < cats.length; i++) {
            plate.info();
            cats[i].eat(plate);
// ���� � ������� �� ������� ���, �� ���������� �������� 5 ������
            if (cats[i].catInfo() == false){
                System.out.println("������� 'Y' ���� ������ �������� ��� � �������: ");
                i--;
                if  (scanner.next().equalsIgnoreCase("Y")) {
                    System.out.print("������� ��� �� ������ �������� � �������? ");
                    int x = scanner.nextInt();
                    plate.plateAdd(x);
                }
            }

        }

        plate.info();
    }
}