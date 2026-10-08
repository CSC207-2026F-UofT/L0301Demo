package ambiguous_overloading;

public class Week4WorksheetQuestionOne {


  // in class we talked about how IntelliJ can help us learn about
  // various cases, like ambiguous calls to overloaded methods.
  // In particular, uncalled methods are greyed out, just like
  // unused local variables or parameters.
  static void myFun(String a, Object b) { System.out.println(a); }
  static void myFun(Object a, String b) { System.out.println(b); }

  static void myFunB(String a) { System.out.println(a); }
  static void myFunB(Integer a) { System.out.println(a); }


  public static void main(String[] args) {

    myFun("hello", (Object)"goodbye");
    myFunB((String)null);
    myFunB(2);
  }

}
