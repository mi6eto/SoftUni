owned_cards = input().split(", ")
num_commands = int(input())
command_input = input()

command_count = 0
card_list = [owned_cards]
new_card = []
while command_count <= num_commands:
    command_count += 1
    tokens = command_input.split(", ")
    command = tokens[0]

    if command == "Add":
        index = tokens[1]
        if index not in owned_cards:
            print("Card successfully bought")
            card_list.append(index)
        else:
            print("Card is already bought")
    elif command == "Remove":
        index = tokens[1]
        if index in owned_cards:
            print("Card successfully sold")
            owned_cards.remove(index)
        else:
            print("Card not found")
    elif command == "Remove At":
        index = int(tokens[1])
        if 0 <= index < len(owned_cards):
            owned_cards.pop(index)
            print("Card successfully sold")

        else:
            print("Index out of range")
    elif command == "Insert":
        index = int(tokens[1])
        card = tokens[2]
        if 0 <= index < len(owned_cards) and card not in owned_cards:
            print("Card is already bought")
            owned_cards.insert(index, card)
        elif not 0 <= index < len(owned_cards):
            print("Index out of range")

command_input = input()
print(", ".join(card_list))
