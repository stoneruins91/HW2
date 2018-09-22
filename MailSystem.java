import java.util.ArrayList;
import java.util.Scanner;

/**
   A system of voice mail boxes.
*/
public class MailSystem
{
   /**
      Constructs a mail system with a given number of mailboxes
      @param mailboxCount the number of mailboxes
   */
   public MailSystem(int mailboxCount)
   {
      mailboxes = new ArrayList<>();

      // Initialize mail boxes.

      for (int i = 0; i < mailboxCount; i++)
      {
         String passcode = "" + (i + 1);
         String greeting = "You have reached mailbox " + (i + 1)
               + ". \nPress (1), to leave message, Press(2) to access your mailbox";
         mailboxes.add(new Mailbox(passcode, greeting));// nay thieu cai nay
      }
   }

   /**
      Locate a mailbox.
      @param ext the extension number
      @return the mailbox or null if not found
   */
   public Mailbox findMailbox(String ext)
   {
	  try {
		  int i = Integer.parseInt(ext);
		  if (1 <= i && i <= mailboxes.size())
		         return  mailboxes.get(i - 1);
	  }
	  catch(Exception e)
	  {
		  System.out.println(e.getMessage());
	  }
      return null;
   }

   private ArrayList<Mailbox> mailboxes;
}
