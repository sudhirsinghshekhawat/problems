package com.leetcode.problems;

public class ExcelSheetColumnNumber {
    public String convertToTitle(int columnNumber) {
        StringBuilder sb = new StringBuilder();
        while (columnNumber-- > 0) {
            sb.append((char)(columnNumber % 26 + 'A'));
            columnNumber /= 26;
        }
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        ExcelSheetColumnNumber excelSheetColumnNumber = new ExcelSheetColumnNumber();
        int columNumber = 28;
        String columnName = excelSheetColumnNumber.convertToTitle(columNumber);
        System.out.println(columnName);


    }


}
