def characters_in_range(a):
    chars = []
    for char in range(char1 + 1, char2):
        char = chr(char)
        chars.append(char)
    return chars


char1 = ord(input())
char2 = ord(input())
result = char1 + char2
print(*characters_in_range(result))
