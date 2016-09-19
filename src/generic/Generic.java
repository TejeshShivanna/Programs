package generic;


public class Generic {

    public <T> void print(T[] arr){
        for(T t: arr){
            System.out.print(t+" ");
        }
    }

}
