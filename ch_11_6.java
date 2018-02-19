import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class ch_11_6
{
    /*Write a method countUnique that accepts a list of integers as a parameter and returns the number of unique integer
 values in the list.
 Use a set as auxiliary storage to help you solve this problem. For example, if a list contains the values
[3, 7, 3, –1, 2, 3, 7, 2, 15, 15], your method should return 5. The empty list contains 0 unique values.*/

    public static void main(String[] args)
    {
        LinkedList<Integer> unigueList = new LinkedList<>();
        unigueList.add(3);
        unigueList.add(7);
        unigueList.add(3);
        unigueList.add(-1);
        unigueList.add(2);
        unigueList.add(3);
        unigueList.add(7);
        unigueList.add(2);
        unigueList.add(15);
        unigueList.add(15);

        countUnique(unigueList);
        System.out.println(countUnique(unigueList));

    }

    public static Set countUnique(List<Integer> list)
    {
      return new HashSet(list);
    }

}
