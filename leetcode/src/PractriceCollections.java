import java.util.*;
import java.util.concurrent.DelayQueue;

public class PractriceCollections {
    public static void main(String[] args) {

        Collection collection = new Stack();
        // 가장 상위의 Collection 인터페이스이다.
        // .add(element): 요소를 추가한다.
        // .addAll(Collection): collection을 추가한다.
        // .remove(Object): 컬렉션에서 지정된 요소를 제거한다.
        // .size(): 컬렉션의 요소 수를 반환한다.
        // .clear(): 컬렉션의 모든 요소를 제거한다.
        // .isEmpty(): 컬렉션이 비어있는지 여부를 반환한다.
        // .contains(Object): 컬렉션에 지정된 요소가 포함되어 있는지 여부를 반환한다.
        // .iterator(): 컬렉션의 요소를 반복할 수 있는 iterator를 반환한다.

        List ArrayListList = new ArrayList();
        List LinkedListList = new LinkedList();
        List VectorList = new Vector();
        List StackList = new Stack();
        // Collection의 가장 상위의 List 인터페이스이다.
        // 순서가 있는 요소의 컬렉션이다.
        // .get(int index): 지정된 위치의 요소를 반환합니다.
        // .set(int index, E element): 지정된 위치의 요소를 지정된 요소로 바꾼다.
        // .add(int index, E element): 지정된 위치에 요소를 삽입한다.
        // .remove(int index): 지정된 위치의 요소를 제거한다.
        // .indexOf(Object): 지정된 요소의 첫 번째 발생 위치를 반환한다.
        // .lastIndexOf(Object): 지정된 요소의 마지막 발생 위치를 반환한다.
        // .subList(int fromIndex, int toIndex): 지정된 범위의 요소를 포함하는 부분 목록을 반환한다.

        Queue DelayQueueQueue = new DelayQueue();
        Queue PriorityQueueQueue = new PriorityQueue();
        Queue ArrayDequeQueue =  new ArrayDeque();
        // Collection의 가장 상위의 Queue 인터페이스이다.
        // FIFO(First-On-First-Out)원칙을 따르는 요소의 컬렉션이다.
        // .offer(E e): Queue의 끝에 요소를 삽입한다.
        // .poll(): Queue의 앞에서 요소를 제거하고 반환한다.
        // .peek(): Queue의 앞에서 요소를 제거하지 않고 반환한다. 요소가 없을 때, null을 반환한다.
        // .remove(): Queue의 앞에서 요소를 제거한다.
        // .element(): Queue의 앞에서 요소를 제거하지 않고 반환한다. 요소가 없을 때, 예외를 발생한다.

        Set HashSetSet = new HashSet();
        Set LinkedHashSetSet = new LinkedHashSet();
        Set TreeSetSet = new TreeSet();
        // Collection의 가장 상위의 Set 인터페이스이다.
        // 중복을 허용하지 않는 요소의 컬렉션이다.
        // .add(E e): 집합에 요소를 추가한다.
        // .remove(Object): 집합에서 지정된 요소를 제거한다.
        // .contains(Object): 집합에 지정된 요소가 포함되어 있는지 여부를 반환한다.
        // .iterator(): 집합의 요소를 반복할 수 있는 iterator를 반환한다.

        Map HashMapMap = new HashMap();
        Map LinkedHashMapMap = new LinkedHashMap();
        Map TreeMapMap = new TreeMap();
        Map HashtableMap = new Hashtable();
        Map PropertiesMap = new Properties();
        // 가장 상위의 Map 인터페이스이다.
        // 키와 값을 쌍을 매핑하는 객체이다.
        // .put(K key, V value): 지정된 키에 값을 매핑한다.
        // .get(Object key): 지정된 키에 매핑된 값을 반환한다.
        // .remove(Object key): 지정된 키에 매핑된 값을 제거한다.
        // .containsKey(Object key): 맵이 지정된 키를 포함하고 있는지 여부를 반환한다.
        // .containsValue(Object value): 맵이 하나 이상의 지정된 값을 포함하고 있는지 여부를 반환한다.
        // .keySet(): 맵의 모든 키를 포함하는 Set을 반환한다.
        // .values(): 맵의 모든 값을 포함하는 Collection을 반환한다.
        // .entrySet(): 맵의 모든 키-값 매핑을 포함하는 Set을 반환한다.








    }
}