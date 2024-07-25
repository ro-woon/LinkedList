public class Node<T> {
  private T data;
  private Node<T> next;

  public Node(T data) {
    this.data = data;
    this.next = null;
  }

  //getter
  public T getData() {return data;}

  public Node<T> getNext() {return next;}

  public void setNext(Node<T> next) {
    this.next = next;
  }

}
