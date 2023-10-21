//https://leetcode.com/problems/flatten-nested-list-iterator/
import java.util.*;
public class FlattenedListIterator {

     // This is the interface that allows for creating nested lists.
     // You should not implement it, or speculate about its implementation
     public interface NestedInteger {

         // @return true if this NestedInteger holds a single integer, rather than a nested list.
         public boolean isInteger();

         // @return the single integer that this NestedInteger holds, if it holds a single integer
         // Return null if this NestedInteger holds a nested list
         public Integer getInteger();

         // @return the nested list that this NestedInteger holds, if it holds a nested list
         // Return empty list if this NestedInteger holds a single integer
         public List<NestedInteger> getList();
     }

    public class NestedIterator implements Iterator<Integer> {
        private List<Integer> flattenedList;
        private Iterator<Integer> iterator; 

        public NestedIterator(List<NestedInteger> nestedList) {
            flattenedList = new ArrayList<>();
            flatten(nestedList);
            iterator = flattenedList.iterator();
        }

        public void flatten(List<NestedInteger> list){
            for(NestedInteger n: list){
                if(n.isInteger()){
                    flattenedList.add(n.getInteger());
                }else{
                    flatten(n.getList());
                }
            }
        }

        @Override
        public Integer next() {
            return iterator.next();
        }

        @Override
        public boolean hasNext() {
            return iterator.hasNext();
        }
    }

/**
 * Your NestedIterator object will be instantiated and called as such:
 * NestedIterator i = new NestedIterator(nestedList);
 * while (i.hasNext()) v[f()] = i.next();
 */
}
