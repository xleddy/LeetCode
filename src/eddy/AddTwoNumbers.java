package eddy;


public class AddTwoNumbers {


	boolean flag = false;
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode l = null;
		ListNode head = l;
		while(l1!=null||l2!=null||flag==true){
			if(l==null) {
				if(l1==null){
					head = l2;
					break;
				}else if(l2==null){
					head = l1;
					break;
				}
				l = new ListNode(addL(l1,l2));
				head = l;
				l1 = l1.next;
				l2 = l2.next;
			}else{
				l.next = new ListNode(addL(l1, l2));
				l = l.next;
				if(l1!=null) l1 = l1.next;
				if(l2!=null) l2 = l2.next;
			}
		}
		return head;
	}

	public int addL(ListNode l1,ListNode l2){
		int l = 0;
		if(l1!=null&&l2!=null){
			if(flag==true){
				if(l1.val+l2.val>8){
					l = l1.val+l2.val-9;
					flag = true;
				}else{
					l = l1.val+l2.val+1;
					flag = false;
				}
			}else{
				if(l1.val+l2.val>9){
					l = l1.val+l2.val-10;
					flag = true;
				}else{
					l = l1.val+l2.val;
					flag = false;
				}
			}
		}else if(l2==null&&l1!=null){
			if(flag==true){
				if(l1.val+1>9){
					l = l1.val-9;
					flag = true;
				}else{
					l = l1.val+1;
					flag = false;
				}
			}else{
				l = l1.val;
				flag = false;
			}
		}else if(l1==null&&l2!=null){
			if(flag==true){
				if(l2.val+1>9){
					l = l2.val-9;
					flag = true;
				}else{
					l = l2.val+1;
					flag = false;
				}
			}else{
				l = l2.val;
				flag = false;
			}
		}else if(l1==null&&l2==null&&flag==true){
			l = 1;
			flag = false;
		}
		return l;
	}
}
