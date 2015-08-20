package demo.generics.util;

import java.util.List;

/**
 * Created by Atkalikar on 20-08-2015.
 */
public class ServiceUtil {
    public static void printList(List<?> list){
        list.forEach(System.out::println);
    }
}
