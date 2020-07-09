 static SinglyLinkedListNode insertNodeAtPosition(SinglyLinkedListNode head, int data, int position) {

        SinglyLinkedListNode i=head;
        SinglyLinkedListNode newnode = new SinglyLinkedListNode(data);
        for(int j=0;j<position-1;j++)
        {
            i=i.next;
        }

        newnode.next=i.next;
        i.next=newnode;

return head;
    }