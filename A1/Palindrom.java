/** My method for Palindrom is to have 2 pointers, 1 running 2 times the other.
 * as 1 get to the end, the other be at the first half of the stack.
 * then i flip the first second of the Palindrom and compare till one pointer reach null.
 This solution is based on suggestion on the internet, but very efficient agains large stack.
 */

class Palindrom {
    public boolean isPalindrom(Stack top){
        // Two pointers to iterate through Stack
        Stack topslow = top; // topslow will 2-times slower than topfast
        Stack topfast = top;
        
        
        while (topfast != null && topfast.next != null) {
        topfast = topfast.next.next;
        topslow = topslow.next;
        }

        
        topslow = reversed(topslow);
        topfast = top;
        
        while(topslow!= null){
            if (topslow.data != topfast.data){
                return false;
            }
            topfast = topfast.next; 
            topslow = topslow.next;
        }
    
    return true;
    }

    //reverse the second half of the stack
    public Stack reversed(Stack topslow){
        Stack prev = null;
        while (top != null){
            Stack next = head.next;
            node.next= prev;
            prev = top;
            top = next;

        }
        return prev;
    }
}


