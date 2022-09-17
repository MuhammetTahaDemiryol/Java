package Homeworks.Week1;

public class findVowels {
    
    public static void main(String[] args){
        char harf='T';
        switch(harf){
            case 'A':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("Kalin Sesli Harf");
                break;
            case 'E':
            case 'İ':
            case 'Ö':
            case 'Ü':
                System.out.println("Ince Sesli Harf");
                break;
            default:
                System.out.println("Sessiz  Harf");
                break;



        }
    }



}
