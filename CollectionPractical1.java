import java.util.LinkedList;
import java.util.Collection;

class CollectionPractical1{
	public CollectionPractical1 () {
		 int size;
		 Collection <Integer> c = new LinkedList();
		 c.add(5);
		 c.add(4);
		 c.add(3);
		 c.add(2);
		 
		 boolean isEmpty = c.isEmpty();
		 System.out.println(isEmpty);
		 
		 System.out.println(c);
		 
		 size = c.size();
		 System.out.println(size);	

         boolean contains = c.contains(4);
         System.out.println(contains);
         
         c.remove(4);
         System.out.println(c);		 
		 
}

   public static void main(String[] args) {
        new CollectionPractical1();
   }
}
