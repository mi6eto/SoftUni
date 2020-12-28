square_meters = float(input())

no_discount_price = float(square_meters * 7.61)
discount = float(0.18 * no_discount_price)
no_discount_price = no_discount_price - discount
print(f"The final price is: {no_discount_price} lv.")
print(f"The discount is: {discount} lv.")