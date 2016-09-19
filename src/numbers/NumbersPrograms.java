package numbers;

import java.util.HashSet;

public class NumbersPrograms {
    public int addSquaresInNumber(int num){
        int res = 0;
        while(num>0){
            res += Math.pow(num%10, 2);
            num /= 10;
        }
        return res;
    }

    public boolean isHappy(int n) {
        if(n<=1) return true;
        HashSet<Integer> distinct = new HashSet<>();
        distinct.add(n);
        while(true){
            n = addSquaresInNumber(n);
            if(n == 1) return true;
            if(distinct.contains(n)) break;
            distinct.add(n);
        }
        return false;
    }

    public int maxDivide(int a, int b)
    {
        while (a%b == 0)
            a = a/b;
        return a;
    }

    public int isUgly(int num)
    {
        num = maxDivide(num, 2);
        num = maxDivide(num, 3);
        num = maxDivide(num, 5);

        return (num == 1)? 1 : 0;
    }

    public int reverse(int x) {
        if(x>-10 && x<10) return x;
        int res = 1;
        if(x<0){
            res = -1;
            x = res*x;
        }
        int sum=0,r=0;
        while(x>0){
            r = x%10;
            sum = sum*10+r;
            x=x/10;
        }

        return res==1?sum:0-sum;

    }
}
