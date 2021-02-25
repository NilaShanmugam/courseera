
//Java program to create HashMap from an array 
// by taking the elements as Keys and 
// the frequencies as the Values 

HashMap <Integer, String> hm = new HashMap<Integer, String>();


// arr[i] => Key

for (int i =0;i<arrr.length;i++){
int count = hm.get(arr[i]);
// First occurence of the element (Eg: 2 is occuring for 1st time)
  if(hm.get(arr[i]==null){
    hm.put(arr[i],1);
  }
     else{
       hm.put(arr[i],++c);
     }

//Iteration
for(Map.Entry m : hm.entrySet()){
  System.out.println(m.getKey(),m.getValue());
}
}
