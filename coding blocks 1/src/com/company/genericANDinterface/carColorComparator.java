package com.company.genericANDinterface;

import java.util.Comparator;

public class carColorComparator implements Comparator<car> {
    @Override
    public int compare(car tcar, car ocar) {
        return tcar.color.compareTo(ocar.color);
    }
}
