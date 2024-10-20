import java.util.List;
import java.util.ArrayList;
import java.util.Random;

public class Demo {
    public static void main(String[] args) {

        int size = 10_000;
        List<Integer> numsArr = new ArrayList<>(size);
        Random randomObj = new Random();

        for(int i=1;i<=size;i++){
            numsArr.add(randomObj.nextInt(100));
        }

        long startSeq= System.currentTimeMillis();
        int seq = numsArr.stream()
        .map(n->{
            try {
                Thread.sleep(1);
            } catch (Exception e) {
                System.out.println("err in Thread Execution"+e.getStackTrace());
            }
            return n*2;
        })
        .mapToInt(i->i)
        .sum();
        long endSeq= System.currentTimeMillis();

        long startPara= System.currentTimeMillis();
        int para = numsArr.parallelStream()
        .map(n->{
            try {
                Thread.sleep(1);
            } catch (Exception e) {
                System.out.println("err in Thread Execution"+e.getStackTrace());
            }
            return n*2;
        })
        .mapToInt(i->i)
        .sum();
        long endPara= System.currentTimeMillis();

        System.out.println(seq+" "+para);
        System.out.println("seq: "+(endSeq-startSeq));
        System.out.println("para: "+(endPara-startPara));
    }
    
}
