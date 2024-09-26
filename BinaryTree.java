import java.util.Scanner;

// Class Node represents a node of the tree.
class Node {
    int value;
    Node left, right;

    public Node(int value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }
}

// Class BinaryTree represents the binary search tree.
public class BinaryTree {
    private Node root;

    public BinaryTree() {
        root = null;
    }

    // Insert a value into the tree.
    public void insert(int value) {
        root = insertRec(root, value);
    }

    // Recursive helper function for insertion.
    private Node insertRec(Node root, int value) {
        if (root == null) {
            return new Node(value);
        }
        if (value < root.value) {
            root.left = insertRec(root.left, value);
        } else {
            root.right = insertRec(root.right, value);
        }
        return root;
    }

    // Search for a value in the tree.
    public boolean search(int value) {
        return searchRec(root, value);
    }

    // Recursive helper function for search.
    private boolean searchRec(Node root, int value) {
        if (root == null) {
            return false;
        }
        if (root.value == value) {
            return true;
        }
        return value < root.value ? searchRec(root.left, value) : searchRec(root.right, value);
    }

    // Remove a value from the tree.
    public void remove(int value) {
        if (search(value)) {
            root = removeRec(root, value);
            System.out.println("\nValor " + value + " removido com sucesso. Árvore atualizada:\n");
            printTree();
        } else {
            System.out.println("\nValor " + value + " não encontrado.\n");
        }
    }

    // Recursive helper function for removal.
    private Node removeRec(Node root, int value) {
        if (root == null) return root;

        if (value < root.value) {
            root.left = removeRec(root.left, value);
        } else if (value > root.value) {
            root.right = removeRec(root.right, value);
        } else {
            if (root.left == null) return root.right;
            if (root.right == null) return root.left;

            root.value = minValue(root.right);
            root.right = removeRec(root.right, root.value);
        }
        return root;
    }

    // Find the minimum value in a subtree.
    private int minValue(Node node) {
        int minValue = node.value;
        while (node.left != null) {
            minValue = node.left.value;
            node = node.left;
        }
        return minValue;
    }

    // Print the tree.
    public void printTree() {
        printRec(root, 1);
    }

    // Recursive helper function to print the tree.
    private void printRec(Node root, int indent) {
        if (root != null) {
            printRec(root.right, indent + 4);
            System.out.printf("%" + indent + "s%s%n", "", root.value);
            printRec(root.left, indent + 4);
        }
    }

    public static void main(String[] args) {
        System.out.println("\n=========================");
        System.out.println("Árvore binária de buscas");
        BinaryTree tree = new BinaryTree();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("=========================");
            System.out.println("1) Inserção");
            System.out.println("2) Busca");
            System.out.println("3) Remoção");
            System.out.println("4) Impressão");
            System.out.println("=========================");
            System.out.print("Escolha uma opção: ");

            int menu = scanner.nextInt();

            switch (menu) {
                case 1:
                    System.out.print("\nDigite o valor para inserção: ");
                    int valueToInsert = scanner.nextInt();
                    tree.insert(valueToInsert);
                    System.out.println("\nValor inserido com sucesso!\n");
                    break;
                case 2:
                    System.out.print("\nDigite o valor para busca: ");
                    int valueToSearch = scanner.nextInt();
                    boolean found = tree.search(valueToSearch);
                    System.out.println(found ? "\nValor " + valueToSearch + " encontrado! (Verdadeiro)\n" : "\nValor não encontrado. (Falso)\n");
                    break;
                case 3:
                    System.out.print("\nDigite o valor para remoção: ");
                    int valueToRemove = scanner.nextInt();
                    tree.remove(valueToRemove);
                    break;
                case 4:
                    System.out.println("\nÁrvore Binária de Busca:\n");
                    tree.printTree();
                    break;
                default:
                    System.out.println("\nOpção inválida. Tente novamente.\n");
            }
        }
    }
}
