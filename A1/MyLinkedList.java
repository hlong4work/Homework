/** A linkesd list of nodes representing elements of type T.*/
public class MyLinkedList<T> {
   private Node<T> head;
   private int size;

   /**Die Daten neu nach dem ersten Vorkommen der Daten nach einfügt, 
    wenn diese vorhanden sind, und sie ansonsten ans Ende der Liste setzt. */
  
   public void einfuegenNach(T neu, T nach)   {
   if (head == null){
      head = new Node<>(nach, head);
      size++;
   } else{
      while(head!=null){
      head = head.next;
        }
      if (head != null){
         head = new Node<>(nach, head);
         size++;
         }
      }
   }

   /** Inserts a node at the front of this list.*/
   public void addFirst(T data) {
      head = new Node<>(data, head);
      size++;
   }
    
   /** Returns true if this list contains the specified data. */
   public boolean contains(T searchData) {
      Node<T> node = head;
      while (node != null) {
         if (searchData.equals(node.data)) {
            return true;
         }
         node = node.next;
      }
      return false;
   }
    
   /** Deletes the first node with data and returns true if it existed.*/
   public boolean remove(T data) {
      if (head != null && data.equals(head.data)) { // head is deleted ...
         head = head.next;
         return true;
      }
      
      Node<T> node = head, nodePrev = null;
      while (node != null) {
         if (data.equals(node.data)) {
            nodePrev.next = node.next;
            size--;
            return true;
         }
         nodePrev = node;
         node = node.next;
      }
      return false;
   }
   
   public String toString() {
      String out = "{";
      if (head != null) {
         out += head;
         Node<T> node = head.next;
         while (node != null) {
            out += ", " + node;
            node = node.next;
         }
      }
      out += "}";
      return out;
   }
   
   public static void main(String[] args) {
      MyLinkedList<String> satz = new MyLinkedList<>();
      satz.addFirst("unantastbar");
      satz.addFirst("ist");
      satz.addFirst("des Menschen");
      satz.addFirst("Wuerde");
      satz.addFirst("Die");
      System.out.println(satz);
      System.out.println("Enthaelt \"Die\": " + satz.contains("Die"));
      System.out.println("Enthaelt \"die\": " + satz.contains("die"));
      satz.remove("ist");
      System.out.println(satz);
      satz.remove("Die");
      System.out.println(satz);
   }
}

