// /** Queue storing elements of type T. */
// public class Queue<T> {
//    private Node<T> first; // Referenz auf den zuerst eingefügten Knoten
//    private Node<T> last;  // Referenz auf den zuletzt eingefügten Knoten
//    private int size;   // Größe der Queue

//    /** A node of a linked list with data of type T as inner class. */
//    private class Node<T> {
//       protected T data;
//       protected Node<T> next;
//       public Node(T data, Node<T> nextNode) {
//          this.data = data; next = nextNode;
//       }
//       public String toString() {
//          return data.toString();
//       }
//    }
   
//    /** Inserts an element into this queue.*/
//    public void offer(T data) {
//       if (first == null) { // queue is empty
//          first = last = new Node<>(data, last);
//       } else {
//          Node<T> oldLast = last;
//          last = new Node<>(data, null);
//          oldLast.next = last;
//       }
//       size++;
//    }
    
//    /** Returns and deletes the first element of this queue.*/
//    public T poll() {
//       if (first == null) return null; // list is empty
//       Node<T> node = first;
//       first = first.next;
//       if (first == null) {
//          last = first;
//       }
//       size--;
//       return node.data;
//    }   
   
//    @Override
//    public String toString() {
//       String out = "{";
//       if (first != null) {
//          out += first;
//          Node<T> node = first.next;
//          while (node != null) {
//             out += ", " + node;
//             node = node.next;
//          }
//       }
//       out += "}";
//       return out;
//    }
   
//    public static void main(String[] args) {
//       Queue<String> satz = new Queue<>();
//       satz.offer("Die Wuerde");
//       satz.offer("des Menschen");
//       satz.offer("ist unantastbar");
//       System.out.println(satz.poll() + " " + satz);
//       satz.poll();
//       satz.poll();
//       satz.offer("insanın");
//       satz.offer("onuru");
//       satz.offer("dokunulmazdır");
//       javax.swing.JOptionPane.showMessageDialog(null, satz);
//    }
// }
