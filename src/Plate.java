public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public boolean decreaseFood(int n) {
// Возвращает false если в тарелке меньше еды, чем аппетит у кота
        if (food < n) {
            return false;
        } else if (food >= n) {
            food -= n;
            return true;
        }
        return true;
    }

    public void info() {
        System.out.printf("В тарелке еды: %d шт \n", food);
    }

    // Метод, который добавляет еду в тарелку
    public void plateAdd(int x) {
        food +=x;
    }
}