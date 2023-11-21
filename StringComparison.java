public class StringComparison {


    public static void main(String[] args){
        String name ="hello";
        String text = "hello";
        int count = 0;
        if(name.length()==text.length()){
            for(int i =0;i<name.length();i++){
                if(name.charAt(i)==text.charAt(i)){
                    count++;
                }
            }
            if(count == name.length()){
                System.out.println("Strings are equal");
            }
        }
        else{
            System.out.println("Strings are not equal");
        }

    }
}
