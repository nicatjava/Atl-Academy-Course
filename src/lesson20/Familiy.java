package lesson20;

public class Familiy {
    private Human mother;
    private Human father;
    private Human[] children;
    private int childCount;

    public Familiy(Human mother, Human father, int childCount) {
        this.mother = mother;
        this.father = father;
        this.children = new Human[childCount];
        this.childCount = 0;
    }

    public void addChild(Human child) {
        if (childCount < children.length) {
            children[childCount] = child;
            childCount++;
        } else {
            System.out.println("Cannot add more children! All Children Added!");
        }
    }

    public void deleteChild(int index) {
        if(index > childCount - 1 || index < 0) {
            System.out.println("Cannot delete children!");
        } else{
            Human[] newChildren = new Human[childCount-1];
            int count = 0;
            for (int i = 0; i < childCount; i++) {
                if (i == index) {
                    continue;
                }
                newChildren[count++] = children[i];
            }
            children = newChildren;
            childCount--;
        }
    }

    public void printFamily() {
        System.out.println("Family members:");
        System.out.println("Father - Name: " + father.getName() + ", Surname: " + father.getSurname());
        System.out.println("Mother - Name: " + mother.getName() + ", Surname: " + mother.getSurname());
        System.out.println("Children:");
        for (int i = 0; i < children.length; i++) {
            System.out.println("Child - Name: " +children[i].getName() + ", Surname: " + children[i].getSurname());
        }
    }

    public int getCountChildren() {
        return childCount;
    }
}
