command = input()

orders = {}
prices = {}
while not command == "buy":

    name_product, price, quantitie = command.split()
    quantitie = int(quantitie)
    price = float(price)

    if name_product not in orders:
        orders[name_product] = 0
        orders[name_product] += quantitie
    else:
        orders[name_product] += quantitie
        prices[name_product] = price
    if name_product not in prices:
        prices[name_product] = 0
        prices[name_product] += price
    command = input()

for product, quantitie in orders.items():
    total_price = quantitie * prices[product]
    print(f'{product} -> {total_price:.2f}')
