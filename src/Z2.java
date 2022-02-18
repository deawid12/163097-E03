import java.time.LocalTime;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class Z2 {
    public static <E> LinkedHashSet<E> fun(LinkedHashSet<E> tab){
        if(!tab.isEmpty()){
            Iterator<E> iter = tab.iterator();
            int i = 0;
            while (iter.hasNext()){
                E o = iter.next();
                if(i == tab.size()-2){
                    tab.remove(o);
                    break;
                }
                i++;
            }
        }
        return tab;
    }
    public static void main(String[] args){
        LinkedHashSet<Integer> l1 = new LinkedHashSet<>();
        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(4);
        l1.add(5);
        System.out.println(fun(l1));
        LinkedHashSet<String> l2 = new LinkedHashSet<>();
        l2.add("a");
        l2.add("b");
        l2.add("c");
        l2.add("d");
        l2.add("e");
        l2.add("f");
        System.out.println(fun(l2));
        LinkedHashSet<LocalTime> l3 = new LinkedHashSet<>();
        l3.add(LocalTime.parse("10:20"));
        l3.add(LocalTime.parse("11:20"));
        l3.add(LocalTime.parse("12:20"));
        l3.add(LocalTime.parse("13:20"));
        System.out.println(fun(l3));
    }
}

