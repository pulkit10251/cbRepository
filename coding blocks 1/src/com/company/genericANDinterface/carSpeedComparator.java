package com.company.genericANDinterface;

import java.util.Comparator;

public class carSpeedComparator implements Comparator<car> {

    @Override
    public int compare(car tcar, car ocar) {
        return tcar.speed-ocar.speed;
    }
}
