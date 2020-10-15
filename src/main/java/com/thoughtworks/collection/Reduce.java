package com.thoughtworks.collection;

import org.apache.commons.lang3.NotImplementedException;

import java.util.List;

public class Reduce {

    List<Integer> arrayList;

    public Reduce(List<Integer> arrayList) {
        this.arrayList = arrayList;
    }

    public double getAverage() {
        return arrayList.stream()
                .reduce(0,(integer1,integer2)->integer1+integer2).doubleValue()/arrayList.size();
    }

    public int getMaxValue() {
        throw new NotImplementedException();
    }

    public int getLastOdd() {
        throw new NotImplementedException();
    }
}
