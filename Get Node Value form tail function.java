static int getNode(SinglyLinkedListNode head, int positionFromTail) {

SinglyLinkedListNode pointer=head;
int c=0;
while(head!=null)
{
    head = head.next;
    if(c<positionFromTail+1)
    {
        c++;
    }
    else
    {
        pointer = pointer.next;
    }
}
return pointer.data;

    }