package NIUKE.KAOYAN;
import java.util.*;

/**
 * @author wanzhiwen
 * @time 2019/4/11
 */


class Student1{
    String id;
    String name;
    String sex;
    int age;
    Student1(String id, String name, String sex, int age){
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.age = age;
    }
}
public class StuInf{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num, queryNum;
        String queryId;
        String id;
        String name;
        String sex;
        int age;
        while (sc.hasNext()){
            num = sc.nextInt();
            Student1[] students = new Student1[num];
            for (int i = 0; i < num; i++) {
                id = sc.next();
                name = sc.next();
                sex = sc.next();
                age = sc.nextInt();
                students[i] = new Student1(id, name, sex, age);
            }
            queryNum = sc.nextInt();
            for (int i = 0; i < queryNum; i++){
                queryId = sc.next();
                boolean flag = false;
                for (int j = 0; j < num; j++){
                    if (students[j].id.equals(queryId)){
                        System.out.println(students[j].id+" "+students[j].name+" "+students[j].sex+" "+students[j].age);
                        flag = true;
                        break;
                    }
                }
                if (!flag) System.out.println("No Answer!");
            }
        }
    }
}

