public class AddTwoNumbersListNode {
    int val;
    AddTwoNumbersListNode next = null;
    AddTwoNumbersListNode() {}
    AddTwoNumbersListNode(int val) {
        this.val = val;
    }
    AddTwoNumbersListNode(int val, AddTwoNumbersListNode next) {
        this.val = val; this.next = next;
    }

    public String toStringNext(AddTwoNumbersListNode next, String string) {


        if (next != null) {
            string += ", next= " + Integer.toString(next.val);

            string = toStringNext(next.next, string);

        }


        return string;
    }

    @Override
    public String toString() {

        return "AddTwoNumbersListNode{" +
                "val=" + Integer.toString(this.val) + this.toStringNext(this.next, "") +
                "}";
    }
}
