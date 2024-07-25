public class MyStack<T> {
  private MyLinkedList<T> list = new MyLinkedList<>();


  //push
  public void push(T item) {
    list.add(item);
  }

  //pop
  public T pop() {
    if (list.isEmpty()) {
      throw new IllegalStateException("empty stack!");
    }
    int lastIndex = list.size()-1;
    T top = list.get(lastIndex);
    list.delete(lastIndex);
    return top;
  }

  //peek
  public T peek() {
    if (list.isEmpty()) {
      throw new IllegalStateException("empty stack!");
    }
    int lastIndex = list.size()-1;
    T top = list.get(lastIndex);
    return top;
  }




}
