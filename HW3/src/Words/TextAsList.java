package Words;

/**
 *
 * @author kyle
 */
public class TextAsList {
// head of the internal linked list 

    LLNode head;

// Constructor 1: 
    public TextAsList() {
        head = null;
    }

// Constructor 2: String--represents the String as list 
    public TextAsList(String s) {
        char[] c = s.toCharArray();
        for (int i = 1; i < c.length + 1; i++) {
            LLNode nNode = new LLNode(c[c.length - i]);
            nNode.next = head;
            head = nNode;
        }
    }

// Constructor 3: char[]--represents the char[] as list 
    public TextAsList(char[] c) {
        for (int i = 1; i < c.length + 1; i++) {
            LLNode nNode = new LLNode(c[c.length - i]);
            nNode.next = head;
            head = nNode;
        }
    }

// Returns the length of the text
    public int length() {
        int t = 0;
        LLNode hNode = head;
        while (hNode != null) {
            hNode = hNode.next;
            t = 0;
        }
        return t;
    }

// Converts the internal linked list into a String;
// Note: (new TextAsList("Hey")).asString() should give us // the String "Hey"
    public String asString() {
        String temp = "";
        LLNode tNode = head;
        while (tNode != null) {
            temp = tNode.val + temp;
            tNode = tNode.next;
        }
        return temp;
    }

// Makes use of asString 
    public String toString() {
        return "TextAsList(" + this.asString() + ")";
    }

// Converts the internal linked list into an array of chars;
    public char[] toCharArray() {
        char[] temp = new char[this.length()];
        for (int i = 0; i < this.length(); i++) {
            temp[i] = head.val;
        }
        return temp;
    }
// Appends a char, char array, or String to the linked list; // TextAsList tal = new TextAsList("H");
// tal.append(’e’);
// tal.append("y!");
// System.out.println( tal.asString() ); // should print String "Hey!"

    public void append(char c) {
        LLNode nNode = new LLNode(c);
        nNode.next = head;
        head = nNode;
    }

    public void append(char[] c) {
        for (int i = 0; i < c.length; i++) {
            append(c[i]);
        }
    }

    public void append(String s) {
        char[] temp = s.toCharArray();
        append(temp);
    }

// Reverses the order of the linked list. 
    public void reverse() {
        LLNode cNode = null;
        LLNode tNode = head;
        while (tNode != null) {
            LLNode next = tNode.next;
            tNode.next = cNode;
            cNode = tNode;
            tNode = next;
        }
        head = cNode;
    }

    public static void main(String[] args) {
        TextAsList tal = new TextAsList("Hello");
        tal.append('t');
        tal.append("here");
        System.out.println(tal.asString());
    }
}
