text = input()


for el in range(len(text)):
    ch = text[el]
    if el + 1 == len(text) or ch != text[el + 1]:
        print(ch, end="")
