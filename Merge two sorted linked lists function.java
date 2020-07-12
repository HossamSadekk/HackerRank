static SinglyLinkedListNode mergeLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
if(head1==null)
{
    return head2;
}
else if(head2==null)
{
    return head1;
}

SinglyLinkedListNode head3 = null;

if(head1.data < head2.data)
{
    head3 = head1;
    head1 = head1.next;
}
else
{
    head3 = head2;
    head2 = head2.next;
}


SinglyLinkedListNode current = head3;

while(head1!=null && head2!=null)
{
    if(head1.data<head2.data)
    {
        current.next = head1;
        head1=head1.next;
    }
    else
    {
        current.next = head2;
        head2=head2.next;
    }

    current = current.next;

    
}
if(head1==null)
    {
      current.next = head2;   
    }
    else
    {
        current.next=head1;
    }
return head3;
    }