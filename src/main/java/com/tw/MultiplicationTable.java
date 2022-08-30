package com.tw;

public class MultiplicationTable {
    public String create(int start, int end) {
        return isValid(start, end) ? generateSingleExpression(start, end) : null;
    }


    public Boolean isValid(int start, int end) {

        return (start >= 4 && end <= 100) ? true : false;
    }

    public Boolean isInRange(int number) {
        return (number > 0 && number <= 1000) ? true : false;
    }

    public Boolean isStartNotBiggerThanEnd(int start, int end) {
        return start <= end;
    }

    public String generateTable(int start, int end) {
        String generateAll = "";
        for(int i = start; i <= end; i++){
            for(int x = start; x <= i; x++){
                String table = x +"*"+i+"="+x*i;
                if(x == i) {
                    generateAll += table;
                }
                else {
                    generateAll += table+"  ";
                }
            }
            if(i != end) {
                generateAll += System.lineSeparator();
            }
        }
        return generateAll;
    }



    public String generateLine(int start, int row) {

        String line = "";
        for(int i = 2; i <= row; i++){
            String table = i +"*"+row+"="+i*row;
            if(i == row)
            {
                line += table;
            }
            else {

                line += table+"  ";
            }

        }
        return line;
    }


    public String generateSingleExpression(int multiplicand, int multiplier) {

        return  multiplicand + "*" + multiplier + "=" + (multiplicand * multiplier);
    }
}
