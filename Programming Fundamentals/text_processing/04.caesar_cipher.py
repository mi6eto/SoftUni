text = input()

text_chr = []

for ch in text:
    text_chr.append(ord(ch) + 3)

for c in text_chr:
    print(chr(c), end="")
