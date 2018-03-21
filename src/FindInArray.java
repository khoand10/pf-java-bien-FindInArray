import java.util.Scanner;

public class FindInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean check = false;
        System.out.println("Enter a name student: ");
        String input = sc.nextLine();
        String[]arrayStudent = {"khoa","hieu","dat"};
        for (int i = 0; i < arrayStudent.length-1; i++) {
            if(input.equals(arrayStudent[i])){
                System.out.println("You correct '"+input+"' in localtion: "+(i+1));
                check=true;
                break;
            }
        }
        if(!check)System.out.println("Not found '"+input+"'in the list!!!");
    }
}
