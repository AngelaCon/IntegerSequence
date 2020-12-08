import java.util.NoSuchElementException;


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
      return (Math.abs(start - end)+1);
    }
  public boolean hasNext(){
      if ((current - end) > 0)return false;
      return true;
    }
  //@throws NoSuchElementException
  public int next(){
      if (!hasNext()) throw new NoSuchElementException("there is nothing after in this sequence");
      current ++;
      return (current-1);
  }

}
