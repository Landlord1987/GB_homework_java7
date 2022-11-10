public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public boolean decreaseFood(int n) {
// ���������� false ���� � ������� ������ ���, ��� ������� � ����
        if (food < n) {
            return false;
        } else if (food >= n) {
            food -= n;
            return true;
        }
        return true;
    }

    public void info() {
        System.out.printf("� ������� ���: %d �� \n", food);
    }

    // �����, ������� ��������� ��� � �������
    public void plateAdd(int x) {
        food +=x;
    }
}