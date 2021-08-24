import java.util.ArrayList;

public class listSyntaxTesting
{
    public static void main(String[] args) 
    {
        ArrayList<Integer> a = new ArrayList<Integer>();

        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);

        int start = 0;
        int end = a.size()-1;
        int temp;
            if(a.size() > 1)
            {
                for(int i =0; i<a.size()/2;i++)
                {
                temp = a.get(start);
                a.set(start, a.get(end));
                a.set(end, temp);
                start++;
                end--;
                }
            }

        System.out.println(a);
    }
}