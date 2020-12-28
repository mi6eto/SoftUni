import re

text = input()

pattern = r"(:|\*){2}([A-Z][a-z]{2,})\1{2}"

matches = re.findall(pattern, text)

mirror_words = []
pairs = 0
for match in matches:
    first_word = match[1]
    second_word = match[2]
    pairs += 1
    if first_word == second_word[::-1]:
        mirror_words.append(first_word + " <=> " + second_word)
        continue

if len(matches) == 0:
    print("No word pairs found!")
    print(f"No mirror words!")
    exit()
if len(mirror_words) == 0:
    print(f"{pairs} word pairs found!")
    print(f"No mirror words!")
    exit()
print(f"{pairs} word pairs found!")
print(f"The mirror words are:")
print(", ".join(mirror_words))
