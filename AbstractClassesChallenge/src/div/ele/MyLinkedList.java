package div.ele;


import java.util.List;

public class MyLinkedList implements NodeList {

    private ListItem root = null;

    public MyLinkedList(ListItem root) {
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        return this.root;
    }

    @Override
    public boolean addItem(ListItem listItem) {
        if(this.root == null) { //so the root is empty and it becomes the head
            this.root = listItem;
            return true;
        }
        ListItem currentItem = this.root;
        while (currentItem != null) {
            int comparison = currentItem.compareTo(listItem);
            if(comparison < 0) {
                if(currentItem.next() != null) {
                    currentItem = currentItem.next();
                } else {
                 //there is no next, so insert at end of list.
                 currentItem.setNext(listItem).setPrevious(currentItem);
                 return true;
                }
            } else if (comparison > 0) {
                //new item is less than current item, insert before
                if(currentItem.previous() != null) {
                    currentItem.previous().setNext(listItem).setPrevious(currentItem.previous());
                } else {
                    // the node with a previous is the root
                    listItem.setNext(this.root).setPrevious(listItem);
                    this.root = listItem;
                }
                return true;
            } else {
                return false; //equl
            }
        }
        return false;
    }

    @Override
    public boolean removeItem(ListItem listItem) {
        if(listItem  != null) {
            System.out.println("Deleting item " + listItem.getValue());
        }
        ListItem currentItem = this.root;
        while (currentItem != null) {
            int comparison = currentItem.compareTo(listItem);
            if(comparison ==0) {
                //found the item to delete
                if(currentItem == this.root) {
                    this.root = currentItem.next();
                } else {
                    currentItem.previous().setNext(currentItem.next());
                    if(currentItem.next() != null) {
                        currentItem.next().setPrevious(currentItem.previous());
                    }
                }
                return true;
            } else if(comparison<0) {
                currentItem = currentItem.next();
            } else  {
                //comparison > 0
                //we are at an item greater than the one to be deleted.
                //so the item is not in the list
                return false;
            }
        }
        //we have reached the end of the list
        //without finding the item to delete
        return  false;
    }

    @Override
    public void traverse(ListItem listItem) {
        if(root ==null) {
            System.out.println("The list is empty");
        } else {
            while (root != null) {
                System.out.println(root.getValue());
                root = root.next();
            }
        }
    }
}
