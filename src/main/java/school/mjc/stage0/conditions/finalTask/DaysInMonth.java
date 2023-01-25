package school.mjc.stage0.conditions.finalTask;

public class DaysInMonth {
    public void printDays(int year, int month) {
        int r = year % 400 == 0 || year % 100 == 0 || year % 4 == 0 ? 1 : 0;
        if(year>0&&month>=1&&month<=12) {
            if (r == 1 && month == 2)
                System.out.println(29);
            else
                switch (month) {
                    case (1):
                    case (3):
                    case (5):
                    case (7):
                    case (8):
                    case (10):
                    case (12):
                        System.out.println(31);
                        break;
                    case (2):
                        System.out.println(28);
                        break;
                    case (4):
                    case (6):
                    case (9):
                    case (11):
                        System.out.println(30);
                        break;
                }
        } else
            System.out.println("wrong number!");
}}
