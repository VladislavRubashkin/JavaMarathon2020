package day11.task1_1;

public class Task1 {
    public static void main(String[] args) {

        System.out.println("Склад № 1");
        System.out.println();

        Warehouse warehouse = new Warehouse();
        Picker picker = new Picker(0, false, warehouse);
        Courier courier = new Courier(0, false, warehouse);

        businessProcess(picker);
        picker.bonus();
        System.out.println("Количество собранных заказов " + warehouse.getCountPickedOrders());
        System.out.println("Заработная плата сборщика " + picker.getSalary());

        businessProcess(courier);
        courier.bonus();
        System.out.println("Количество доставленных заказов " + warehouse.getCountDeliveredOrders());
        System.out.println("Заработная плата курьера " + courier.getSalary());

        System.out.println();
        System.out.println("Склад № 2");
        System.out.println();

        Warehouse warehouse2 = new Warehouse();
        Picker picker2 = new Picker(0, false, warehouse2);
        Courier courier2 = new Courier(0, false, warehouse2);

        picker2.doWork();
        picker2.bonus();
        System.out.println("Количество собранных заказов " + warehouse2.getCountPickedOrders());
        System.out.println("Заработная плата сборщика " + picker2.getSalary());

        courier2.doWork();
        courier2.bonus();
        System.out.println("Количество доставленных заказов " + warehouse2.getCountDeliveredOrders());
        System.out.println("Заработная плата курьера " + courier2.getSalary());

    }

    public static void businessProcess(Worker worker) {
        for (int i = 0; i < 10000; i++) {
            worker.doWork();
        }
        worker.bonus();
    }
}
