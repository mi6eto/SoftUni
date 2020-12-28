version = input().split(".")

version = int("".join(version))
new_version = str(version + 1)

print(".".join(new_version))
