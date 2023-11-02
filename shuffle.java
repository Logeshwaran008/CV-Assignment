import java.util.Arrays; 
import java.util.Collections;
import java.util.List;

public class shuffle {
  public static void main(String[] args) 
{

Integer[] a = {1, 2, 3, 4, 5};

 List<Integer> list = Arrays.asList(a);

Collections.shuffle (list);

list.toArray(a);

System.out.println(Arrays.toString(a));
}
}