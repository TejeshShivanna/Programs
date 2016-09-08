package bitwise;

public class BitwisePrograms {
    public int countones(int num){
        int count;
        for(count=0; num!=0; count++){
            num = num & (num-1);
        }
        return count;
    }
}
