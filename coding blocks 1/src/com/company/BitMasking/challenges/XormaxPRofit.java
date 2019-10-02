package com.company.BitMasking.challenges;

import java.util.Scanner;

public class XormaxPRofit {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int x=s.nextInt();
        int y=s.nextInt();
        System.out.println(maxXORInRange(x,y));

    }
    static int maxXORInRange(int L, int R)
    {
        // get xor of limits
        int LXR = L ^ R;

        //  loop to get msb position of L^R
        int msbPos = 0;
        while (LXR > 0)
        {
            msbPos++;
            LXR >>= 1;
        }

        // construct result by adding 1,
        // msbPos times
        int maxXOR = 0;
        int two = 1;
        while (msbPos-- >0)
        {
            maxXOR += two;
            two <<= 1;
        }

        return maxXOR;
    }
}
