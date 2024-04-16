public class Password{
    public static void main(String []args){
        
    }
    public boolean PasswordCheck(String pass){
        boolean ch = true ;
        int digitCounter = 0 ; 
        if (pass.length < 8 ){
            ch = false ; 
        }
        else {
            for (int i= 0 ; i < pass.length(); i++){
                char carac = pass.charAt(i);
                if( ! Character.isLetterOrDigit(carac)){
                    ch = false;
                    break;

                }
                else if(Character.isDigit(carac)){
                    digitCounter ++ ;
                }
                    
            }
        }
        return ch;
    }
}