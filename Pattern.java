
public class Pattern {
    public int decrCalc(int num){
        int f = 0, s = 0, max = 0;
        f= (num * num)/100;  
        s = ((num-1) * (num-1))/100;  
        while (f-s ==1) {
            num++;
            f= (num * num)/100;  
            s = ((num-1) * (num-1))/100; 
                                          };
        return num;
    }
    public static void main(String[] args){
        Pattern d = new Pattern();
        System.out.println("The number that breaks the pattern is " 
        + d.decrCalc(59));
    }
}
