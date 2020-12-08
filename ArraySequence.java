import java.util.NoSuchElementException;
public class ArraySequence implements IntegerSequence{
  private int currentIndex;
  private int []data;

  /*Construct the sequence by copying values from the other array into the data array*/
  public ArraySequence(int [] other){
      data = new int[other.length];
      for (int i = 0; i < other.length; i++) {
          data[i]=other[i];
      }
      currentIndex = 0;
  }

  public boolean hasNext() {
      if (currentIndex <= data.length-1) return true;
      return false;
  }

  public int next() {
      if (!hasNext()) throw new NoSuchElementException("there is nothing after in this sequence");
      currentIndex++;
      return data[currentIndex-1];
  }

  public int length() {
      return data.length;
  }

  public void reset() {
      currentIndex = 0;
  }

}
