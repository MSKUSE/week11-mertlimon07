
public class Main {
    public static void main(String[] args) {

        Stack stack=new StackLinkedList();
        try{
            stack.pop();}
        catch(MyEmptyStackException e){
            System.out.println(e);
        }

        /*

    ArrayList<String>stringList=new ArrayList<>();
    stringList.add("String");
    stringList.add("Ali");
        System.out.println(stringList);

    HashMap<String,Double>grades=new HashMap<>();
    grades.put("Ali",18.0);
    grades.put("Pelin",75.4);
    grades.put("Koray",4.5);
        System.out.println(grades);
    grades.put("ali",100.0);
        System.out.println(grades);
*/


    }
}