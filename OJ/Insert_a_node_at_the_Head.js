// Insert a node at the Head Ended
// Description

// Given a pointer to the head of a linked list, insert a new node before the head. Return a reference to the new head of the list. The head pointer given may be null meaning that the initial list is empty.

// Complete the function insertNodeAtHead in the editor below.

// insertNodeAtHeadhas the following parameter(s):

// LinkedListNode list: a reference to the head of a list
// data: the value to insert in the data field of the new node

// Input
// The first line contains an integer n, the number of elements to be inserted at the head of the list.

// The next n lines contain an integer each, the elements to be inserted, one per function call.

// 1 <= n <= 1000

// list[i] <= 1000


// Output
// For each case print the updated Linked List.


// Sample Input 1 

// 3
// 1
// 2
// 3
// Sample Output 1

// 1
// 2 1
// 3 2 1



const LinkedListNode = class {
    constructor(nodeData) {
        this.data = nodeData;
        this.next = null;
    }
};

// Complete the function below

function insertNodeAtHead(head, data) {

    var NewNode = new LinkedListNode(data);  // New Node 

    if (head === null) {
        head = NewNode;
        return head;
    }

    NewNode.next = head;
    head = NewNode;
    return head;
}
// https://www.youtube.com/watch?v=oAja8-Ulz6o&ab_channel=ApnaCollege
