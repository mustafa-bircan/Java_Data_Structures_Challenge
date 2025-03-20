package org.example;

import java.util.ArrayList;
import java.util.Collections;

public class WorkintechList<DataType extends Comparable<DataType>> extends ArrayList<DataType> {

    @Override
    public boolean add(DataType dataType) {
        if (!this.contains(dataType)) {
            return super.add(dataType);
        }
        return false;
    }

    @Override
    public boolean remove(Object item) {
        boolean removed = super.remove(item);
        if (removed) {
            this.sort();
        }
        return removed;
    }

    public void sort() {
        Collections.sort(this);
    }
}
