package stringPrograms;

public class strStrImplementation {

    public static void main(String[] args) {

        System.out.println(verifyStrStr("prathameshingale" , "meffs"));
    }

    public static int verifyStrStr(String main , String sub){

        if(main.contains(sub)){

           int index = (main.indexOf(sub));
           return index;

        }
        else
          return -1;
    }
}
