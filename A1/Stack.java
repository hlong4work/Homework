import java.util.Scanner;

/** A stack elements of type T. It only contains a pointer to the top.*/
public class Stack<T> {
   private Node<T> top;
   private int size;

   //Palindrome
   public static boolean Palindrom() {
   Scanner keyboard = new Scanner(System.in);
   System.out.println("Input: ");
   String input = keyboard.nextLine();
   

   }
   
   
   /** A node as an object of an inner class. */
   private class Node<T> {
      protected T data;
      protected Node<T> next;
      public Node(T data, Node<T> nextNode) {
         this.data = data; next = nextNode;
      }
      public String toString() {
         return data.toString();
      }
   }
   
   /** Inserts an element into this stack.*/
   public void push(T data) {
      top = new Node<>(data, top);
      size++;
   }
    
   /** Returns the element having been input at last,and deletes it from this stack.*/
   public T pop() {
      if (top == null) return null; // stack is empty
      Node<T> node = top;
      top = top.next;
      size--;
      return node.data;
   }
   
   public String toString() {
      String out = "{";
      if (top != null) {
         out += top;
         Node<T> node = top.next;
         while (node != null) {
            out += ", " + node;
            node = node.next;
         }
      }
      out += "}";
      return out;
   }
   
   public static void main(String[] args) {
      Stack<Integer> q = new Stack<>();
      q.push(2); q.push(3); q.push(5); q.push(7);
      System.out.println(q);       // {7, 5, 3, 2}
      System.out.println(q.pop()); // 7
      System.out.println(q);       // {5, 3, 2}
      System.out.println(q.pop()); // 5
      System.out.println(q);       // {3, 2}
      q.push(11); q.push(13); q.push(17);
      System.out.println(q);       // {17, 13, 11, 3, 2}
      q.pop(); q.pop(); q.pop(); q.pop(); q.pop();
      System.out.println(q.pop()); // null
      System.out.println(q);       // {}
   }
}
