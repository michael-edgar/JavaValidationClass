public class validationClassMike {
    public static void main(String[] args) {

    }

    public static boolean isValidEmail (String Email)
    {
        boolean valid = true;
        int i, amountAts = 0, midPoint = 999;
        String Start, End;


        for(i = 0; i < Email.length(); i++)
        {
            if(Email.charAt(i) == '@')
            {
                amountAts ++;
                midPoint = i;
            }
        }

        if(amountAts != 1)
        {
            valid = false;
        }

        else
        {
            Start = Email.substring(0, midPoint);
            End = Email.substring((midPoint+1), Email.length());
        }

        return valid;
    }
}
