char_index = int(input())
char_end_index = int(input())

for ch in range(char_index, char_end_index + 1):
    print(chr(ch), end=" ")
