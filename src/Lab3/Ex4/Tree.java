package Lab3.Ex4;

public class Tree {

    private Integer treeAge;
    private Boolean treeIsAlive;
    private String treeName;

    public Tree(Integer treeAge, String treeName) {
        this.treeAge = treeAge;
        this.treeName = treeName;
    }

    public Tree(Integer treeAge, Boolean treeIsAlive, String treeName) {
        this.treeAge = treeAge;
        this.treeIsAlive = treeIsAlive;
        this.treeName = treeName;
    }

    public Tree() {
        System.out.println("Пустой конструктор без параметров сработал");
    }
}
