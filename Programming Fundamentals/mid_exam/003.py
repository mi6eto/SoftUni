cards = input().split(', ')
n = int(input())
for i in range(0, n):
    tokens = input().split(', ')
    if tokens[0] == "Add":
        card = tokens[1]
        if card in cards:
            print("Card is already bought")
        else:
            cards.append(card)
            print("Card successfully bought")
    elif tokens[0] == "Remove":
        card = tokens[1]
        if card in cards:
            print("Card successfully sold")
            cards.remove(card)
        else:
            print("Card not found")
    elif tokens[0] == "Remove At":
        index = int(tokens[1])
        if 0 <= index < len(cards):
            cards.pop(index)
            print("Card successfully sold")
        else:
            print("Index out of range")
    elif tokens[0] == "Insert":
        index = int(tokens[1])
        card = tokens[2]
        if 0 <= index < len(cards) and card in cards:
            print("Card is already bought")
        elif 0 <= index < len(cards) and card not in cards:
            cards.insert(index, card)
            print("Card successfully bought")
        elif not 0 <= index < len(cards):
            print("Index out of range")

print(", ".join(cards))
