import java.util.*;

public class DiziBirlestirme {
    public static void main(String[] args) {

        List<Integer> array1=new ArrayList<>();
        List<Integer> array2=new ArrayList<>();
        Set<Integer> mergedArray=new HashSet<>();

        Scanner scanner = new Scanner(System.in);
        System.out.print("1. Dizi Elemanlarını Girin (virgülle ayrılmış): ");
        String array1Input = scanner.nextLine();
        System.out.print("2. Dizi Elemanlarını Girin (virgülle ayrılmış): ");
        String array2Input = scanner.nextLine();

        String[] array1String = array1Input.split(",");
        String[] array2String = array1Input.split(",");

        for (String num:array1String){
            array1.add(Integer.parseInt(num.trim()));
        }

        for (String num:array2String){
            array2.add(Integer.parseInt(num.trim()));
        }

        mergedArray.addAll(array1);
        mergedArray.addAll(array2);

        System.out.print("Birleştirilmiş Dizi: ");
        for (Integer num : mergedArray){
            System.out.print(num + ",");
        }




    }
}

