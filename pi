class Node:
    def __init__(self, data):
        self.data = data
        self.next = None

class SinglyLinkedList:
    def __init__(self):
        self.head = None

    def insert_at_head(self, data):
        new_node = Node(data)
        new_node.next = self.head
        self.head = new_node

    def insert_at_position(self, data, position):
        if position == 0:
            self.insert_at_head(data)
            return
        new_node = Node(data)
        current = self.head
        for _ in range(position - 1):
            if current is None:
                return  # position out of bounds
            current = current.next
        if current is None:
            return
        new_node.next = current.next
        current.next = new_node

    def delete(self, key):
        current = self.head
        prev = None
        while current:
            if current.data == key:
                if prev:
                    prev.next = current.next
                else:
                    self.head = current.next
                return
            prev = current
            current = current.next

    def search(self, key):
        current = self.head
        while current:
            if current.data == key:
                return True
            current = current.next
        return False

    def traverse(self):
        current = self.head
        while current:
            print(current.data, end=" -> ")
            current = current.next
        print("None")

ll = SinglyLinkedList()

ll.insert_at_head(17)
ll.insert_at_head(18)
ll.insert_at_head(19)
ll.insert_at_head(76)
ll.insert_at_head(44)


ll.insert_at_position(34, 3)

ll.delete(18)

print(ll.search(19)) # True

ll.traverse()
# 44 -> 76 -> 19 -> 34 -> 17 -> None
