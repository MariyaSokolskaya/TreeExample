package my.tree;

/**
 * Created by sma on 18.02.2016.
 */
public class BinaryTreeExample {
    int value;
    BinaryTreeExample lchild; // ����� �������
    BinaryTreeExample rchild; // ������ �������

    public BinaryTreeExample(int value) {
        this.value = value;
        this.lchild = null;
        this.rchild = null;
    }

    public BinaryTreeExample() {
        this.value = -1; // �������� ��� ������� ����
        this.lchild = null;
        this.rchild = null;
    }

    /* ����� ������� ��������� � ������ root - ������ �� ������� ���� ������ valueNode - ��������, ������� ��������� � ������ */
    public void insertNode(BinaryTreeExample root, int valueNode) {
        // ���� ������ ������
        if (root.value == -1) {
            root.value = valueNode; // ���������� �������� � ����
            return;
        }
        /*���� �������� � ������� ���� ������ valueNode, �� ��������� � ����� ���������*/
        if (root.value > valueNode) {
            //���� ������ ������� ���, �� ������� ��� � ��������� valueNode
            if (root.lchild == null)
                root.lchild = new BinaryTreeExample(valueNode);
                // ���� ����� ������� ����, �� ��������� ���� � ����� ���������
            else
                insertNode(root.lchild, valueNode);
        }
        /*���� �������� � ������� ���� ������  ������������, �� ��������� � ������  ���������*/
        else if (root.value < valueNode) {
            //���� ������� ������� ���, �� ������� ��� � ��������� valueNode
            if (root.rchild == null)
                root.rchild = new BinaryTreeExample(valueNode);
                // ���� ������ ������� ����, �� ��������� ���� � ������ ���������
            else
                insertNode(root.rchild, valueNode);
        }
    }
    // ����� ������ ������ �� �����
    public void printBinaryTree(BinaryTreeExample root, int level) {
        if (root != null) {
            //TODO ������� ����� ���������
            for (int i = 0; i < level; i++)
                System.out.print("   ");//��� ���� �������, ��� ������ ������
            //TODO ������� �������� ����
            //TODO ������� ������ ���������
        }
    }

    public static void main(String[] args) {
        // TODO ������� ������ �������� ��� ���������� � ������
        int b[];
        BinaryTreeExample tree = new BinaryTreeExample();
        // ���������� ��������� ������� � ������
        for (int i = 0; i < b.length; i++)
            tree.insertNode(tree, b[i]);
        // ����� ����������� ������
        tree.printBinaryTree(tree, 0);
    }
}


