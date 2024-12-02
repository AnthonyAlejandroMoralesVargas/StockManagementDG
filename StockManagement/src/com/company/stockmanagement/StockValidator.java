package com.company.stockmanagement;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Utility class to validate data related to stocks, including decimal numbers,
 * integers, and dates.
 */
public class StockValidator {

    /**
     * Validates a date in the format dd/MM/yyyy.
     *
     * @param input the input date string to validate.
     * @param errors the StringBuilder to accumulate error messages.
     * @return the validated date in the format dd/MM/yyyy or null if invalid.
     */
    public static String validateDate(String input, StringBuilder errors) {
        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            dateFormat.setLenient(false);
            Date date = dateFormat.parse(input);

            Date today = new Date();
            SimpleDateFormat yearFormat = new SimpleDateFormat("yyyy");
            int year = Integer.parseInt(yearFormat.format(date));

            if (year < 2000) {
                errors.append("The year of the date must be greater than or equal to 2000.\n");
                return null; // O el valor adecuado en caso de error
            }

            if (date.compareTo(today) > 0) {
                errors.append("The date cannot be later than the current date.\n");
                return null; // O el valor adecuado en caso de error
            }

            return dateFormat.format(date);

        } catch (Exception e) {
            errors.append("Invalid date: Incorrect format. Use dd/MM/yyyy.\n");
        }
        return null;
    }
}