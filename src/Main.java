import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Массив котов
        Cat[] cats = {
                new Cat("Barsik", 5),
                new Cat("Ringo", 4),
                new Cat("Fast", 6)};
        Plate plate = new Plate(14);
// В цикле просим всех котов покушать и проверяем остатки
        for (int i = 0; i < cats.length; i++) {
            plate.info();
            cats[i].eat(plate);
// Если в тарелке не хватает еды, то предлагаем добавить 5 единиц
            if (cats[i].catInfo() == false){
                System.out.println("Нажмите 'Y' если хотите добавить еды в тарелку: ");
                i--;
                if  (scanner.next().equalsIgnoreCase("Y")) {
                    System.out.print("Сколько еды Вы хотите добавить в тарелку? ");
                    int x = scanner.nextInt();
                    plate.plateAdd(x);
                }
            }

        }

        plate.info();
    }
}