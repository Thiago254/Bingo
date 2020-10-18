package com.claudino;


import java.util.Arrays;
import java.util.Random;

class Bingo {
    public static void main(String[] args) {

        int[] row = new int[24];

        Random random = new Random();

        int v1 = random.nextInt(1 + 75);     
        int v2 = random.nextInt(1 + 75);
        int v3 = random.nextInt(1 + 75);
        int v4 = random.nextInt(1 + 75);
        int v5 = random.nextInt(1 + 75);
        int v6 = random.nextInt(1 + 75);
        int v7 = random.nextInt(1 + 75);
        int v8 = random.nextInt(1 + 75);
        int v9 = random.nextInt(1 + 75);
        int v10 = random.nextInt(1 + 75);
        int v11 = random.nextInt(1 + 75);
        int v12 = random.nextInt(1 + 75);
        int v13 = random.nextInt(1 + 75);
        int v14 = random.nextInt(1 + 75);
        int v15 = random.nextInt(1 + 75);
        int v16 = random.nextInt(1 + 75);
        int v17 = random.nextInt(1 + 75);
        int v18 = random.nextInt(1 + 75);
        int v19 = random.nextInt(1 + 75);
        int v20 = random.nextInt(1 + 75);
        int v21 = random.nextInt(1 + 75);
        int v22 = random.nextInt(1 + 75);
        int v23 = random.nextInt(1 + 75);
        int v24 = random.nextInt(1 + 75);

        row[0] = v1;
        row[1] = v2;
        row[2] = v3;
        row[3] = v4;
        row[4] = v5;
        row[5] = v6;
        row[6] = v7;
        row[7] = v8;
        row[8] = v9;
        row[9] = v10;
        row[10] = v11;
        row[11] = v12;
        row[12] = v13;
        row[13] = v14;
        row[14] = v15;
        row[15] = v16;
        row[16] = v17;
        row[17] = v18;
        row[18] = v19;
        row[19] = v20;
        row[20] = v21;
        row[21] = v22;
        row[22] = v23;
        row[23] = v24;


        System.out.println(
                Arrays.toString(row) + "\t" + "\n" );
    }
}

