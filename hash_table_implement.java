Class HashNode(K,V){
  K key;
  V value

  public HashNode(K key, V value){
    this.key = key;
    this.value = value;
  }
}
class Map(K , V){
  // Current capacity of array list 
    private int numBuckets; 
   //Map implemetation list
    private ArrayList<HashNode<K, V>> bucketArray; 
    // Current size of array list 
    private int size; 
  
  
  public Map(){
    bucketArray = new ArrayList<>();
    numBuckets = 10; 
    size = 0; 
    // To create some empty chains:
    for(int i =0;i<numBuckets;i++){
      bucketArray.add(null);
    }
  }
  public int hashCodeCalc(int key){
    
    int hashcode = key.hashCode();
    int index = hashcode%size(bucketArray);
    return index;
  }

// Add a new KV pair to the hash, need to find the head first
int bucketIndex = hashCodeCalc(key); 
HashNode<K, V> head = bucketArray.get(bucketIndex); 
// Add's key by checking whether the key is already present in the chain, if so corresponding value will be added to ti
public void addKeyValuePair(K key, V value){
  while(head!=null){
  if(head.key.equals(key)){
    head.value = value
  }
    head = head.next;
  }
  // Adding new chain 
    size++;
    HashNode<K, V> newNode = new HashNode<>();
    newNode.next = head;
    bucketArray.add(newNode);
 // Rehashing
 int Loadfactor = size/numBuckets;
  if(Loadfactor>0.7){
     ArrayList<HashNode<K, V>> temp = new ArrayList<>();
     numBuckets = 2* numBuckets;
     size = 0;
     for (int i = 0; i < numBuckets; i++) 
                bucketArray.add(null); 

}
  
