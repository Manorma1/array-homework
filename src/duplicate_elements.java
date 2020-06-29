public class duplicate_elements {
    public static void main(String[] args) {
        int[]arr =new int []{5,2,6,2,3,8,4,5,4};
        System.out.println("duplicate element inarray is");
        for(int i = 0; i<arr.length;i++){
            for(int j = i+1; j < arr.length;j++ ){
                if(arr[i]==arr[j])
                    System.out.println(arr[j]);

            }


        }








    }






}
