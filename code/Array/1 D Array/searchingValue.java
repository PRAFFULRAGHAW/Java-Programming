class searching{
    int index;
    void search(){
        int[] arr = { 4,6,1,76,23,54,58,98,76};
        boolean find = false;
        int x = 23;


        for(int i = 0; i < arr.length; i++){
            if(arr[i] == x){
                find = true;
                index = i;
                break;
            }
        }

        if(find){
            System.out.println("Given value of x is exist in given array at index " +index);
        }
        else{
            System.out.println("Given value of x is not exist in given array");
        }

    }
}
public class searchingValue {
    public static void main(String[] args) {

        searching obj = new searching();
        obj.search();
    }
}
