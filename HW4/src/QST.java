/**
 *
 * @author Kyle Den Hartog
 */
import java.util.List;
import java.util.LinkedList;

public class QST {
// do not add more fields--these are enough
    QST LL, LM, ML, MM;
    int x, y;

// constructor--takes key (x,y) as input
    public QST(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
// inserts a new (x,y) key
    public void insert(int x, int y) {
        if (x < this.x && y < this.y) {
            if (LL == null) {
                LL = new QST(x, y);
                System.out.println("(" + LL.x + "," + LL.y + ")");
            } else {
                LL.insert(x, y);
            }
        }
        
        if (x < this.x && y >= this.y) {
            if (LM == null) {
                LM = new QST(x, y);
                System.out.println("(" + LM.x + "," + LM.y + ")");
            } else {
                LM.insert(x, y);
            }
        }
        
        if (x >= this.x && y < this.y) {
            if (ML == null) {
                ML = new QST(x, y);
                System.out.println("(" + ML.x + "," + ML.y + ")");
            } else {
                ML.insert(x, y);
            }
        }
        
        if (x >= this.x && y >= this.y) {
            if (MM == null) {
                MM = new QST(x, y);
                System.out.println("(" + MM.x + "," + MM.y + ")");
            } else {
                MM.insert(x, y);
            }
        }
    }
    
// returns true iff key (x,y) == (this.x,this.y) or
// is in the *corresponding* child (DO NOT search
// the whole tree)
    
    public boolean search(int x, int y) {
        if (x == this.x && y == this.y){
            return true;
        }else if(x == LL.x && y == LL.y){
            return true;
        }else if(x == LM.x && y == LM.y){
            return true;
        }else if(x == ML.x && y == ML.y){
            return true;
        }else return x == MM.x && y == MM.y;
    }
    
// range search: returns a list with the pairs
    public List rangeSearch(int x0, int x1, int y0, int y1) {
    // *suggested* heading of the code
        List<int[]> L = new LinkedList();
        if ((x0 <= x && x <= x1) && (y0 <= y && y <= y1)) {
            L.add(new int[]{x, y});
        }
        
            if(LL != null)
                L.addAll(LL.rangeSearch(x0,x1,y0,y1));
            if(LM != null)
                L.addAll(LM.rangeSearch(x0,x1,y0,y1));
            if(ML != null)
                L.addAll(ML.rangeSearch(x0,x1,y0,y1));
            if(MM != null)
                L.addAll(MM.rangeSearch(x0,x1,y0,y1));            
            
        return L;
    }
}
