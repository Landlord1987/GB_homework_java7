

public class Cat {
    private String name;
    private int appetite;
    boolean full = false; // �������

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
        // ���� �������� true, �� ��� ������,��� � ������� ���� ���������� ��� � ��� �������
        if (p.decreaseFood(appetite) == true) {
            full = true;
        }

    }

    public boolean catInfo() {
        if (full == true) {
            System.out.printf("%s ������ %d �� ��� � ������ ���\n", name, appetite);
            return true;
        } else {
            System.out.printf("� ������� ������ ���, ��� ������� %s � %d ��\n", name, appetite);
            return false;
        }
    }
}
