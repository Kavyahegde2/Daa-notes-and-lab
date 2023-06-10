//2b string tokenizer
package customer;
import java.util.Scanner;
import java.util.StringTokenizer;
public class customer {
public static void main(String[] args) 
{
String name;
Scanner scan = new Scanner(System.in);
System.out.println("Enter Name and Date_of_Birth in the format <Name,DD/MM/YYYY>");
name = scan.next(); 
StringTokenizer st = new StringTokenizer(name, ",/");
int count = st.countTokens();
for (int i = 1; i <= count; i++)
{
System.out.print(st.nextToken());
if (i < count)
{ System.out.print(",");
}
}
}
}
