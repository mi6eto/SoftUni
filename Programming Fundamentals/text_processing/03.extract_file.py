text = input().split("\\")

text_list = text[-1]
text_list = text_list.split(".")
file_name = text_list[0]
file_extension = text_list[1]

print(f"File name:", "".join({file_name}))
print(f"File extension:", "".join({file_extension}))
#
# for ch in text[::-1]:
#     if ch == "\\":
#         file_name = text_list
#         break
#
#     text_list.append(ch)
# text = "".join(reversed(text_list))
#
# text = text.split(".")
#
# print(f"File name:", "".join({text[0]}))
# print(f"File extension:", "".join({text[1]}))
