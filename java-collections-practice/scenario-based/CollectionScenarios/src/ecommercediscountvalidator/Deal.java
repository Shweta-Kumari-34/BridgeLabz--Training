package ecommercediscountvalidator;

import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.regex.*;

class Deal {
    String code;
    LocalDate validTill;
    int discount;
    int minPurchase;

    Deal(String code, String validTill, String discount, String minPurchase) {
        this.code = code;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        this.validTill = LocalDate.parse(validTill, formatter);
        this.discount = Integer.parseInt(discount.replace("%", ""));
        this.minPurchase = Integer.parseInt(minPurchase);
    }

    @Override
    public String toString() {
        return code + " [" + discount + "% off, Min: " + minPurchase + ", Valid Till: " + validTill + "]";
    }
}



