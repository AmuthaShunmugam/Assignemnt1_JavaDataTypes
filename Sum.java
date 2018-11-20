import java.util.Scanner;
class Sum{
public static void main(String[] arg)
{
int x,y;
Scanner input = new Scanner(System.in);
System.out.println("Enter your first number:");
x = input.nextInt();
System.out.println("Enter your second number:");
y = input.nextInt();
while(y != 0){
int carry = (x & y);
x = x ^ y;
y = carry << 1;
}
System.out.println("Sum:"+x);
}}