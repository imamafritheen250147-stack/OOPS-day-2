import java.util.*;

enum Color {
    RED, GREEN
}

abstract class Tree {
    private int value;
    private Color color;
    private int depth;

    Tree(int value, Color color, int depth) {
        this.value = value;
        this.color = color;
        this.depth = depth;
    }

    public int getValue() {
        return value;
    }

    public Color getColor() {
        return color;
    }

    public int getDepth() {
        return depth;
    }

    public abstract void accept(TreeVis visitor);
}

class TreeNode extends Tree {
    private ArrayList<Tree> children = new ArrayList<Tree>();

    TreeNode(int value, Color color, int depth) {
        super(value, color, depth);
    }

    public void accept(TreeVis visitor) {
        visitor.visitNode(this);

        for (Tree child : children) {
            child.accept(visitor);
        }
    }

    public void addChild(Tree child) {
        children.add(child);
    }
}

class TreeLeaf extends Tree {
    TreeLeaf(int value, Color color, int depth) {
        super(value, color, depth);
    }

    public void accept(TreeVis visitor) {
        visitor.visitLeaf(this);
    }
}

abstract class TreeVis {
    public abstract int getResult();

    public abstract void visitNode(TreeNode node);

    public abstract void visitLeaf(TreeLeaf leaf);
}


// ==============================
// Visitor 1
// ==============================

class SumInLeavesVisitor extends TreeVis {

    private int sum = 0;

    public int getResult() {
        return sum;
    }

    public void visitNode(TreeNode node) {
        // Nothing to do for non-leaf nodes
    }

    public void visitLeaf(TreeLeaf leaf) {
        sum += leaf.getValue();
    }
}


// ==============================
// Visitor 2
// ==============================

class ProductOfRedNodesVisitor extends TreeVis {

    private long product = 1;
    private static final long MOD = 1000000007;

    public int getResult() {
        return (int) product;
    }

    public void visitNode(TreeNode node) {
        if (node.getColor() == Color.RED) {
            product = (product * node.getValue()) % MOD;
        }
    }

    public void visitLeaf(TreeLeaf leaf) {
        if (leaf.getColor() == Color.RED) {
            product = (product * leaf.getValue()) % MOD;
        }
    }
}


// ==============================
// Visitor 3
// ==============================

class FancyVisitor extends TreeVis {

    private int evenDepthSum = 0;
    private int greenLeafSum = 0;

    public int getResult() {
        return Math.abs(evenDepthSum - greenLeafSum);
    }

    public void visitNode(TreeNode node) {
        if (node.getDepth() % 2 == 0) {
            evenDepthSum += node.getValue();
        }
    }

    public void visitLeaf(TreeLeaf leaf) {
        if (leaf.getColor() == Color.GREEN) {
            greenLeafSum += leaf.getValue();
        }
    }
}


// ==============================
// Main
// ==============================

public class Solution {

    public static Tree solve() {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] values = new int[n];

        for (int i = 0; i < n; i++) {
            values[i] = sc.nextInt();
        }

        Color[] colors = new Color[n];

        for (int i = 0; i < n; i++) {
            colors[i] = sc.nextInt() == 0
                    ? Color.RED
                    : Color.GREEN;
        }

        int[][] edges = new int[n - 1][2];

        for (int i = 0; i < n - 1; i++) {
            edges[i][0] = sc.nextInt() - 1;
            edges[i][1] = sc.nextInt() - 1;
        }

        ArrayList<Integer>[] graph = new ArrayList[n];

        for (int i = 0; i < n; i++) {
            graph[i] = new ArrayList<Integer>();
        }

        for (int i = 0; i < n - 1; i++) {
            int u = edges[i][0];
            int v = edges[i][1];

            graph[u].add(v);
            graph[v].add(u);
        }

        return buildTree(
                0,
                -1,
                0,
                values,
                colors,
                graph
        );
    }

    private static Tree buildTree(
            int node,
            int parent,
            int depth,
            int[] values,
            Color[] colors,
            ArrayList<Integer>[] graph) {

        ArrayList<Integer> children = new ArrayList<Integer>();

        for (int next : graph[node]) {
            if (next != parent) {
                children.add(next);
            }
        }

        // Leaf node
        if (children.size() == 0) {
            return new TreeLeaf(
                    values[node],
                    colors[node],
                    depth
            );
        }

        // Non-leaf node
        TreeNode treeNode = new TreeNode(
                values[node],
                colors[node],
                depth
        );

        for (int child : children) {
            Tree childTree = buildTree(
                    child,
                    node,
                    depth + 1,
                    values,
                    colors,
                    graph
            );

            treeNode.addChild(childTree);
        }

        return treeNode;
    }

    public static void main(String[] args) {

        Tree root = solve();

        SumInLeavesVisitor vis1 = new SumInLeavesVisitor();
        ProductOfRedNodesVisitor vis2 = new ProductOfRedNodesVisitor();
        FancyVisitor vis3 = new FancyVisitor();

        root.accept(vis1);
        root.accept(vis2);
        root.accept(vis3);

        System.out.println(vis1.getResult());
        System.out.println(vis2.getResult());
        System.out.println(vis3.getResult());
    }
}
