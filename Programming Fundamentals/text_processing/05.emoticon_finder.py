text = input()

for el in range(len(text)):
    emoji = text[el]
    if emoji == ":":
        print(emoji + text[el + 1])
