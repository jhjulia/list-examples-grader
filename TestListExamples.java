import static org.junit.Assert.*;
import java.util.*;
import org.junit.*;

public class TestListExamples {
  // Write your grading tests here!
  public class Check1 implements StringChecker{
    public boolean checkString(String s){
      return s.contains("a");
    }
  }
  @Test
  public void testFilter(){
      List<String> list1 = new ArrayList<>();
      list1.add("apple");
      list1.add("banana");
      List<String> list2 = new ArrayList<>();
      list2 = ListExamples.filter(list1, new Check1());
      assertEquals(list1, list2);
  }
      
@Test
public void testMerge(){
  List<String> list1 = new ArrayList<>(Arrays.asList("a", "b", "c", "d"));
  List<String> list2 = new ArrayList<>(Arrays.asList("e", "f", "g"));
  List<String> output = new ArrayList<>(Arrays.asList("a", "b", "c", "d", "e", "f", "g"));
  assertEquals(output, ListExamples.merge(list1, list2));

}

  
}
