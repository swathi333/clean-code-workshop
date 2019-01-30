package com.thoughtworks.movierental;

import java.util.ArrayList;

public class Rentals extends ArrayList<Rental> {
    double getTotalAmount() {
      return stream().mapToDouble(rental -> rental.getAmount()).sum();
    }

    int getTotalFrequentRenterPoints() {
      return stream().mapToInt(rental -> rental.getFrequentRenterPoints()).sum();
    }
}
