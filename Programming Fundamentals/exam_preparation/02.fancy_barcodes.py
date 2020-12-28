import re

pattern = r"^@#+[A-Z][a-zA-Z0-9]{4,}[A-Z]@#+"

barcodes = int(input())

for _ in range(barcodes):
    text = input()
    if re.match(pattern, text):
        digits = re.findall(r"\d", text)
        if digits:
            print(f"Product group: {''.join(digits)}")
            continue
        else:
            print("Product group: 00")
            continue
    print("Invalid barcode")