import re

n = int(input())

pattern = r"(?P<command>![A-Z][a-z]{3,}!):(?P<message>\[[a-zA-Z]{8,}\])"
result = {}
for i in range(n):
    message = input()
    match = re.search(pattern, message)

    if match == None:
        print("The message is invalid")
    else:
        message = message.split(":")
        com = message[0]
        mes = message[1]
        result[com] = []
        for i in mes:
            if i.isalnum():
                result[com].append(str(ord(i)))
        for key, value in result.items():
            print(f"{key}:", " ".join(value))


