import re

text = input()

pattern = r"(?P<emoji>(:{2}|\*{2})[A-Z][a-z]{2,}\2)"

coolness = re.findall(r"\d", text)
matches = re.finditer(pattern, text)

emoji = []
countOfAllEmojis = 0

for match in matches:
    result = match.groupdict()
    countOfAllEmojis += 1
    emoji.append(result['emoji'])
coolness_sum = 1
for cool in coolness:
    coolness_sum *= int(cool)

cool_emoji_sum = 0
cool_emoji = []
for em in emoji:
    for chr in em:
        if not chr.isalnum():
            continue
        else:
            cool_emoji_sum += ord(chr)
    if cool_emoji_sum >= coolness_sum:
        cool_emoji.append(em)
        cool_emoji_sum = 0
    else:
        continue

print(f"Cool threshold: {coolness_sum}")
print(f"{countOfAllEmojis} emojis found in the text. The cool ones are:")
for em in cool_emoji:
    print("".join(em))
