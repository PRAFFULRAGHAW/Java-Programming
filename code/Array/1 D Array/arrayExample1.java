class arrayEx{

    void arrayDemo(){

        int[] age = new int[3];
        String[] name = new String[3];
        float[] weight = new float[3];

//        Array declaration using literals
        int[] marks ={50, 70, 85};

        age[1] = 35;
        age[0] = 45;
        age[2] = 40;
//        age[4] = 55;  ArrayIndexOutOfBoundsException

        name[0] = "Prafful Raghaw";
        name[2] = "Surya Prakash";
        name[1] = "Kundan Kumar";

        weight[0] = 76.2f;
        weight[1] = 70.2f;
        weight[2] = 35.0f;

        for (int ages : age){
            System.out.println(ages);
        }

        System.out.println(" Name : " + name[0] + " age: " + age[0] + " Weight: " + weight[0] + " Marks: " + marks[0]);
        System.out.println(" Name : " + name[1] + " age: " + age[1] + " Weight: " + weight[1] + " Marks: " + marks[1]);
        System.out.println(" Name : " + name[2] + " age: " + age[2] + " Weight: " + weight[2] + " Marks: " + marks[2]);




    }


}

public class arrayExample1 {
    public static void main(String[] args) {

        arrayEx obj1 = new arrayEx();
        obj1.arrayDemo();
    }
}
