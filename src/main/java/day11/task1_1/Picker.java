package day11.task1_1;

public class Picker implements Worker {
    private int salary;
    private boolean isPayed;
    protected Warehouse warehouse;
    private final static int SALARY = 80;

    public Picker(int salary, boolean isPayed, Warehouse warehouse) {
        this.salary = salary;
        this.isPayed = isPayed;
        this.warehouse = warehouse;
    }

    public int getSalary() {
        return salary;
    }

    public boolean isPayed() {
        return isPayed;
    }

    @Override
    public void doWork() {
        salary += SALARY;
        warehouse.incrementCountPickedOrders();
    }

    @Override
    public void bonus() {
        if (isPayed) {
            System.out.println("Бонус сборщику уже выплачен");
            return;
        }
        if (warehouse.getCountPickedOrders() >= 10000) {
            salary += 70000;
            isPayed = true;
        } else {
            System.out.println("Бонус сборщику пока не доступен");
        }
    }

    @Override
    public String toString() {
        return "Picker{" +
                "salary=" + salary +
                ", isPayed=" + isPayed +
                '}';
    }


}
