package day11.task1_1;

public class Courier implements Worker {
    private int salary;
    private boolean isPayed;
    protected Warehouse warehouse;
    private final static int SALARY = 100;

    public Courier(int salary, boolean isPayed, Warehouse warehouse) {
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
        warehouse.incrementCountDeliveredOrders();
    }

    @Override
    public void bonus() {
        if (isPayed) {
            System.out.println("Бонус курьеру уже выплачен");
            return;
        }
        if (warehouse.getCountDeliveredOrders() >= 10000) {
            salary += 50000;
            isPayed = true;
        } else {
            System.out.println("Бонус курьеру пока не доступен");
        }
    }

    @Override
    public String toString() {
        return "Courier{" +
                "salary=" + salary +
                ", isPayed=" + isPayed +
                '}';
    }


}
