package Ex05_SwitchStatement;

public class p15_Demo2_updated_switchstatement {
    public static void main(String args[]) {

String day  = "Sunday";
  String result =switch(day)
  {
      case "Saturday" ,"Sunday":yield "6AM";
      case "Monday" :yield "8AM";
      default :yield  "7AM";

  };

System.out.println(result);





    }
    }
