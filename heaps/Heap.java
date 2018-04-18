public class Heap{

    private int[] heap;
    private int size;

    public Heap(int capacity){
      heap = new int(capactity);
    }

    public void insert(int value){
      if(isFull()){
        throw new IndexOutOfBoundsException("Heap is full");
      }

      heap[size] = value;

      fixHeapAbove(size);
      size++;
    }

    //sifting up till greater than parent or at root
    private void fixHeapAbove(int index){
      //new value entered
      int newValue = heap[index];
      //is index of new value  index greater than root
      // is value greater than parent
      while(index > 0 && newValue > heap[getParent(index)]){
        //swap parent down if smaller
        heap[index] = heap[getParent(index)];
        //new index of new value is now parents
        index = getParent(index);
      }
      //insert new value into heap where none is greater
      heap[index] = newValue;
    }

    public boolean isFull(){
      return size == heap.length
    }

    public int getParent(int index){
      return (index - 1) / 2;
    }
}
