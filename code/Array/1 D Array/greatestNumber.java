class arrayExample{

    void maxOfArray(){
        int[] arr = { 4,6,1,76,23,54,58,98,76};
        int greatest = 0;

        for(int i = 0; i < arr.length; i++){
            if(arr[i]> greatest){
                greatest = arr[i];
            }
        }
        System.out.println("Greatest among all number is " + greatest);
    }

}

public class greatestNumber {
    public static void main(String[] args) {

        arrayExample obj = new arrayExample();
        obj.maxOfArray();

    }
}
