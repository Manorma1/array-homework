public class equality {

    public static void main(String[] args) {

        int a[] = {5,2,3};
        int b[]= {5,2,3};
        int num=0;
        if(a.length==b.length){
            for(int i =0;i<a.length;i++){
                if(a[i]!=b[i]){
                num = 1 ;
                break;}

            }

            }
        else{
            num=0;
        }
        if(num==0){
            System.out.println("two araays are equal");
        }
        else{
            System.out.println(" two arrays are not equal");

        }






        }




    }







