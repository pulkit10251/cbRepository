package com.company.genericANDinterface;

import java.util.Comparator;

public class carPriceComparator implements Comparator<car> {

    @Override
    public int compare(car tcar, car ocar) {
        return ocar.price-tcar.price;
    }
}
