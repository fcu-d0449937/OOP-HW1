package fcu.iecs.oop;
public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          String lyrics = "Let it go!Let it go!Connot hold it back anymore";
          System.out.println(lyrics);
          String lyrics1 = lyrics.replace("Connot","can't");

          System.out.println(
        		  lyrics1.replace("it","\"her\""));
	}

}
