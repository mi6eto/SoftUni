class Inventory:
    def __init__(self, capacity):
        self.__capacity = capacity
        self.__left_capacity = capacity

    items = []

    def add_item(self, item):

        if len(self.items) < self.__capacity:
            self.items.append(item)
            self.__left_capacity -= 1
        return f'not enough room in the inventory'

    def get_capacity(self):
        return self.__capacity

    def __repr__(self):
        result = ', '.join(self.items)
        return f'Items: {result}.\nCapacity left: {self.__left_capacity}'


inventory = Inventory(2)
inventory.add_item("potion")
inventory.add_item("sword")
print(inventory.add_item("bottle"))
print(inventory.get_capacity())
print(inventory)
