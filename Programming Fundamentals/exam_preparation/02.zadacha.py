import re

n = int(input())
for i in range(n):
    text = input()
    regex = r"!(?P<command>[A-Z][a-z]{2,})!:\[(?P<message>[A-Za-z]{8,})\]"
    x = re.search(regex, text)
    if x is None:
        print("The message is invalid")
    else:
        command = x.group('command')
        message = x.group('message')
        namelist = [ord(c) for c in message]
        print(f"{command}: " + " ".join(repr(e) for e in namelist))