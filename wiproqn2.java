import java.util.Scanner;

public class wiproqn2{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String txt = s.nextLine();
        String arr[] = txt.split(" ");
        int n=arr.length;
        for (int i=n-1;i>=0;i--)
        System.out.print(arr[i]);
    }
}
/* 
python code
txt=input()
for i in txt.split(" ")[::-1]:
    print(i,end='')
*/