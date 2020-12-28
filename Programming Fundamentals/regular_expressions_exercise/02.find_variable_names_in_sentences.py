import re

text = input()

pattern = r"((?<=^_)|(?<=\s_))[a-zA-Z0-9]+\b"

match_reg = [el.group() for el in re.finditer(pattern, text)]

print(",".join(match_reg))
