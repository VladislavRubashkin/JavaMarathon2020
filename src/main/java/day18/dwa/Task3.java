package day18.dwa;

public class Task3 {
    /*
    TODO: Двоичное дерево поиска
     Двоичное дерево поиска строится по определенным правилам:
     1.У каждого узла не более двух детей.
     2.Любое значение меньше значения узла становится левым ребенком или ребенком левого ребенка.
     3.Любое значение больше или равное значению узла становится правым ребенком или ребенком правого ребенка.
     */

    public static void main(String[] args) {
        Node root = new Node(20);

        int[] numbers = {14, 23, 11, 16, 22, 27, 5, 15, 18, 24, 150, 8};
        for (int number : numbers) {
            addNode(number, root);
        }

        dfs(root);
    }

    private static void dfs(Node node){
        if (node == null)
            return;

        dfs(node.getLeft());
        System.out.print(node.getValue() + " ");
        dfs(node.getRight());
    }

    private static void addNode(int insertValue, Node root) {
        if (root == null)
            throw new IllegalArgumentException("Корневой узел должен быть не null.");

        Node nextNode = root; //  ссылаем на корень
        Node current = null;

        //Определяем, куда делать вставку. Если вставляемое значение(insertValue) меньше корня(root)
        //значит идём влево(ЛЕВОЕ ПОДДЕРЕВО) от корня, если больше идём вправо(ПРАВОЕ ПОДДЕРЕВО) от корня.

        while (nextNode != null) { // не равен null, потаму-что эту ссылку мы сослали на корень(root)
            current = nextNode; // ссылаем текущую ссылку на корень

            if (insertValue < current.getValue()) {
                nextNode = current.getLeft();
            } else {
                nextNode = current.getRight();
            }
        }

        // Находимся на листе дерева и делаем вставку куда надо
        if (insertValue < current.getValue()) {
            current.setLeft(new Node(insertValue));
        } else {
            current.setRight(new Node(insertValue));
        }
    }
}

class Node {

    private int value;
    private Node left; // По умолчанию null у созданного объекта;
    private Node right; // По умолчанию null у созданного объекта;

    public Node(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public Node getLeft() {
        return left;
    }

    public Node getRight() {
        return right;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public void setRight(Node right) {
        this.right = right;
    }
}
