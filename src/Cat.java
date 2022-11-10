

public class Cat {
    private String name;
    private int appetite;
    boolean full = false; // Сытость

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public Cat(String name, int appetite, boolean full) {
        this.name = name;
        this.appetite = appetite;
        this.full = full;

    }

    public void eat(Plate p) {
        // Если приходит true, то это значит,что в тарелке было достаточно еды и кот покушал
        if (p.decreaseFood(appetite) == true) {
            full = true;
        }

    }

    public boolean catInfo() {
        if (full == true) {
            System.out.printf("%s скушал %d шт еды и теперь сыт\n", name, appetite);
            return true;
        } else {
            System.out.printf("В тарелке меньше еды, чем аппетит %s в %d шт\n", name, appetite);
            return false;
        }
    }
}
