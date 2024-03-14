public class Main {
    //deklarasi nilai
    public static void main(String[] args){

        int arr[] = {1, 2, 3, 4, 5};
        int sum = 0;
        //menentukan ganjil
        System.out.println("Angka Ganjil : ");
        for (int j : arr) {
            sum += j;
            if (j % 2 != 0) {
                System.out.println(j);
                sum += j;
            }
        }

        //menentukan genap
        System.out.println("Angka Genap : ");
        for (int j : arr){
            if (j %2 == 0){
                System.out.println(j);
            }
        }

        System.out.println("Total : " + sum);
    }
}