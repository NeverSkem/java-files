package Interface.Set;

public class Main {
    public static void main(String[] args) {
        Set setA = new SetImp();
        Set setB = new SetImp();
        Set universalSet;
    
        setA.add(1);
        setA.add(3);
        setA.add(5);
        System.out.print("A: ");
        setA.display();
        System.out.print("n(A): ");
        setA.count();
        int isElementA = 3;
        System.out.print("Is " + isElementA + " an element of Set A? ");
        boolean elementsSetA = setA.isElementOf(isElementA);
        if (elementsSetA)
            System.out.println("Yes");
        else
            System.out.println("No");

        setB.add(0);
        setB.add(3);
        setB.add(5);
        setB.add(7);
        System.out.print("\nB: ");
        setB.display();
        System.out.print("n(B): ");
        setB.count();
        int isElementB = 9;
        System.out.print("Is " + isElementB + " an element of Set B?: ");
        boolean elementsSetB = setB.isElementOf(isElementB);
        if (elementsSetB)
            System.out.println("Yes");
        else
            System.out.println("No");

        universalSet = setA.union(setB);
        System.out.print("\nA u B: ");
        universalSet.display();
        universalSet = setA.intersection(setB);
        System.out.print("A n B: ");
        universalSet.display();
        System.out.print("Disjointed sets?: ");
        boolean areDisjoint = setA.isDisjoint(setB);
        if (areDisjoint)
            System.out.println("Yes");
        else
            System.out.println("No");
        universalSet = setA.difference(setB);
        System.out.print("A - B: ");
        universalSet.display();
        universalSet = setB.difference(setA);
        System.out.print("B - A: ");
        universalSet.display();
    }
}
