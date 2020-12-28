words = input().split(", ")
text = input()

result = []
for word in words:
    if word in text:
        result.append(word)

print(result)
