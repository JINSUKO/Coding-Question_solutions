/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

public class AddTwoNumbers2 {


    public static void main(String[] args) {

        AddTwoNumbersListNode l1 = new AddTwoNumbersListNode(4);
        AddTwoNumbersListNode l1_1 = new AddTwoNumbersListNode(2, l1);
        AddTwoNumbersListNode l1_2 = new AddTwoNumbersListNode(8, l1_1);

        AddTwoNumbersListNode l2 = new AddTwoNumbersListNode(3);
        AddTwoNumbersListNode l2_1 = new AddTwoNumbersListNode(7, l2);
        AddTwoNumbersListNode l2_2 = new AddTwoNumbersListNode(5, l2_1);

    }

    public static AddTwoNumbersListNode addTwoNumbers(AddTwoNumbersListNode l1, AddTwoNumbersListNode l2) {
        // 받아올림 기능을 구현하는 부분도 필요함.
        // 로직 = 새로운 노드를 계속 생성하면서
        //       ListNode.next에 새로운 노드의 주소를 넣어야 한다.
        //       초기 노드가 사라지지 않게 주소를 저장하는 변수가 있어야하고
        //       새롭게 계속 만들어서 값이 넣어지고 next에 주소가 저장될 노드의
        //       주소를 저장할 노드를 저장할 변수도 있어야 한다.


        // 초기 노드의 주소를 저장해야한다.
        // 초기 노드의 주소를 저장하는 노드를 생성한다.
        AddTwoNumbersListNode head = null;
        // 값을 넣을 노드를 생성한다.
        AddTwoNumbersListNode curr = new AddTwoNumbersListNode();

        head = curr;


        // 받아올림 값을 받을 변수
        int carry = 0;

        while (!(l1 == null && l2 == null && carry == 0)) {


            curr.next = new AddTwoNumbersListNode((carry + ((l1 == null) ? 0 : l1.val) + ((l2 == null) ? 0 : l2.val)) % 10);

            carry = (carry + ((l1 == null) ? 0 : l1.val) + ((l2 == null) ? 0 : l2.val)) / 10;

            curr = curr.next;

            l1 = ((l1 == null) ? null : l1.next);
            l2 = ((l2 == null) ? null : l2.next);

        }
        // return head.next;
        return curr;

    }


//    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//
//        String num1str = "";
//        String num2str = "";
//
//        ListNode l1_1 = l1;
//        ListNode l2_1 = l2;
//
//        while (l1_1 != null)  {
//
//            num1str =  Integer.toString(l1_1.val) + num1str;
//            l1_1 = l1_1.next;
//        }
//
//        while (l2_1 != null) {
//
//            num2str =  Integer.toString(l2_1.val) + num2str;
//            l2_1 = l2_1.next;
//        }
//
//        BigInteger num1 = new BigInteger(num1str);
//        BigInteger num2 = new BigInteger(num2str);
//
//        char[] num = (num1.add(num2)).toString().toCharArray();
//
//        ListNode l3 = null;
//
//        for (int i = 0; i < num.length; i++) {
//
//            if(i == 0) {
//                l3 = new ListNode(Integer.valueOf(Character.toString((char) (num[i]))));
//
//            } else {
//                l3 = new ListNode(Integer.valueOf(Character.toString((char) (num[i]))), l3);
//            }
//
//        }
//
//        return l3;
//    }
}

