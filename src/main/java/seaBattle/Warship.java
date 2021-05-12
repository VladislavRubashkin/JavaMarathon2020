package seaBattle;

public class Warship {
    private final String warship =  "\uD83D\uDEE5"; // Корабль
    private final String aura = "\uD83D\uDFE6";     // Ореол(аура)
    private final String wound = "\uD83D\uDFE5";    // Ранение
    private int size;     // Размер коробля
    private int health;   // Здоровье коробля(равно его размеру)
    private int x, y;     // Координаты для расстановки кораблей
    private boolean isStatus = true; // Жив корабль или мертв
}
