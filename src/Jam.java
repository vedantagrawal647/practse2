/*Create a class named 'Programming'. While creating an object of the class, if nothing is
passed to it, then the message "I love programming languages" should be printed. If some String is
 passed to it, then in place of "programming languages" the name of that String variable should be
  printed.
For example, while creating object if we pass "Java", then "I love Java" should be printed.
*/
import java.util.Scanner;
class Match {
    String s1;
    Match()
    {
        s1="I love programming languages";
    }
    Match(String s1)
    {
        this.s1="I love " + s1;
    }
    public void display()
    {
        System.out.println(s1);
    }

}
public class Jam
{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        Match obj=new Match(s.nextLine());
        obj.display();
    }
}
