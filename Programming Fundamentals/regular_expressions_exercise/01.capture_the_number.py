import re
text = input()

numbers = []
pattern = r"\d+"
while text:
    match = re.findall(pattern, text)
    if match:
        numbers.extend(match)
    text = input()

print(*numbers, sep=" ")