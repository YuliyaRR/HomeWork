package home_work_2.loops;

public class Task_1_6 {
    public static void main(String[] args) {
        for (int i = 1; i < 11 ; i++) {
            String result;
            for (int j = 2; j <=5 ; j++) {
                int multiply = j * i;
                if (i < 10) {
                    result = String.format("%d * %d  = ", j, i);
                    if (multiply / 10 == 0) {
                       result = result + " " + multiply;
                    } else {
                        result = result + multiply;
                    }
                } else {
                    result = String.format("%d * %d = %d",j, i, multiply);
                }

                System.out.print(result + " | ");
            }
            System.out.println();
            if(i == 10) {
                System.out.println("-------------------------------------------------------");
            }
        }
        for (int i = 1; i < 11 ; i++) {
            String result;
            for (int j = 6; j <= 9; j++) {
                int multiply = j * i;
                if (i < 10) {
                    result = String.format("%d * %d  = ", j, i);
                    if (multiply / 10 == 0) {
                        result = result + " " + multiply;
                    } else {
                        result = result + multiply;
                    }
                } else {
                    result = String.format("%d * %d = %d", j, i, multiply);
                }

                System.out.print(result + " | ");
            }
            System.out.println();
        }



    }
}
