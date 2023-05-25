package sutdylog;

public class PreLoginMenu {
    public static boolean functionable(){     // den xero gt vgazei kokkina (gamo tin mana tou)

      int epilogh = 1; // tha exei tin epilogh 1 2 h 3
      if(epilogh==1){    //RegisterScreen
        RegistrationForm dilosoula = new RegistrationForm();
        MyFrame RegisterScreen = new MyFrame(); // Edo ypothetoume eisagontai ta stoixeia kai tha eisagontai sto registration form
        //kodikas sygkrisis diplon stoixeion
        if (dilosoula.ID==0||dilosoula.age==0||dilosoula.epitheto==null||dilosoula.onoma==null||dilosoula.passward==null){
          MyFrame minimaLathous = new MyFrame(); // ta frames tha ta prosarmosoume pio meta me ta katallila orismata
          return true;
        }
        else{
          User xristoulis = new User(dilosoula) //tha pasaroume ston constructor tou user to registration form
          //synexizoume me tin ekxorisi tou user stin db
          int packkage;
          MyFrame paketa = new MyFrame(); //eisagogi apo ton xrhsth gia paketo
          xristoulis.setkathgoria(packkage);
        }
      }
      if(epilogh==2){     //LoginScreen
          return true;
      }
      if(epilogh==3){
        return false;
      }
    }
}
