public abstract class Linklist {

    Node head = null;
    Node tail = null;
    //
    public void autoinsert(Object input){
        Node newNode = new Node(input);
        if(head == null){
            head = newNode;
            tail = newNode;
        }else{
            newNode.nextNode = head;
            head = newNode;
        }
    }
    //
    public void specinsert(Object input, int index){
        if (index == 0){
            autoinsert(input);
            return ;
        }
        Node newNode = new Node(input);
        Node temp = head;

        for (int i = 0; i < index - 1; i++) {
            if (temp == null) {
                System.out.println("Index doesn't exist");
                return;
            }
            temp = temp.nextNode;
        }
        if (temp == null) {
            System.out.println("Index doesn't exist");
            return;
        }
        newNode.nextNode = temp.nextNode;
        temp.nextNode = newNode;

        if (newNode.nextNode == null) {
            tail = newNode;
        }
    }
    //
    public void delete(Object input){
        if(head == null){
            System.out.println("Empty");
            return;
        }
        if (head.stuff.equals(input)) {
            head = head.nextNode;
            if (head == null) {
                tail = null;
            }
            System.out.println("Data " + input + " deleted");
            return;
        }
        Node temp = head;
        while (temp.nextNode != null && !temp.nextNode.stuff.equals(input)) {
            temp = temp.nextNode;
        }
        if (temp.nextNode == null) {
            System.out.println("Data " + input + " doesn't exist.");
            return;
        }
        if (temp.nextNode == tail) {
            tail = temp;
        }
        temp.nextNode = temp.nextNode.nextNode;
        System.out.println("Data " + input + " deleted");
    }
    //
    public void search(Object input){
        Node temp = head;
        int position = 0;
        boolean finder = false;

        while (temp != null) {
            if (temp.stuff.equals(input)) {
                System.out.println("Data " + input + " is in the index " + position);
                finder = true;
                break;
            }
            temp = temp.nextNode;
            position++;
        }
        if (!finder) {
            System.out.println("Data " + input + " didn't exist");
        }
    }
    //
    public void traversal() {
        if (head == null) {
            System.out.println("No data yet");
            return;
        }
        System.out.print("Data : ");
        Node temp = head;
        while (temp != null) {
            System.out.print("[" + temp.stuff + "] -> ");
            temp = temp.nextNode;
        }
        System.out.println("null");
    }
}