static SinglyLinkedListNode insertNodeAtHead(SinglyLinkedListNode llist, int data) {
SinglyLinkedListNode head = new SinglyLinkedListNode(data);
head.next=llist;
llist=head;
return head;

    }