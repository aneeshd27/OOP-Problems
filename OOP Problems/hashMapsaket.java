import java.util.HashMap;

public class Unique {
    public static void main(String[] args) {

        String s="This this is is done by Saket Saket ";
        String s1[]=s.split(" ");
        HashMap<String,Integer> map=new HashMap<>();
        for(int i=0;i<s1.length;i++)
        {
            if(map.containsKey(s1[i]))
            {
                int c=map.get(s1[i]);
                map.put(s1[i],c+1);
            }
            else
            {
                map.put(s1[i],1);
            }
        }
        System.out.println(map);
    }
}