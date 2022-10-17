//NAME FORWARD

public class App {
    public static void main(String args[]) {
        
      char[] firstName = { 'M', 'E', 'G' };

            System.out.println(firstName[0]);
            System.out.println(firstName[1]);
            System.out.println(firstName[2]);
            
        }
    }

//NAME BACKWARD OR REVERSE

public class App {
    public static void main(String[] args) {
        
        char[] firstName = {'M','E','G'};
        
        for (int i = firstName.length - 1; i >= 0; i--) {
          
          System.out.println (firstName[i]);
        }
    }
}

//NAME VOWELS ONLY

public class App {
    public static void main(String[] args) {

for (int i = 0; i < firstName.length; i++) {
            
            if (firstName[i] == 'A' || firstName[i] == 'E' || firstName[i] == 'I' || firstName[i] == 'O' || firstName[i] == 'U')
              
              System.out.println (firstName[i]);
        }
    }
}

//NAME CONSONANTS ONLY

public class App {
    public static void main(String[] args) {

for (int i = 0; i < firstName.length; i++) {
            
            if (!(firstName[i] == 'A' || firstName[i] == 'E' || firstName[i] == 'I' || firstName[i] == 'O' || firstName[i] == 'U'))
              
              System.out.println (firstName[i]);
        }
    }
}

