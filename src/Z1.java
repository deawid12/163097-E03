import java.time.LocalTime;
import java.util.LinkedList;

public class Z1 {
    public static <T extends Comparable<? super T>> LinkedList redukuj(LinkedList<T> list, int n){
        LinkedList<T>  tab = new LinkedList<>();
        for(int i = 0; i < list.size(); i++){
            if((i+1)%n != 0)
                tab.add(list.get(i));
        }



        return tab;
    }

    public static void main(String[] args){
        LinkedList<Integer> t1 = new LinkedList<>();
        t1.add(1);
        t1.add(2);
        t1.add(3);
        t1.add(4);
        t1.add(5);
        t1.add(6);
        t1.add(7);
        t1.add(8);
        System.out.println(redukuj(t1, 3));
        LinkedList<LocalTime> t2 = new LinkedList<>();
        t2.add(LocalTime.parse("09:20"));
        t2.add(LocalTime.parse("10:20"));
        t2.add(LocalTime.parse("11:20"));
        t2.add(LocalTime.parse("12:20"));
        t2.add(LocalTime.parse("13:20"));
        t2.add(LocalTime.parse("14:20"));
        t2.add(LocalTime.parse("15:20"));
        System.out.println(redukuj(t2,4));
    }
}