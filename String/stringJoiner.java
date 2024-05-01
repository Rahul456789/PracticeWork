
import java.util.StringJoiner;

public class stringJoiner {
    public static void main(String[] args) {
        String arr[] = { "Rahul", "Kumar", "Jha", "ECE", "8th Sem", "2024 Batch" };

        StringJoiner sj = new StringJoiner(" : ");

        sj.add(arr[0]).add(arr[1]).add(arr[2]);

        System.out.println(sj);
        System.out.println(sj.length());

        StringJoiner sj1 = new StringJoiner(" : ");
        sj1.add(arr[3]).add(arr[4]).add(arr[5]);

        System.out.println(sj1);

        sj.merge(sj1);
        System.out.println(sj);

        StringJoiner sj2 = new StringJoiner(" * ");

        sj2.setEmptyValue("StringJoiner is Empty, Please Add Values.");
        System.out.println(sj2);

        String str = sj.toString();
        String str1 = sj1.toString();

        System.out.println(str.concat(str1));
    }
}
