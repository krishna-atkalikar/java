package demo.generics.dao;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Atkalikar on 20-08-2015.
 */
public class Table<T> {
    List<T> list = new ArrayList<>();

    public void insert(T newRow){
        list.add(newRow);
    }

    public boolean delete(T row){
        return list.remove(row);
    }

    public List<T> getAll(){
        return list;
    }
}
