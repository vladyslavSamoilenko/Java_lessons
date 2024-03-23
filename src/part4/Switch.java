package Part4;

public class Switch {
    public static void main(String[] args) {
        var a = 4 ;

        switch (a){
            case 1:{
                System.out.println("1");
                break;
            }
            case 2:{
                System.out.println("2");
                break;
            }
            case 3:{
                System.out.println("3");
                break;
            }
            default:{
                System.out.println("default");
                break;
            }
        }
    }
}
