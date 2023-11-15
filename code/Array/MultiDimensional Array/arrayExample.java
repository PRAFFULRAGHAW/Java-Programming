class arrayEx{

    void arrayDemo(){

        int[][] age = new int[2][2];

//      2-DArray declaration using literals
        int[][] marks ={{50, 70}, {85, 40}};

        age[0][0] = 35;
        age[0][1] = 40;
        age[1][0] = 45;
        age[1][1] = 55;
//      age[4][2] = 55;  ArrayIndexOutOfBoundsException

//        Using Length function

        for( int i = 0; i < age.length; i++){
            for(int j = 0; j < age[i].length; j++){
                System.out.print(age[i][j] + " ");
            }
            System.out.println();
        }


//        Manual Method
        for(int i = 0; i <= 1; i++){
            for (int j = 0; j <=1; j++){
                System.out.print(age[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println( "Age " + age[0][0] + " Marks " + marks[0][0]);
        System.out.println( "Age " + age[0][1] + " Marks " + marks[0][1]);
        System.out.println( "Age " + age[1][0] + " Marks " + marks[1][0]);
        System.out.println( "Age " + age[1][1] + " Marks " + marks[1][1]);



    }


}

public class arrayExample {
    public static void main(String[] args) {

        arrayEx obj1 = new arrayEx();
        obj1.arrayDemo();
    }
}
