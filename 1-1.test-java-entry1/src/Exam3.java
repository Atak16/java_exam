public class Exam3 {
    public static void main(String[] args) {
        int item1 = (200 * 3);    
        int item2 = (250 * 4);
        int subprice = (item1 + item2);
        System.out.println("⼩計");
        System.out.println(subprice);

        int tax =(int)(subprice * 0.1);
        System.out.println("消費税");
        System.out.println(tax);

        System.out.println("合計⾦額");
        System.out.println(subprice + tax);
        
    }
    
}
