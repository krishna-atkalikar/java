package demo.generics.service;

import demo.generics.dao.Table;

import java.util.List;

/**
 * Created by Atkalikar on 20-08-2015.
 */
public interface Service<T> {
    void insert(T row);
    boolean delete(T row);
    List<T> getAll();
    Table<T> getTable();
    void setTable(Table<T> table);
}
