package questao3;

import java.util.Scanner;

public class palindromas {

	public static void main(String[] args) {
		 Scanner ler = new Scanner(System.in);

	      int i, j;
	      String s;

	      System.out.printf("fale uma palavra:\n");
	      s = ler.nextLine();

	      int n = s.length();
	      i = 0; 
	      j = (n - 1); 
	      boolean eh = true; 
	      while ((i <= j) && (eh == true)) {
	        if (Character.toUpperCase(s.charAt(i)) != Character.toUpperCase(s.charAt(j)))
	           eh = false;
	        else {
	          i = i + 1;
	          j = j - 1;
	        }
	      }

	      if (eh == true)
	         System.out.printf("\n%s eh um palindromo.\n", s);
	      else
	         System.out.printf("\n%s \"nao\" é um palindromo.\n", s);
	    }

	}

