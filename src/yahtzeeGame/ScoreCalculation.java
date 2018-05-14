package yahtzeeGame;

import java.util.Arrays;

public class ScoreCalculation  implements VariablesYahtzee, CasesYahtzee {

    public int yatz() {
        int yatz = 0;
        for (int i = 1; i <= 6; i++) {
            if (num1[0] == i && num1[1] == i && num1[2] == i && num1[3] == i && num1[4] == i) {
                yatz = 50;
            }
        }
        return yatz;
    }

    public int ace() {
        int one = 0;
        if (num1[0] == 1) {
            one = one + 1;
        }
        if (num1[1] == 1) {
            one = one + 1;
        }
        if (num1[2] == 1) {
            one = one + 1;
        }
        if (num1[3] == 1) {
            one = one + 1;
        }
        if (num1[4] == 1) {
            one = one + 1;
        }

        return one;
    }

    public int two() {
        int two = 0;
        if (num1[0] == 2) {
            two = two + 2;
        }
        if (num1[1] == 2) {
            two = two + 2;
        }
        if (num1[2] == 2) {
            two = two + 2;
        }
        if (num1[3] == 2) {
            two = two + 2;
        }
        if (num1[4] == 2) {
            two = two + 2;
        }

        return two;
    }

    public int three() {
        int three = 0;
        if (num1[0] == 3) {
            three = three + 3;
        }
        if (num1[1] == 3) {
            three = three + 3;
        }
        if (num1[2] == 3) {
            three = three + 3;
        }
        if (num1[3] == 3) {
            three = three + 3;
        }
        if (num1[4] == 3) {
            three = three + 3;
        }

        return three;
    }

    public int four() {
        int four = 0;
        if (num1[0] == 4) {
            four = four + 4;
        }
        if (num1[1] == 4) {
            four = four + 4;
        }
        if (num1[2] == 4) {
            four = four + 4;
        }
        if (num1[3] == 4) {
            four = four + 4;
        }
        if (num1[4] == 4) {
            four = four + 4;
        }

        return four;
    }

    public int five() {
        int five = 0;
        if (num1[0] == 5) {
            five = five + 5;
        }
        if (num1[1] == 5) {
            five = five + 5;
        }
        if (num1[2] == 5) {
            five = five + 5;
        }
        if (num1[3] == 5) {
            five = five + 5;
        }
        if (num1[4] == 5) {
            five = five + 5;
        }

        return five;
    }

    public int six() {
        int six = 0;
        if (num1[0] == 6) {
            six = six + 6;
        }
        if (num1[1] == 6) {
            six = six + 6;
        }
        if (num1[2] == 6) {
            six = six + 6;
        }
        if (num1[3] == 6) {
            six = six + 6;
        }
        if (num1[4] == 6) {
            six = six + 6;
        }

        return six;
    }

    public int threeok() {
        int tokv = 0;
        Arrays.sort(num1);

        for (int i = 0; i <= 6; i++) {
            if (num1[0] == i && num1[1] == i && num1[2] == i
                    || num1[1] == i && num1[2] == i && num1[3] == i
                    || num1[2] == i && num1[3] == i && num1[4] == i) {
                for (int a = 0; a <= 4; a++) {
                    tokv = tokv + num1[a];
                }
            }

        }
        return tokv;

    }

    public int fourok() {
        int fokv = 0;
        Arrays.sort(num1);

        for (int i = 0; i <= 6; i++) {
            if (num1[0] == i && num1[1] == i && num1[2] == i && num1[3] == i
                    || num1[1] == i && num1[2] == i && num1[3] == i && num1[4] == i) {
                for (int b = 0; b <= 4; b++) {
                    fokv = fokv + num1[b];
                }
            }
        }
        return fokv;

    }

    public int chnc() {
        int ch = 0;
        for (int i = 0; i < 5; i++) {
            ch = ch + num1[i];
        }
        return ch;
    }

    public int ss() { 
        int smallstraight = 0;
        
        for (int scores[] : scores) {
            if (Arrays.equals(num1, scores)) {
                smallstraight = 30;
            }
        }
        
        
        return smallstraight;
    }

    public int largestr() {
        Arrays.sort(num1);
        int largestraight = 0;
        for (int larstr[] : lst) {
            if (Arrays.equals(num1, larstr)) {
                largestraight = 40;
            }
        }
        return largestraight;
    }

    public int fullhuse() {
        int fullhouse = 0;

        Arrays.sort(num1); 
System.out.println(num1[0]);
System.out.println(num1[1]);
System.out.println(num1[2]);
System.out.println(num1[3]);
System.out.println(num1[4]);


        if ((((num1[0] == num1[1]) && (num1[1] == num1[2]))
                && // Three of a Kind
                (num1[3] == num1[4])
                && // Two of a Kind
                (num1[2] != num1[3]))
                || ((num1[0] == num1[1])
                && // Two of a Kind
                ((num1[2] == num1[3]) && (num1[3] == num1[4]))
                && // Three of a Kind
                (num1[1] != num1[2]))) {
            fullhouse = 25;
        }
        return fullhouse;
    }
}