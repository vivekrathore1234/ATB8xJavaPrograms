package Switch_Statement;

public class Ex9 {
    public static void main(String[] args) {
        char c = 'C';
        switch (c) {
            case 'A'+1:
                System.out.println("B");
                break;
            case 'A':
                System.out.println("A");
                break;
            case 'A'+2:
                System.out.println("C");
                break;

        }
    }
}
