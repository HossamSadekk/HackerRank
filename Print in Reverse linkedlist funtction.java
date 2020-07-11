static void reversePrint(SinglyLinkedListNode head) {
        while(head == null)
        {
            return;
        }

Stack<SinglyLinkedListNode> s = new Stack();
SinglyLinkedListNode current = head;

while(current != null)
{
   s.add(current);
   current = current.next;
}

while(!s.isEmpty())
{
    SinglyLinkedListNode res = s.pop();
    System.out.println(res.data);
}

    }