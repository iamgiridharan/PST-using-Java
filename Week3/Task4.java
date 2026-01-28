package Week3;
import java.util.*;
import java.util.stream.*;
class Student1{
    int id;
    String fname;
    double cgpa;

    Student1(int id, String fname, double cgpa){
        this.fname=fname;
        this.id=id;
        this.cgpa=cgpa;
    }
}
public class Task4{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int N=sc.nextInt();

        List<Student1> students=new ArrayList<>();
        
        for (int i=0;i<N;i++){
            int id=sc.nextInt();
            String fname=sc.next();
            double cgpa=sc.nextDouble();
            students.add(new Student1(id, fname, cgpa));

        }
        int K=sc.nextInt();
        String result=students.stream()
            .sorted(
                Comparator.comparingDouble((Student1 s)-> s.cgpa)
                .reversed()
                .thenComparing(s -> s.fname)
                .thenComparingInt(s -> s.id)
            )
            .limit(K)
            .map(s->s.fname)
            .collect(Collectors.joining(" "));
    
        System.out.println(result);
        sc.close();
    }
}