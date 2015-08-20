package demo.generics.service;

import demo.generics.dao.Table;

import java.util.List;

/**
 * Created by Atkalikar on 20-08-2015.
 */
public class ServiceImpl<T> implements Service<T> {
    Table<T> table;
    @Override
    public void insert(T row) {
        table.insert(row);
    }

    @Override
    public boolean delete(T row) {
        return table.delete(row);
    }

    @Override
    public Table<T> getTable() {
        return table;
    }

    @Override
    public void setTable(Table<T> table) {
        this.table = table;
    }

    @Override
    public List<T> getAll() {
        return table.getAll();
    }

}
