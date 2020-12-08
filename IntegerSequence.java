import java.util.NoSuchElementException;

public static void main(String[] args) {


}

public interface IntegerSequence{
  boolean hasNext();//does the sequence have more elements?
  int next();       //return the current value in the sequence and advances to the next element.
  int length();     //returns the total length of the sequence
  void reset();     //start over from the start of the sequence
}


public class Range implements IntegerSequence{
  private int start,end,current;
  public Range(int start,  int end){
      this.start =start;
      this.end = end;
      current = start;
    }
  public void reset(){
      this.current = start;
    }
  public int length(){
      return (Math.abs(min - max)+1);
    }
  public boolean hasNext(){
      if ((current - end) > 0)return true;
      return false;
    }
  //@throws NoSuchElementException
  public int next(){
      if (hasNext) throw NoSuchElementException("there is nothing after in this sequence");
      current ++;
      return (current-1);
  }

}
