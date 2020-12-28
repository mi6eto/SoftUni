some_text = input()

chars = {}

for ch in some_text:
    if ch == ' ':
        continue
    if ch not in chars:
        chars[ch] = 0
    chars[ch] += 1
for key, value in chars.items():
    print(f'{key} -> {value}')
