def parse_chr(word):
    temp = ""
    for c in word:
        if not str(c).isdigit():
            break
        temp += c
    ascii_value = int(temp)
    char_value = chr(ascii_value)
    new_word = word.replace(temp, char_value)
    return new_word


def change_chr(word):
    temp = list(word)
    temp[1], temp[-1] = temp[-1], temp[1]

    return "".join(temp)


def decrypt(word):
    res = parse_chr(word)
    res = change_chr(res)
    return res


words = input().split()
new_words = [decrypt(word) for word in words]

print(" ".join(new_words))
