public class validationClass {
    public static void main(String[] args) {

    }

    public static boolean isPositiveInteger(String a)
    {
        int i;
        for(i=0;i<a.length();i++)
        {
            if(!Character.isDigit(a.charAt(i)))
                break;
        }
        if(i==a.length())
            return true;
        else
            return false;
    }

    public static boolean isNegativeInteger(String a) {
        int i=1;

        if (a.charAt(0)=='-')
            for(i=1;i<a.length();i++)
                if(!Character.isDigit(a.charAt(i)))
                    break;
        if(i==a.length())
            return true;
        else
            return false;
    }

    public static boolean isPositiveOrNegativeInteger(String a)
    {
        int i;
        boolean valid=false;

        if(a.charAt(0)=='-')
        {
            for(i=1;i<a.length();i++)
                if(!Character.isDigit(a.charAt(i)))
                    break;

            if(i==a.length())
                valid = true;
        }

        else if(a.charAt(0)!='-')
        {
          for(i=0;i<a.length();i++)
              if(!Character.isDigit(a.charAt(i)))
                  break;

          if(i==a.length())
              valid = true;
        }

        return  valid;
    }

   // public static boolean isPositiveFloat
}
