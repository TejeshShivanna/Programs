package bitwise;

public class BitwisePrograms {

    public int onesInNumber(int num){
        if(num==0) return 0;
        if(num==1) return 1;
        int count = 0;
        while(num>0){
            count += (num&1);
            num = num >> 1;
        }
        return count;
    }

    public int[] countBits(int num) {
        if(num==0) return new int[]{0};
        if(num==1) return new int[]{0,1};
        else
        {
            int[] ans = new int[num+1];
            ans[1] =1;
            int count = 1, prev = 1;
            for(int i=2; i<=num; i++){
                if(i != prev*2){
                    ans[i] = ans[count] + 1;
                    count++;
                }
                else{
                    prev = i;
                    ans[i] = 1;
                    count = 1;
                }
            }
            return ans;
        }
    }
}
