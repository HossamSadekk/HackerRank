
static SinglyLinkedListNode deleteNode(SinglyLinkedListNode head, int position) {
SinglyLinkedListNode i = head;
if(position==0)
{
    head=head.next;
}
else{
for(int count=0;count<position-1;count++)
    {
        i=i.next;
    }
    
SinglyLinkedListNode j=i.next;
i.next=j.next;}
return head;
    }}
