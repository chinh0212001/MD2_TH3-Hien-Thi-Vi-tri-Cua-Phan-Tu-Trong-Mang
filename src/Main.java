import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] students = {"Ronaldo", "Messi", "Neymar", "Rooney"};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a name's students");
        String input_name = scanner.nextLine();
        boolean isExist = false;
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(input_name)) {
                System.out.println("vi tri cua cac thi sinh trong danh sach" + input_name + "is: " + i);
                isExist = true;
                break;
            }
        }
        if (!isExist){
            System.out.println("Not found"+ input_name + "in the list");
        }
    }
}