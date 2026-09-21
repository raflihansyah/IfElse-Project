import java.util.Scanner;
public class Member1 {
    
public static void main(String[] args){
Scanner input = new Scanner(System.in);

System.out.println("Masukkan Status Member (GOLD, SILVER, BRONZE, REGULER): ");
String statusMember = input.nextLine().toUpperCase();
int diskon;

if (statusMember.equals("GOLD")){
    diskon = 20;
} else if (statusMember.equals("SILVER")) {
    diskon = 15;
} else if (statusMember.equals("BRONZE")) {
    diskon = 10;
} else {
    diskon = 0;
}

System.out.println("DISKON MEMBER= "+ diskon +"%");
input.close();

}
}
