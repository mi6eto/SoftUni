import re

text = input()

pattern = r"(\||#)(?P<item>[a-zA-Z(\s)]+)\1(?P<day>\d{2}/\d{2}/\d{2})\1(?P<calories>([0-9][0-9]{0,3}|10000))\1"

matches = re.finditer(pattern, text)

items = []
total_calories = 0

for match in matches:
    result = match.groupdict()
    total_calories += int(result["calories"])
    items.append(result)
calories_days = total_calories // 2000
print(f"You have food to last you for: {calories_days} days!")

for item in items:
    print(f"Item: {item['item']}, Best before: {item['day']}, Nutrition: {item['calories']}")