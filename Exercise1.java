public class App {

//precondition:
    static boolean  iwillNotCheat = true;
    
    //post condition:
    static boolean IwillWin  = true;

    public static void main(String[] args) throws Exception {
     
        // Precondition
        assert iwillNotCheat == true: "EDI SORRY!";

        enterCompetition();

        // Postcondition
        assert IwillWin == true: "YEY!!!";
        
    }

    static void enterCompetition (){
        IwillWin = false;
       
    }
}
