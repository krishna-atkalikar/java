package demo.generics.util;

import java.util.Iterator;
import java.util.List;

/**
 * Created by Atkalikar on 20-08-2015.
 */
public class ServiceUtil {
    public static void printList(List<?> list){
        list.forEach(System.out::println);
    }

    public static <T extends Comparable> T getHighest(List<T> list){
        int size = 0;
        if((size = list.size()) == 0)
            return null;
        if(size == 1)
            return list.get(0);
        Iterator<T> iterator = list.iterator();
        T max = iterator.next();
        while(iterator.hasNext()){
            T loopValue = iterator.next();
            if(max.compareTo(loopValue) < 0){
                max = loopValue;
            }
        }
        return max;
    }

    public static Comparable getHighestByWildCard(List<? extends Comparable> list){
        int size = 0;
        if((size = list.size()) == 0)
            return null;
        if(size == 1)
            list.get(0);
        Iterator<? extends Comparable> iterator = list.iterator();
        Comparable max = iterator.next();
        while(iterator.hasNext()){
            Comparable loopValue = iterator.next();
            if(max.compareTo(loopValue) < 0){
                max = loopValue;
            }
        }
        return max;
    }
}
