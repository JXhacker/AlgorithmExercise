package NIUKE.KAOYAN;
import java.util.*;

/**
 * @author wanzhiwen
 * @time 2019/3/31
 */
public class Radius {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            float x0=sc.nextFloat();
            float y0=sc.nextFloat();
            float z0=sc.nextFloat();
            float x1=sc.nextFloat();
            float y1=sc.nextFloat();
            float z1=sc.nextFloat();
            double r=Math.sqrt(Math.pow((x0-x1),2)+Math.pow((y0-y1),2)+Math.pow((z0-z1),2));
            double v=4.0/3.0*Math.PI*Math.pow(r,3);
            System.out.println(String.format("%.3f",r)+" "+String.format("%.3f",v));
        }
    }
}
