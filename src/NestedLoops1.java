


        public class NestedLoops1 {
            public static void main(String[] args) {
                for (int i = 1; i <= 5; i++) {  // Outer loop controls the number of rows
                    for (int j = 1; j <= i; j++) {  // Inner loop prints stars in each row

                        System.out.print("*"); // output line
                        if (j<i) {
                            System.out.print(",");
                        }

                    }
                    System.out.println();
                }
            }
        }

