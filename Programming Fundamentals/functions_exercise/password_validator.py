def is_valid(password):
    lenght = [ch for ch in password]

    not_d = 0
    for ch in password:
        if not ch.isalnum():
            not_d += 1
    if not_d > 0:
        print("Password must consist only of letters and digits")
    if len(lenght) < 6 or len(lenght) > 10:
        print("Password must be between 6 and 10 characters")
    count = 0
    for ch in password:
        if ch.isdigit():
            count += 1
    if count < 2:
        print("Password must have at least 2 digits")
    else:
        print("Password is valid")


password = input()
print(is_valid(password))
