package div.ele;

public class SearchTree implements NodeList{

    private ListItem root = null;

    public SearchTree(ListItem root) {
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        return root;
    }

    @Override
    public boolean addItem(ListItem listItem) {
        if(this.root == null) {
            //the tree was empty, so our item becomes the head
            this.root = listItem;
            return true;
        }
        //otherwise, start comparing from the head of the tree
        ListItem currentItem = this.root;
        while (currentItem != null) {
            int comparison = currentItem.compareTo(listItem);
            if(comparison<0) {
                //new list item is greater, move right if possible
                if(currentItem.next() != null) {
                    currentItem = currentItem.next();
                } else  {
                    //there is no node to the right, so add at this point
                    currentItem.setNext(listItem);
                    return true;
                }
            } else if(comparison > 0) {
                //newItem is less , move left if possible
                if(currentItem.previous() != null) {
                    currentItem = currentItem.previous();
                } else {
                    //there's no node to the left, so add at this point
                    currentItem.setPrevious(listItem);
                    return true;
                }
            } else {
                //equal so don't add
                System.out.println(listItem.getValue() + " is already present");
                return false;
            }
        }
        //we can't get here, but java complains if there's a return
        return false;
    }

    @Override
    public boolean removeItem(ListItem item) {
        if(item != null) {
            System.out.println("Deleting item " + item.getValue());
        }
        ListItem currentItem = this.root;
        ListItem parentItem = currentItem;

        while (currentItem != null) {
            int comparison = (currentItem.compareTo(item));
            if(comparison < 0) {
                parentItem = currentItem;
                currentItem = currentItem.next();
            } else if( comparison > 0) {
                parentItem  = currentItem;
                currentItem = currentItem.previous();
            } else {
                //equal: we've found item so remove it
                performRemoval(currentItem, parentItem);
                return true;
            }
        }
        return false;
    }

    private void performRemoval (ListItem item, ListItem parent) {
        //remove item from the tree
        if(item.next()  == null) {
            //no right tree, so make parent point to a left tree (which may be null);
            if(parent.next() == item) {
                //item is right child of its parent
                parent.setNext(item.previous());
            } else if( parent.previous() == item) {
                //item is left child of it's parent
                parent.setPrevious(item.previous());
            } else {
                //parent must be item, which means we were looking at the root of the tree.
                this.root = item.previous();
            }
        } else if( item.previous() == null) {
            //no left tree, so make parent point to right tree (which may be null)
            if(parent.next() == item) {
                //item is right child of its parent
                parent.setNext(item.next());
            } else if(parent.previous() == item) {
                //item is left child of it's parent
                parent.setPrevious(item.next());
            } else {
                //again, we are deleting the root
                this.root = item.next();
            }
        } else {
            //neither left nor right are null, deletion is now a lot trickier:
            //from right sub-tree, find the smallest value (i.e, the leftmost).
            ListItem current = item.next();
            ListItem leftMostParent  = item;
            while (current.previous() != null) {
                leftMostParent = current;
                current = current.previous();
            }
            //now put the smallest value into our node to be deleted
            item.setValue(current.getValue());
            //and delete the smallest
            if (leftMostParent == item) {
                // there were no leftmost node, so 'current' points to the smallest
                //node (the one that must now be deleted).
                item.setNext(current.next());
            } else {
                //set the smallest node's parent to point to
                //the smallest node's right child (which may be null).
                leftMostParent.setPrevious(current.next());
            }
        }
    }

    @Override
    public void traverse(ListItem listItem) {
        if (root != null) {
            traverse(root.previous());
            //to the left of root
            System.out.println(root.getValue());
            traverse(root.next());
            //to the right of root.
        }
    }
}
